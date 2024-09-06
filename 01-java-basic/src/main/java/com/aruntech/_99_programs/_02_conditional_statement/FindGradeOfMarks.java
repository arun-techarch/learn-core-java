package com.aruntech._99_programs._02_conditional_statement;

import java.util.Scanner;

/**
 * program to find avg and grade of marks
 * given marks = 50, 60, 70, 80, 90
 * avg = sum(marks)/n(no of marks)
 * avg = 50+60+70+80+90/5 = 350/5 = 70
 * grade: the avg lies between avg > 60 so, grade is B
 */
public class FindGradeOfMarks {
    public static void main(String args[]) {
        int[] marks = new int[5];
        int avg=0, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your obtained marks:");

        for(int i=0;i<5;i++){
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        sc.close();
        avg = sum/5;

        System.out.println("Your average is:"+avg);
        if(avg > 80) {
            System.out.println("Your grade is A");
        } else if(avg > 60) {
            System.out.println("Your grade is B");
        } else if(avg > 40) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is D");
        }
    }
}
