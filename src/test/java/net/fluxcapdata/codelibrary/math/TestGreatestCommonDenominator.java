package net.fluxcapdata.codelibrary.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGreatestCommonDenominator {

    @Test
    public void TestGCD0() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, 8172, 128);
            int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, 128, 8172);
            Assertions.assertEquals(4, answer1);
            Assertions.assertEquals(4, answer2);
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(8172, 128);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(128, 8172);
        Assertions.assertEquals(4, answer1);
        Assertions.assertEquals(4, answer2);
    }

    @Test
    public void TestGCD1() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, 100, 10);
            int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, 10, 100);
            Assertions.assertEquals(10, answer1);
            Assertions.assertEquals(10, answer2);
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(100, 10);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(10, 100);
        Assertions.assertEquals(10, answer1);
        Assertions.assertEquals(10, answer2);
    }

    @Test
    public void TestGCD2() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, 100, 99);
            int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, 99, 100);
            Assertions.assertEquals(1, answer1);
            Assertions.assertEquals(1, answer2);
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(100, 99);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(99, 100);
        Assertions.assertEquals(1, answer1);
        Assertions.assertEquals(1, answer2);
    }

    @Test
    public void TestGCD3() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            if (m == GreatestCommonDenominator.Method.SUBTRACTION) {
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, 4, -2));
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, -2, 4));
            } else {
                int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, 4, -2);
                int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, -2, 4);
                Assertions.assertEquals(2, answer1);
                Assertions.assertEquals(2, answer2);
            }
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(4, -2);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(-2, 4);
        Assertions.assertEquals(2, answer1);
        Assertions.assertEquals(2, answer2);
    }

    @Test
    public void TestGCD4() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            if (m == GreatestCommonDenominator.Method.SUBTRACTION) {
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, -4, -2));
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, -2, -4));
            } else {
                int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, -4, -2);
                int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, -2, -4);
                Assertions.assertEquals(2, answer1);
                Assertions.assertEquals(2, answer2);
            }
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(-4, -2);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(-2, -4);
        Assertions.assertEquals(2, answer1);
        Assertions.assertEquals(2, answer2);
    }

    @Test
    public void TestGCD5() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            if (m == GreatestCommonDenominator.Method.SUBTRACTION) {
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, 4, 0));
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, 0, 4));
            } else {
                int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, 4, 0);
                int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, 0, 4);
                Assertions.assertEquals(4, answer1);
                Assertions.assertEquals(4, answer2);
            }
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(4, 0);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(0, 4);
        Assertions.assertEquals(4, answer1);
        Assertions.assertEquals(4, answer2);
    }

    @Test
    public void TestGCD6() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            if (m == GreatestCommonDenominator.Method.SUBTRACTION) {
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, -4, 0));
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, 0, -4));
            } else {
                int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, -4, 0);
                int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, 0, -4);
                Assertions.assertEquals(4, answer1);
                Assertions.assertEquals(4, answer2);
            }
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(-4, 0);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(0, -4);
        Assertions.assertEquals(4, answer1);
        Assertions.assertEquals(4, answer2);
    }

    @Test
    public void TestGCD7() {
        for (GreatestCommonDenominator.Method m : GreatestCommonDenominator.Method.values()) {
            if (m == GreatestCommonDenominator.Method.SUBTRACTION) {
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, Integer.MAX_VALUE, Integer.MIN_VALUE));
                Assertions.assertThrows(RuntimeException.class, () -> GreatestCommonDenominator.greatestCommonDenominator(m, Integer.MIN_VALUE, Integer.MAX_VALUE));
            } else {
                int answer1 = GreatestCommonDenominator.greatestCommonDenominator(m, Integer.MAX_VALUE, Integer.MIN_VALUE);
                int answer2 = GreatestCommonDenominator.greatestCommonDenominator(m, Integer.MIN_VALUE, Integer.MAX_VALUE);
                Assertions.assertEquals(1, answer1);
                Assertions.assertEquals(1, answer2);
            }
        }
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(Integer.MAX_VALUE, Integer.MIN_VALUE);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(Integer.MIN_VALUE, Integer.MAX_VALUE);
        Assertions.assertEquals(1, answer1);
        Assertions.assertEquals(1, answer2);
    }
}
