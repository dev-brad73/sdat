package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {

    @Test
    public void testIsEqual(){
        TimeBrad timeTest = new TimeBrad(0,0,0);
        timeTest.setTime(21,10,59);

        Assertions.assertEquals("21:11:00", String.valueOf(timeTest.nextSecond()));
        // Answer is 21:11:00, so it passes since it equals the 21:11:00 we input as expected
    }

    @Test
    public void testIsNotEqual(){
        TimeBrad timeTest = new TimeBrad(0,0,0);
        timeTest.setTime(10,20,00);

        Assertions.assertNotEquals("10:19:58", String.valueOf(timeTest.previousSecond()));
        // Answer is 10:19:59, so it passes since it does not equal the 10:19:58 we input as unexpected
    }

    @Test
    public void testIsTrue(){
        TimeBrad timeTest = new TimeBrad(0,0,0);
        timeTest.setTime(12,00,00);

        Assertions.assertTrue(timeTest.getHour() == timeTest.nextSecond().getHour());
        // Answer is 12:00:01, so it passes since it is True that the hour of the current time(12)
        // equals the hour of the answer one second from now(12)

        // Assertions.assertTrue(timeTest.getHour() == timeTest.previousSecond().getHour());
        // Answer is 11:59:59, so it would not pass since it is False that the hour of the current time(12)
        // equals the hour of the answer one second before now(11).
    }

}
