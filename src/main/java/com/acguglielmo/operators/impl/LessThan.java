package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor( access = AccessLevel.PRIVATE )
public class LessThan implements Operand<Double, Boolean> {

    private Operand<Double, Double> operand1;

    private Operand<Double, Double> operand2;

    public static LessThan of(
    	final Operand<Double, Double> operand1, final Operand<Double, Double> operand2 ) {

    	return new LessThan( operand1, operand2 );

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
