package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.acguglielmo.operators.Operand;

public class SumTest {

    @Test
    public void testEvaluate() throws Exception {

        final List<Operand<Double, Double>> operands =
        	List.of( Value.of(2.0), Value.of(2.0) );

        final Double result = Sum.of( operands ).evaluate();

        assertEquals(4.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

        final List<Operand<Double, Double>> operands =
            List.of( Value.of(2.0), Value.of(2.0) );

        final String result = Sum.of( operands ).toString();

        assertEquals("( 2.0 + 2.0 )", result);

    }

}
