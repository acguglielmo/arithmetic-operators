package com.acguglielmo.operators.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LessThanTest {

    @Test
    public void testEvaluate() throws Exception {

        final LessThan lessThan = LessThan.of( new Value(2.0), new Value(2.0) );

        final Boolean result = lessThan.evaluate();

        assertFalse(result);

    }

    @Test
    public void testToString() throws Exception {

        final LessThan lessThan = LessThan.of( new Value(2.0), new Value(2.0) );

        final String result = lessThan.toString();

        assertEquals("( 2.0 < 2.0 )", result);

    }

}
