package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaTest {

    @Test
    public void testIsEqual(){
        Area areaTest = new Area();

        Assertions.assertEquals(8, areaTest.threeSided(8,2));
        // Answer is 8 so it passes since it equals the 8 we input as expected
    }

    @Test
    public void testIsNotEqual(){
        Area areaTest = new Area();

        Assertions.assertNotEquals(200, areaTest.circle(8));
        // Answer is 200.96, so it passes since it does not equal the 200 we input as unexpected
    }

    @Test
    public void testIsTrue(){
        Area areaTest = new Area();

        Assertions.assertTrue(areaTest.fourSided(8, 3, 24));
    }
}
