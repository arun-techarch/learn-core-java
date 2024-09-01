package com.aruntech._02_operators;

public class _11_MathAdvanceFunction {
    public static void main(String[] args) {
        /*sometimes we need to create the random number for every time
        program execution*/
        double random = Math.random();
        System.out.println("Random: " + random);
        System.out.println();

        // power and root
        System.out.println("Math Power and Square/Cube Root Function:");
        System.out.println("pow(2,4): " + Math.pow(2, 4));
        System.out.println("sqrt(64): " + Math.sqrt(64));
        System.out.println("cbrt(27): " + Math.cbrt(27));

        // exponential and logarithmic function
        System.out.println("Math Exponential and Logarithmic Function:");
        double x = 32.0;
        System.out.println("exp(32.0): " + Math.exp(x)); // (e^y)
        System.out.println("expm1(32.0): " + Math.expm1(x));
        System.out.println("getExponent(32.0): " + Math.getExponent(x));
        System.out.println("log(32.0): " + Math.log(x)); // log to the base 2
        System.out.println("log10(32.0): " + Math.log10(x)); // log to the base 10
        System.out.println("log1p(32.0): " + Math.log1p(x));
        System.out.println();

        // trigonometry functions
        double y = 20.0;
        System.out.println("Trigonometry Function:");
        System.out.println("sin(20.0): " + Math.sin(y));
        System.out.println("sinh(20.0): " + Math.sinh(y));
        System.out.println("asin(20.0): " + Math.asin(y));
        System.out.println("cos(20.0): " + Math.cos(y));
        System.out.println("cosh(20.0): " + Math.cosh(y));
        System.out.println("acos(20.0): " + Math.acos(y));
        System.out.println("tan(20.0): " + Math.tan(y));
        System.out.println("tanh(20.0): " + Math.tanh(y));
        System.out.println("atan(20.0): " + Math.atan(y));
        System.out.println("atan2(30.0, 20.0): " + Math.atan2(30.0, y));
        System.out.println("toDegrees(0.5): " + Math.toDegrees(0.5));
        System.out.println("toRadians(20.0): " + Math.toRadians(y));
    }
}
