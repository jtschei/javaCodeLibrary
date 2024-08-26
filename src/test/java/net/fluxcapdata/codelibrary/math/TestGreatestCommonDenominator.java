package net.fluxcapdata.codelibrary.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGreatestCommonDenominator {

    @Test
    public void TestGCD1() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(100,10);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(10,100);
        Assertions.assertEquals(10,answer1);
        Assertions.assertEquals(10,answer2);
    }

    @Test
    public void TestGCD2() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(100,99);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(99,100);
        Assertions.assertEquals(1,answer1);
        Assertions.assertEquals(1,answer2);
    }

    @Test
    public void TestGCD3() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(4,-2);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(-2,4);
        Assertions.assertEquals(2,answer1);
        Assertions.assertEquals(2,answer2);
    }

    @Test
    public void TestGCD4() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(-4,-2);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(-2,-4);
        Assertions.assertEquals(2,answer1);
        Assertions.assertEquals(2,answer2);
    }

    @Test
    public void TestGCD5() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(4,0);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(0,4);
        Assertions.assertEquals(4,answer1);
        Assertions.assertEquals(4,answer2);
    }

    @Test
    public void TestGCD6() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(-4,0);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(0,-4);
        Assertions.assertEquals(4,answer1);
        Assertions.assertEquals(4,answer2);
    }

    @Test
    public void TestGCD7() {
        int answer1 = GreatestCommonDenominator.greatestCommonDenominator(Integer.MAX_VALUE,Integer.MIN_VALUE);
        int answer2 = GreatestCommonDenominator.greatestCommonDenominator(Integer.MIN_VALUE,Integer.MAX_VALUE);
        Assertions.assertEquals(1,answer1);
        Assertions.assertEquals(1,answer2);
    }
}
