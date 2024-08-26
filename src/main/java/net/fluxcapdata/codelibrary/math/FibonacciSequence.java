package net.fluxcapdata.codelibrary.math;

import java.security.InvalidParameterException;
import java.util.Map;
import java.util.HashMap;

public class FibonacciSequence {

    private static final Map<Integer,Integer> cache = new HashMap<>();

    public static int fibonacciSequence(int n) {
        if (n < 0) {
            throw new InvalidParameterException("n must be >= 0");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            int answer = fibonacciSequence(n-1) + fibonacciSequence(n-2);
            cache.put(n, answer);
            return answer;
        }
    }
}
