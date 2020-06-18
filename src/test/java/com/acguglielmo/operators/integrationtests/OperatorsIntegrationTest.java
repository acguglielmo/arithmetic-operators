package com.acguglielmo.operators.integrationtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.acguglielmo.operators.Operand;
import com.acguglielmo.operators.impl.Division;
import com.acguglielmo.operators.impl.GreaterThan;
import com.acguglielmo.operators.impl.LessThan;
import com.acguglielmo.operators.impl.Sum;
import com.acguglielmo.operators.impl.Value;

public class OperatorsIntegrationTest {

    @Test
    public void shouldWorkAccordingRequestedInHackerrank() {

        final List<Operand<Double, Double>> sumOperands = new ArrayList<>();
        sumOperands.add( new Value(10.0) );
        sumOperands.add( new Value(5.0) );
        sumOperands.add( new Value(2.0) );

        final Sum sum = new Sum( sumOperands );

        assertEquals(17.0, sum.evaluate(), 0.001);

        final Division div = new Division(new Value(20.0), new Value(10.0));

        assertEquals(2.0, div.evaluate(), 0.001);

        final GreaterThan gt = new GreaterThan(sum, div);

        assertTrue(gt.evaluate());

        final LessThan lt = new LessThan(sum, div);

        assertFalse(lt.evaluate());

        assertEquals( "( ( 10.0 + 5.0 + 2.0 ) > ( 20.0 / 10.0 ) )", gt.toString() );

        assertEquals( "( ( 10.0 + 5.0 + 2.0 ) < ( 20.0 / 10.0 ) )", lt.toString() );

    }

}
