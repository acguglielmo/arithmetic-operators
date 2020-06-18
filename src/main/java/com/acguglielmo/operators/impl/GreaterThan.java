package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GreaterThan implements Operand<Double, Boolean> {

    private Operand<Double, Double> operand1;

    private Operand<Double, Double> operand2;

    @Override
    public Boolean evaluate() {

        return operand1.evaluate()
                .compareTo( operand2.evaluate()) > 0;
    }

    @Override
    public String toString() {

        return "( " + operand1.toString() + " > " + operand2.toString() + " )" ;

    }

}
