package com.acguglielmo.operators.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.acguglielmo.operators.Operand;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Multiplication implements Operand<Double, Double> {

    private List<Operand<Double, Double>> operands;

    @Override
    public Double evaluate() {

        return operands.get(0).evaluate() * operands.get(1).evaluate();

    }

    @Override
    public String toString() {

        return "( " +
                operands.stream()
                    .map( Operand::toString )
                    .collect(Collectors.joining(" * ")) + " )";

    }

}
