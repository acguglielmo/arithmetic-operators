package com.acguglielmo.operators.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.acguglielmo.operators.Operand;

public class Sum implements Operand<Double, Double> {

    private List<Operand<Double, Double>> operands;

    public Sum(List<Operand<Double, Double>> operands) {

        this.operands = operands;

    }

    @Override
    public Double evaluate() {

        return operands.stream()
            .mapToDouble( Operand::evaluate )
            .sum();

    }

    @Override
    public String toString() {

        return "( " +
                operands.stream()
                    .map( Operand::toString )
                    .collect(Collectors.joining(" + ")) + " )";

    }

}
