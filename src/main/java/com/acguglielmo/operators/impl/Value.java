package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

public class Value implements Operand<Double, Double> {

    private final Double value;

    public Value(final Double value) {

        this.value = value;

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
