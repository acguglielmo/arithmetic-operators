package com.acguglielmo.operators.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.acguglielmo.operators.Operand;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor( access = AccessLevel.PRIVATE )
public class Subtraction implements Operand<Double, Double> {

    private List<Operand<Double, Double>> operands;

    public static Subtraction of( final List<Operand<Double, Double>> operands ) {

    	return new Subtraction(operands);

    }

    @Override
    public Double evaluate() {

        return operands.get(0).evaluate() - operands.get(1).evaluate();

    }

    @Override
    public String toString() {

        return "( " +
                operands.stream()
                    .map( Operand::toString )
                    .collect(Collectors.joining(" - ")) + " )";

    }

}
