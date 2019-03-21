#!/bin/bash

for file in tests/*
do
    echo "-=-=-=- Running testfile '${file}' -=-=-=-"
    java -jar bc.jar < ${file}
done