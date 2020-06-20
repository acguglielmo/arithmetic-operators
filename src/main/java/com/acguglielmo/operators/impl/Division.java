package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor( access = AccessLevel.PRIVATE )
public class Division implements Operand<Double, Double> {

    private Operand<Double, Double> dividend;

    private Operand<Double, Double> divisor;

    public static Division of(final Operand<Double, Double> dividend, final Operand<Double, Double> divisor) {
    	
    	return new Division(dividend, divisor);
    	
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
