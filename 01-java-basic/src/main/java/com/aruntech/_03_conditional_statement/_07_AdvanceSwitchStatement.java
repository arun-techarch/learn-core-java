package com.aruntech._03_conditional_statement;

import java.util.Scanner;

/**
 * java 12 introduced enhancement of switch statement
 * syntax:
 * var result = switch (expression) {
 *     case value1 -> expression1;
 *     case value2 -> expression2;
 *     default -> expression3;
 * };
 *
 * Java 17 introduces pattern matching switch statement which allowing to match
 * complex datatype like record, class etc.
 *
 * handle the null cases directly
 * type inference of choices
 * enhanced type safety
 */

enum Color {
    RED, GREEN, BLUE
}

public class _07_AdvanceSwitchStatement {
    public static void main(String[] args) {
        System.out.println("Advance Switch Statement");

        System.out.println("Switch Enum Choice:");
        Color color = Color.RED;
        switch (color) {
            case RED:
                System.out.println("The color is red.");
                break;
            case GREEN:
                System.out.println("The color is green.");
                break;
            case BLUE:
                System.out.println("The color is blue.");
                break;
            default:
                System.out.println("Invalid color.");
        }
        System.out.println();

        System.out.println("Switch Enhanced Expression:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a month: ");
        var month = sc.next();
        var season = switch (month) {
            case "December", "January", "February" -> "Winter Season!";
            case "March", "April", "May" -> "Summer Season!";
            case "June", "July", "August", "September" -> "Spring Season!";
            case "October", "November" -> "Autumn Season!";
            default -> "Invalid Season";
        };
        System.out.println("Season: " + season);
    }
}
