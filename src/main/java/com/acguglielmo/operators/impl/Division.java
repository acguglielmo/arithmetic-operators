package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Division implements Operand<Double, Double> {

    private Operand<Double, Double> dividend;

    private Operand<Double, Double> divisor;

    @Override
    public Double evaluate() {

        return dividend.evaluate() / divisor.evaluate();

    }

    @Override
    public String toString() {

        return "( " + dividend.toString() + " / " + divisor.toString() + " )";

    }

}
