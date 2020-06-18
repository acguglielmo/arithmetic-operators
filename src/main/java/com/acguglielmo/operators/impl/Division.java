package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

public class Division implements Operand<Double, Double> {

    private Operand<Double, Double> dividend;

    private Operand<Double, Double> divisor;

    public Division( Operand<Double, Double> operand1, Operand<Double, Double> operand2 ) {

        this.dividend = operand1;

        this.divisor = operand2;

    }

    @Override
    public Double evaluate() {

        return dividend.evaluate() / divisor.evaluate();

    }

    @Override
    public String toString() {

        return "( " + dividend.toString() + " / " + divisor.toString() + " )";

    }

}
