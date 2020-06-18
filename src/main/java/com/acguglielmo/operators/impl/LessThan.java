package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.AbstractOperand;
import com.acguglielmo.operators.Operand;

public class LessThan extends AbstractOperand<Double, Boolean> {

    private Operand<Double, Double> operand1;

    private Operand<Double, Double> operand2;

    public LessThan( Operand<Double, Double> operand1, Operand<Double, Double> operand2 ) {

        this.operand1 = operand1;

        this.operand2 = operand2;

    }

    @Override
    public Boolean evaluate() {

        return operand1.evaluate()
                .compareTo( operand2.evaluate()) < 0;
    }

    @Override
    public String toString() {

        return "( " + operand1.toString() + " < " + operand2.toString() + " )" ;

    }

}
