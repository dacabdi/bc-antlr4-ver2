package bc;

import java.lang.*;
import java.util.*;
import java.math.*;
import ch.obermuhlner.math.big.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.*;

import bc.bcBaseVisitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends bcBaseVisitor<BigDecimal>
{
    public HashMap<String, BigDecimal> globals = new HashMap<String, BigDecimal>();
    public bcParser parser;

    private final BigDecimal zero = new BigDecimal("0");
    private final BigDecimal one  = new BigDecimal("1");

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

    public BigDecimal retrieveGlobal(String varId)
    {
        if( globals.get(varId) == null )
            globals.put(varId, new BigDecimal(0.0));
        
        return globals.get(varId);
    }

    public void setGlobal(String varId, BigDecimal value)
    {
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
        String varId = ctx.varid.getText();
        BigDecimal value = this.visit(ctx.b);

        if( globals.get(varId) == null )
            globals.put(varId, new BigDecimal(0.0));

        globals.put(varId, value);

        return globals.get(varId);
    }

    @Override
    public BigDecimal visitPAssignExpr(bcParser.PAssignExprContext ctx)
    {
        BigDecimal operand = this.visit(ctx.b);
        String varId = ctx.varid.getText();
        char prefix = ctx.op.getText().charAt(0);
        int tokenType = parser.getTokenType("'" + prefix + "'");

        BigDecimal newValue = infixOperation(retrieveGlobal(varId), operand, tokenType);
        setGlobal(varId, newValue);

        return newValue;
    }

    @Override
    public BigDecimal visitNumber(bcParser.NumberContext ctx) 
    { 
        return new BigDecimal(ctx.getText());
    }

    @Override
    public BigDecimal visitNameExpr(bcParser.NameExprContext ctx)
    {
        return retrieveGlobal(ctx.varid.getText());
    }

    @Override
    public BigDecimal visitFunctionCallExpr(bcParser.FunctionCallExprContext ctx)
    {
        
        return zero;//return retrieveGlobal(ctx.varid.getText());
    }
}