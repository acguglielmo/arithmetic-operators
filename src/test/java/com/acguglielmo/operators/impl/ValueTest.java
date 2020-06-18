package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValueTest {

    @Test
    public void testEvaluate() throws Exception {

        final Double result = new Value(5.0).evaluate();

        assertEquals(5.0, result, 0.01);

    }

    @Test
    public void testToString() throws Exception {

        final String result = new Value(5.0).toString();

        assertEquals("5.0", result);

    }

}
