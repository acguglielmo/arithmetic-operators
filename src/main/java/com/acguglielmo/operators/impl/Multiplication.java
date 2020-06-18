package com.acguglielmo.operators.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.acguglielmo.operators.AbstractOperand;
import com.acguglielmo.operators.Operand;

public class Multiplication extends AbstractOperand<Double, Double> {

    private List<Operand<Double, Double>> operands;

    public Multiplication(List<Operand<Double, Double>> operands) {

        this.operands = operands;

    }

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
