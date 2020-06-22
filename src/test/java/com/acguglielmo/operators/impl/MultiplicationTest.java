package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.acguglielmo.operators.Operand;

public class MultiplicationTest {

    @Test
    public void testEvaluate() throws Exception {

    	final List<Operand<Double, Double>> operands =
    		List.of( Value.of(2.0), Value.of(6.0) );

        final Double result = Multiplication.of(operands).evaluate();

        assertEquals(12.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

    	final List<Operand<Double, Double>> operands =
        	List.of( Value.of(6.0), Value.of(2.0) );

        final String result = Multiplication.of(operands).toString();

        assertEquals("( 6.0 * 2.0 )", result);

    }

}
