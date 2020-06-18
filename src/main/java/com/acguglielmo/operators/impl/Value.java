package com.acguglielmo.operators.impl;

import com.acguglielmo.operators.Operand;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Value implements Operand<Double, Double> {

    private final Double value;

    @Override
    public Double evaluate() {

        return value;

    }

    @Override
    public String toString() {

        return value.toString();

    }

}
