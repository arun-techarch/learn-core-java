package com.aruntech.quality;

import java.util.List;
import java.util.ArrayList;

public class Calculator {

    public Calculator() {
        System.out.println("Initializing the application"); // it will complaint in code-quality
    }

    public void m1() {
        String s = ""; // variable not used anywhere
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        //numbers = null; // collection is set tp null
        numbers.add(2);

        Object obj = getData(); // this method will return null value
        if(obj != null) {
            System.out.println(obj.toString());
        }
    }

    public Object getData() {
        return null;
    }

    public int calculate(int a, int b, ArithmeticOperation op) {
        if(op == ArithmeticOperation.ADD) {
            return a + b;
        } else if(op == ArithmeticOperation.SUBTRACT) {
            return a - b;
        } else if(op == ArithmeticOperation.MULTIPLY) {
            return a * b;
        } else {
            if (b == 0) {
                throw new ArithmeticException("divide by zero error");
            }
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!!");
        Calculator calculator = new Calculator();
        calculator.m1();

        int a = 20;
        int b = 5;
        System.out.printf("%d + %d = %d\n", a, b, calculator.calculate(a, b, ArithmeticOperation.ADD));
        System.out.printf("%d - %d = %d\n", a, b, calculator.calculate(a, b, ArithmeticOperation.SUBTRACT));
        System.out.printf("%d * %d = %d\n", a, b, calculator.calculate(a, b, ArithmeticOperation.MULTIPLY));
        System.out.printf("%d / %d = %d", a, b, calculator.calculate(a, b, ArithmeticOperation.DIVISION));
    }
}
