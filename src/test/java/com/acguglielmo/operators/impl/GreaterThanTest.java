package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class GreaterThanTest {

    @Test
    public void testEvaluate() throws Exception {

        final GreaterThan greaterThan = GreaterThan.of( new Value(2.0), new Value(2.0) );

        final Boolean result = greaterThan.evaluate();

        assertFalse(result);

    }

    @Test
    public void testToString() throws Exception {

        final GreaterThan greaterThan = GreaterThan.of(new Value(2.0), new Value(2.0));

        final String result = greaterThan.toString();

        assertEquals("( 2.0 > 2.0 )", result);

    }

}
