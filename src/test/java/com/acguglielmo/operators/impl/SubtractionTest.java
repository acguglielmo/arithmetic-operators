package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.acguglielmo.operators.Operand;

public class SubtractionTest {

    @Test
    public void testEvaluate() throws Exception {

        final List<Operand<Double, Double>> operands = new ArrayList<>();
        operands.add( new Value(2.0) );
        operands.add( new Value(2.0) );

        final Double result = new Subtraction(operands).evaluate();

        assertEquals(0.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

        final List<Operand<Double, Double>> operands = new ArrayList<>();
        operands.add( new Value(2.0) );
        operands.add( new Value(2.0) );

        final String result = new Subtraction(operands).toString();

        assertEquals("( 2.0 - 2.0 )", result);

    }

}
