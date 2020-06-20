package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.acguglielmo.operators.Operand;

public class SubtractionTest {

    @Test
    public void testEvaluate() throws Exception {

    	final List<Operand<Double, Double>> operands =
    		List.of( new Value(2.0), new Value(2.0) );

        final Double result = Subtraction.of(operands).evaluate();

        assertEquals(0.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

    	final List<Operand<Double, Double>> operands =
        	List.of( new Value(2.0), new Value(2.0) );

        final String result = Subtraction.of(operands).toString();

        assertEquals("( 2.0 - 2.0 )", result);

    }

}
