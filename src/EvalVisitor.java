package bc;

import java.lang.*;
import java.util.*;
import java.math.*;
import ch.obermuhlner.math.big.*;
import org.apache.commons.lang3.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import bc.bcBaseVisitor;
import bc.bcParser.VarnameContext;

public class EvalVisitor extends bcBaseVisitor<BigDecimal>
{
    public HashMap<String, BigDecimal> globals = new HashMap<String, BigDecimal>();
    public Stack<HashMap<String, BigDecimal>> contexts = new Stack<HashMap<String, BigDecimal>>();
    public HashMap<String, bcParser.DefineStatContext> functions = new HashMap<String, bcParser.DefineStatContext>();

    public bcParser parser;

    private final BigDecimal zero = new BigDecimal("0");
    private final BigDecimal one  = new BigDecimal("1");

    private final MathContext mathContext = new MathContext(100); // arbitrary value!

    private BigDecimal functionReturnValue = zero;

    public EvalVisitor(bcParser parser)
    {
        super();
        this.parser = parser;
    }

    public BigDecimal infixOperation(BigDecimal a, BigDecimal b, int tokenType)
    {
        BigDecimal returnVal = null;

        switch(tokenType)
        {
            case bcParser.POW : 
                returnVal = a.pow(b.intValue());
            break;

            case bcParser.MULT : 
                returnVal = a.multiply(b);
            break;

            case bcParser.DIV : 
                returnVal = a.divide(b);
            break;

            case bcParser.MOD : 
                returnVal = a.remainder(b);
            break;

            case bcParser.ADD : 
                returnVal = a.add(b);
            break;

            case bcParser.MIN : 
                returnVal = a.subtract(b);
            break;

            case bcParser.LT : 
                returnVal = a.compareTo(b) == -1 ? one : zero;
            break;

            case bcParser.GT : 
                returnVal = a.compareTo(b) ==  1 ? one : zero;
            break;

            case bcParser.LTEQ : 
                returnVal = a.compareTo(b) <=  0 ? one : zero;
            break;

            case bcParser.GTEQ : 
                returnVal = a.compareTo(b) >=  0 ? one : zero;
            break;

            case bcParser.EQ : 
                returnVal = a.equals(b) ? one  : zero;
            break;

            case bcParser.NEQ : 
                returnVal = a.equals(b) ? zero : one;
            break;

            case bcParser.AND : 
                returnVal = (a.equals(zero) || b.equals(zero)) ? zero : one;
            break;

            case bcParser.OR : 
                returnVal = (a.equals(zero) && b.equals(zero)) ? zero : one;
            break;
        }

        return returnVal;
    }

    public BigDecimal retrieveVariable(String varId)
    {
        if(!contexts.isEmpty() && contexts.peek().get(varId) != null)
            return contexts.peek().get(varId);

        if( globals.get(varId) == null )
            globals.put(varId, new BigDecimal(0.0));

        return globals.get(varId);
    }

    public void setVariable(String varId, BigDecimal value)
    {
        if(!contexts.isEmpty() && contexts.peek().get(varId) != null)
            contexts.peek().put(varId, value);
        else
            globals.put(varId, value);
    }

    @Override 
    public BigDecimal visitInfixExpr(bcParser.InfixExprContext ctx)
    {
        BigDecimal returnVal = null;
        BigDecimal a = this.visit(ctx.a);
        BigDecimal b = this.visit(ctx.b);

        return infixOperation(a, b, ctx.op.getType());
    }

    @Override 
    public BigDecimal visitUnaryOpExpr(bcParser.UnaryOpExprContext ctx)
    {
        BigDecimal returnVal = null;
        BigDecimal a = this.visit(ctx.a);

        switch(ctx.op.getType())
        {
            case bcParser.NOT : 
                returnVal = a.equals(zero) ? one : zero;
            break;

            case bcParser.MIN : 
                returnVal = a.negate();;
            break;
        }

        return returnVal;
    }

    @Override
    public BigDecimal visitAssignExpr(bcParser.AssignExprContext ctx)
    {
        String varId = null;

        if (ctx.varid instanceof bcParser.ArrayExprContext)
        {
            String name = ((bcParser.ArrayExprContext)ctx.varid).name.getText();
            String index = BigDecimalMath.integralPart(this.visit(((bcParser.ArrayExprContext)ctx.varid).index)).toString();
            varId = name + "[" + index + "]";
        }
        else
        {
            varId = ctx.varid.getText();
        }

        BigDecimal value = this.visit(ctx.b);

        //System.out.println("var assigment:" + varId);

        setVariable(varId, value);

        return null;
    }

    @Override
    public BigDecimal visitPAssignExpr(bcParser.PAssignExprContext ctx)
    {
        String varId = null;

        if (ctx.varid instanceof bcParser.ArrayExprContext)
        {
            String name = ((bcParser.ArrayExprContext)ctx.varid).name.getText();
            String index = BigDecimalMath.integralPart(this.visit(((bcParser.ArrayExprContext)ctx.varid).index)).toString();
            varId = name + "[" + index + "]";
        }
        else
        {
            varId = ctx.varid.getText();
        }

        BigDecimal operand = this.visit(ctx.b);
        char prefix = ctx.op.getText().charAt(0);
        int tokenType = parser.getTokenType("'" + prefix + "'");

        BigDecimal newValue = infixOperation(retrieveVariable(varId), operand, tokenType);
        setVariable(varId, newValue);

        return null;
    }

    @Override
    public BigDecimal visitNumber(bcParser.NumberContext ctx) 
    {
        return new BigDecimal(ctx.getText());
    }

    @Override
    public BigDecimal visitNameExpr(bcParser.NameExprContext ctx)
    {
        return retrieveVariable(ctx.name.getText());
    }

    @Override
    public BigDecimal visitFunctionCallExpr(bcParser.FunctionCallExprContext ctx)
    {
        BigDecimal returnVal = null;

        switch(ctx.funct.getType())
        {
            case bcParser.SQRT : returnVal = BigDecimalMath.sqrt(this.visit(ctx.arg), mathContext); break;
            case bcParser.SINE : returnVal = BigDecimalMath.sin (this.visit(ctx.arg), mathContext); break;
            case bcParser.COSI : returnVal = BigDecimalMath.cos (this.visit(ctx.arg), mathContext); break;
            case bcParser.NLOG : returnVal = BigDecimalMath.log (this.visit(ctx.arg), mathContext); break;
            case bcParser.EXPE : returnVal = BigDecimalMath.exp (this.visit(ctx.arg), mathContext); break;
            // TODO case "read"
            case bcParser.NAME : // defined function

                // get the function
                String functionName = ctx.funct.getText();
                bcParser.DefineStatContext fCtx = functions.get(functionName);
                
                // check if function is defined
                if(fCtx == null) 
                    throw new RuntimeException("Function " + functionName + " not defined.");

                // create function context scope
                HashMap<String, BigDecimal> currentContext = new HashMap<String, BigDecimal>();
                
                // parameters
                List<String> params = Arrays.asList(fCtx.params.getText().split(","));
                List<BigDecimal> arguments = new ArrayList<BigDecimal>();

                // evaluate arguments
                for (bcParser.ExprContext expr : ctx.expr())
                    arguments.add(this.visit(expr));

                // check number of parameters vs arguments
                if(params.size() != arguments.size())
                    throw new RuntimeException("Parameter number mismatch");

                // put arguments in context
                for (int i = 0; i < params.size(); ++i)
                    currentContext.put(params.get(i), arguments.get(i));

                // get local variables
                if(fCtx.autoList != null)
                {
                    List<String> autoVars = Arrays.asList(fCtx.autoList.getText().split(","));

                    for (String var : autoVars)
                        currentContext.put(var, new BigDecimal("0"));
                }

                // activate context
                contexts.push(currentContext);
                
                // reset return value
                functionReturnValue = zero;

                // call function
                this.visit(fCtx.body);

                returnVal = functionReturnValue;

                // eliminate context
                contexts.pop();
                
            break;
        }

        return returnVal;
    }

    @Override
    public BigDecimal visitDefineStat(bcParser.DefineStatContext ctx)
    {
        functions.put(ctx.name.getText(), ctx);

        return null;
    }

    @Override
    public BigDecimal visitIfElseStat(bcParser.IfElseStatContext ctx)
    {
        BigDecimal conditionResult = this.visit(ctx.condition);
        if(conditionResult.equals(one))
            this.visit(ctx.if_block);
        else if (ctx.else_block != null)
            this.visit(ctx.else_block);

        return null;
    }

    @Override
    public BigDecimal visitWhileStat(bcParser.WhileStatContext ctx)
    {
        while(one.equals(this.visit(ctx.condition)))
        {
            if (ctx.body != null)
                this.visit(ctx.body);
        }

        return null;
    }

    @Override
    public BigDecimal visitForStat(bcParser.ForStatContext ctx)
    {
        if(ctx.init != null)
            this.visit(ctx.init);
        
        while(one.equals(this.visit(ctx.condition)))
        {
            if (ctx.body != null)
                this.visit(ctx.body);
            
            if (ctx.maintenance != null)
                this.visit(ctx.maintenance);
        }

        return null;
    }

    @Override
    public BigDecimal visitReturnStat(bcParser.ReturnStatContext ctx)
    {
        functionReturnValue = this.visit(ctx.value);
        
        return null;
    }

    @Override
    public BigDecimal visitQuitStat(bcParser.QuitStatContext ctx)
    {
        System.exit(0);
        return null;
    }

    @Override
    public BigDecimal visitPrintStat(bcParser.PrintStatContext ctx)
    {
        // evaluate arguments
        for (bcParser.List_itemContext item : ctx.list_item()) 
        {
            
            if( item.expr() != null )
                System.out.print(StringEscapeUtils.unescapeJava(this.visit(item).toString()));
            else
            {
                String str = item.getText().toString();
                str = str.substring(1, str.length() - 1);
                System.out.print(StringEscapeUtils.unescapeJava(str));
            }
        }
            
        return null;
    }

    @Override
    public BigDecimal visitExprStat(bcParser.ExprStatContext ctx)
    {
        BigDecimal returnVal = this.visit(ctx.value);

        if(returnVal != null)
            System.out.println(returnVal);

        return returnVal;
    }

    @Override
    public BigDecimal visitPreIncdecExpr(bcParser.PreIncdecExprContext ctx)
    {
        String varId = null;

        if (ctx.varid instanceof bcParser.ArrayExprContext)
        {
            String name = ((bcParser.ArrayExprContext)ctx.varid).name.getText();
            String index = BigDecimalMath.integralPart(this.visit(((bcParser.ArrayExprContext)ctx.varid).index)).toString();
            varId = name + "[" + index + "]";
        }
        else
        {
            varId = ctx.varid.getText();
        }

        switch(ctx.op.getType())
        {
            case bcParser.INC:

                setVariable(varId, retrieveVariable(varId).add(one));

            break;

            case bcParser.DEC:

                setVariable(varId, retrieveVariable(varId).add(one.negate()));

            break;
        }

        
        return retrieveVariable(varId);
    }

    @Override
    public BigDecimal visitPostIncdecExpr(bcParser.PostIncdecExprContext ctx)
    {
        String varId = null;

        if (ctx.varid instanceof bcParser.ArrayExprContext)
        {
            String name = ((bcParser.ArrayExprContext)ctx.varid).name.getText();
            String index = BigDecimalMath.integralPart(this.visit(((bcParser.ArrayExprContext)ctx.varid).index)).toString();
            varId = name + "[" + index + "]";
        }
        else
        {
            varId = ctx.varid.getText();
        }

        BigDecimal oldValue = retrieveVariable(varId);

        switch(ctx.op.getType())
        {
            case bcParser.INC:

                setVariable(varId, oldValue.add(one));

            break;

            case bcParser.DEC:

                setVariable(varId, oldValue.add(one.negate()));

            break;
        }

        return oldValue;
    }

    @Override
    public BigDecimal visitArrayExpr(bcParser.ArrayExprContext ctx)
    {
        String name = ctx.name.getText();
        BigDecimal index = this.visit(ctx.index);
        String stringIndex = name + "[" + BigDecimalMath.integralPart(index).toString() + "]";

        //System.out.println(stringIndex);
        //System.out.println(Arrays.asList(globals)); // method 1

        return retrieveVariable(name + "[" + BigDecimalMath.integralPart(index).toString() + "]");
    }

    @Override
    public BigDecimal visitParenthesizedExpr(bcParser.ParenthesizedExprContext ctx)
    {
        return this.visit(ctx.value);
    }
}