package Question3;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NTargetsTest {
    @Test
    public void testMaxPoints() {
        int[] targets = {3, 1, 5, 8};
        int expectedMaxPoints = 167;

        int result = MaxPointsFromShootingTargets.maxPoints(targets);
        assertEquals(expectedMaxPoints, result);
    }