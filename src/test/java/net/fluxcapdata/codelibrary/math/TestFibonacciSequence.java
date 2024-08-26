package net.fluxcapdata.codelibrary.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class TestFibonacciSequence {

    @Test
    public void TestFibonacci0() {
        try {
            FibonacciSequence.fibonacciSequence(-1);
            Assertions.fail();
        } catch (InvalidParameterException e) {
            Assertions.assertTrue(true);
        }
    }

    @Test
    public void TestFibonacci1() {
        Assertions.assertEquals(0, FibonacciSequence.fibonacciSequence(0));
        Assertions.assertEquals(1, FibonacciSequence.fibonacciSequence(1));
        Assertions.assertEquals(1, FibonacciSequence.fibonacciSequence(2));
        Assertions.assertEquals(2, FibonacciSequence.fibonacciSequence(3));
        Assertions.assertEquals(3, FibonacciSequence.fibonacciSequence(4));
        Assertions.assertEquals(5, FibonacciSequence.fibonacciSequence(5));
        Assertions.assertEquals(8, FibonacciSequence.fibonacciSequence(6));
        Assertions.assertEquals(13, FibonacciSequence.fibonacciSequence(7));
        Assertions.assertEquals(21, FibonacciSequence.fibonacciSequence(8));
        Assertions.assertEquals(34, FibonacciSequence.fibonacciSequence(9));
    }

    @Test
    public void TestFibonacci2() {
        Assertions.assertEquals(6765, FibonacciSequence.fibonacciSequence(20));
        Assertions.assertEquals(102334155, FibonacciSequence.fibonacciSequence(40));
    }
}
