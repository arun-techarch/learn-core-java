package com.aruntech._02_operators;

/**
 * math class contains all function which is used to perform all
 * mathematical calculations and has some math constant and logarithmic operation
 */
public class _10_MathBasicFunction {
    public static void main(String[] args) {
        System.out.println("Math Class");
        // constant
        System.out.println("Math Constants:");
        System.out.println("PI: " + Math.PI); // 3.14159..
        System.out.println("E: " + Math.E);  // 2.71828
        System.out.println();

        // arithmetic function
        System.out.println("Math Arithmetic Function:");
        System.out.println("decrementExact(5): " + Math.decrementExact(5));
        System.out.println("incrementExact(10): " + Math.incrementExact(10));
        System.out.println("addExact(10, 20): " + Math.addExact(10, 20));
        System.out.println("subtractExact(20, 5): " + Math.subtractExact(20, 5));
        System.out.println("multiplyExact(3, 2): " + Math.multiplyExact(3, 2));
        System.out.println("multiplyFull(6, 3): " + Math.multiplyFull(6, 3));
        System.out.println("multiplyHigh(6, 4): " + Math.multiplyHigh(6, 3));
        System.out.println("floorDiv(13, 2): " + Math.floorDiv(13, 2));
        System.out.println("floorMod(14, 5): " + Math.floorMod(14, 5));
        System.out.println("negateExact(12): " + Math.negateExact(12));
        System.out.println("nextDown(20.25): " + Math.nextDown(20.25));
        System.out.println("nextUp(20.25): " + Math.nextUp(20.25));
        System.out.println("nextAfter(20.25, 5): " + Math.nextAfter(20.25, 5));

        //(a*b)+c = (20.0*10.0)+15.0 = 200.0+15.0 = 215.0
        System.out.println("fma(20.0f, 10.0f, 15.0f): " + Math.fma(20.0f, 10.0f, 15.0f));
        //fx2^sacle factor  20.25 *(2^2) = 20.25 * 4 = 81.0
        System.out.println("scalb(20.25, 2): " + Math.scalb(20.25, 2));
        //0 if value = 0 1 if value > 0 -1 if value < 0
        System.out.println("signum(25.50): " + Math.signum(25.50));
        System.out.println("max(25, 15): " + Math.max(25, 15));
        System.out.println("min(25, 15): " + Math.min(25, 15));
        System.out.println();

        // absolute and round function
        System.out.println("Math Absolute and Round Function:");
        double x = 32.7615634298;
        int y = 132500;
        System.out.println("abs(32.7615634298): " + Math.abs(x));
        System.out.println("absExact(132500): " + Math.absExact(y));
        // smallest integer greater than or equal to the value x
        System.out.println("ceil(32.7615634298): " + Math.ceil(x));
        // largest integer less than or equal to the value x
        System.out.println("floor(32.7615634298): " + Math.floor(x));
        System.out.println("round(32.7615634298): " + Math.round(x));
        System.out.println("rint(32.7615634298): " + Math.rint(x));
    }
}
