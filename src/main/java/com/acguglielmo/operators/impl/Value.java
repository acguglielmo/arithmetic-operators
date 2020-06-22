package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor( access = AccessLevel.PRIVATE )
public class Value implements Operand<Double, Double> {

    private final Double value;

    public static Value of( final Double value ) {

    	return new Value( value );

    }

    @Override
    public Double evaluate() {

        return value;

    }

    @Override
    public String toString() {

        return value.toString();

    }

}
