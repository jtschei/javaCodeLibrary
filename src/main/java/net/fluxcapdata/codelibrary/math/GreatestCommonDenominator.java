package net.fluxcapdata.codelibrary.math;

public class GreatestCommonDenominator {

    public enum Method {
        DIVISION,
        SUBTRACTION,
        RECURSION
    }

    public static int greatestCommonDenominator(int a, int b) {
        return greatestCommonDenominator(Method.DIVISION, a, b);
    }

    public static int greatestCommonDenominator(Method method, int a, int b) {
        return switch (method) {
            case DIVISION -> gcdDivide(a, b);
            case SUBTRACTION -> gcdSubtract(a, b);
            case RECURSION -> gcdRecurse(a, b);
        };
    }

    private static int gcdDivide(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }

    private static int gcdSubtract(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new RuntimeException("Inputs must be positive");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return Math.abs(a);
    }

    private static int gcdRecurse(int a, int b) {
        if (b==0) {
            return Math.abs(a);
        } else {
            return gcdRecurse(b, a % b);
        }
    }
}
