package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.acguglielmo.operators.Operand;

public class MultiplicationTest {

    @Test
    public void testEvaluate() throws Exception {

        final List<Operand<Double, Double>> operands = new ArrayList<>();
        operands.add( new Value(2.0) );
        operands.add( new Value(6.0) );

        final Double result = new Multiplication(operands).evaluate();

        assertEquals(12.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

        final List<Operand<Double, Double>> operands = new ArrayList<>();
        operands.add( new Value(6.0) );
        operands.add( new Value(2.0) );

        final String result = new Multiplication(operands).toString();

        assertEquals("( 6.0 * 2.0 )", result);

    }

}
