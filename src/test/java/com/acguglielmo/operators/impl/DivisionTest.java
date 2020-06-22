package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivisionTest {

    @Test
    public void testEvaluate() throws Exception {

        final Division division =  Division.of( Value.of(2.0), Value.of(2.0) );

        final Double result = division.evaluate();

        assertEquals(1.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

        final Division division = Division.of( Value.of(2.0), Value.of(2.0) );

        final String result = division.toString();

        assertEquals("( 2.0 / 2.0 )", result);

    }

}
