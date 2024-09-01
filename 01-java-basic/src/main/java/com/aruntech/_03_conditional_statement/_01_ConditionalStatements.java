package com.aruntech._03_conditional_statement;

/**
 * conditional statements are essential programming constructs that allow your code
 * to make decisions and execute different blocks of code based on specific conditions.
 * conditional statements are
 *   - if statement
 *   - switch statement
 *   - branching statement
 *      - break: terminates the innermost switch, for, while, or do-while statement
 *      - continue: skips the current iteration of a for, while , or do-while loop
 *
 * if condition used to perform different set of condition
 * switch statement used to perform same set of choices
 */
public class _01_ConditionalStatements {
    public static void main(String[] args) {

        // basic if statement
        int a = 10;
        if(a > 10) {
            System.out.println("a is less than 10");
        } else {
            System.out.println(" a is less than or equal to 10");
        }

        //basic switch statement
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
