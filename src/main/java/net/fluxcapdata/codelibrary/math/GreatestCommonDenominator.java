package net.fluxcapdata.codelibrary.math;

public class GreatestCommonDenominator {

    public static int greatestCommonDenominator(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }
}
