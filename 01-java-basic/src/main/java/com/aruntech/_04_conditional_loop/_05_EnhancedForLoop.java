package com.aruntech._04_conditional_loop;

import java.util.Arrays;
import java.util.List;

/**
 * the enhanced for loop, also known as the for-each loop, is a simplified way to
 * iterate over elements in arrays and collections in Java. It eliminates the need
 * to manually manage an index variable, making your code more concise and readable
 *
 * syntax:
 * for (dataType element : collection) {
 *     // code to be executed for each element
 * }
 *
 * it was introduced in Java 5.
 */
public class _05_EnhancedForLoop {
    public static void main(String[] args) {
        System.out.println("Enhanced For Loop");

        // using int array
        int[] numbers = { 1, 2, 3, 4, 5};
        for(int num:numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // using char array
        char[] letters = { 'A', 'B', 'C', 'D', 'E'};
        for(char ch:letters) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // using list collection
        List<String> fruits = Arrays.asList("Apple", "Orange", "Grapes", "Banana");
        for(String fruit:fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        List<String> cars = List.of("BMW", "Audi", "BYD", "Kia", "MG");
        for(String car:cars) {
            System.out.print(car + " ");
        }
        System.out.println();

        // var keyword used for type inference introduced in Java 10
        var values = Arrays.asList(1, 2, 3, 4, 5);
        for(int value:values) {
            System.out.print((value * value) + " ");
        }
    }
}
