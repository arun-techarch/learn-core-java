package com.aruntech._03_conditional_statement;

import java.util.Scanner;

/**
 * switch statement is used to evaluate the expression from group of choices.
 * syntax:
 * switch(choice){
 *     case option:
 *        statement;
 *        break;
 *     .............
 *     default:
 *       statement;
 * }
 *
 * do not forget to add break statement else every choice evaluated.
 * we can combine more than once choice which execute same set of statement
 * default is optional, and it will be executed none of the choices matched
 * use yield statement to return value from switch statement
 * the arrow syntax(->) is used to associate case label with its expression
 *
 * switch choice can be int, char, string, complex type(enum, record or class type)
 * switch doesn't support for long, float and double
 * switch may have case without any condition
 */
public class _06_SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Switch Statement");
        Scanner sc = new Scanner(System.in);

        System.out.println("Switch Integer Choice:");
        System.out.print("Enter season(1-4): ");
        int season = sc.nextInt();
        switch (season){
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Fall");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid season");
                break;
        }
        System.out.println();

        System.out.println("Switch Character Choice:");
        System.out.print("Enter color(r,g,b,y): ");
        char color = sc.next().charAt(0);
        switch (color) {
            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'y':
                System.out.println("Yellow");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
        System.out.println();

        System.out.println("Switch String Choice:");
        System.out.print("Enter day(Mon, Tue, Wed, Thu, Fri, Sat, Sun): ");
        String dayOfWeek = sc.next();
        switch (dayOfWeek) {
            case "Mon", "Tue","Wed", "Thu", "Fri":
                System.out.println("Go to office for work!");
                break;
            case "Sat", "Sun":
                System.out.println("Enjoy the weekend!!");
                break;
            default:
                System.out.println("Invalid days of week!");
        }
    }
}
