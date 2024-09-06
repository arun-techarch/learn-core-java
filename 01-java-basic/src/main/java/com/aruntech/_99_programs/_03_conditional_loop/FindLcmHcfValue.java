package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find HCF and LCM of two numbers
 * e.g: x,y: 2 8 then HCF: 2, LCM: 8
 */

public class FindLcmHcfValue {
    static void findLcmHcf(int x, int y) {
        int a, b, t, hcf, lcm;
        a = x;
        b = y;

        while(b != 0){
            t = b;
            b = a%b;
            a = t;
        }

        hcf = a;
        lcm = (x*y)/hcf;
        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }

    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers(x,y):");
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        if(x < 0 || y < 0) {
            System.out.println("Invalid input!!");
        } else {
            findLcmHcf(x, y);
        }
    }
}
