package com.aruntech._99_programs._03_conditional_loop;

import java.util.Scanner;

/**
 * program to find the even number permutation of given digits
 * permutation by using shift the 1st digit to the last digit
 * even numbers are 2, 4, 6, 8 if it is >=10 then start from 2.
 * e.g: n=4 then permutations are 2468 4682 6824 8246
 *      n=6 then permutations are 246824 468242 682424 824246 242468 424682
 */
public class FindEvenNumberPermutation {
    public static int getEvenNumber(int n) {
        String str = "";
        int i = 1;
        int count = 1;
        while(count <= n) {
            if(i%2 == 0) {
                str += i;
                count++;
            }
            i++;
            if(i >= 10) {
                i = 1;
            }
        }
        return Integer.parseInt(str);
    }

    public static void findPermutationOfEvenNumber(int n) {
        int num = getEvenNumber(n);
        System.out.println(num);
        int i = 1;
        while(i < n) {
            //take the left number
            int left_no = num/(int)(Math.pow(10, n-1));
            //remove the first digit
            num = num % (int)(Math.pow(10, n-1));
            //append the left_no to the right
            num = (num * (int)(Math.pow(10, 1)))+left_no;
            System.out.println(num);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Find Even Number Permutation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n value: ");
        int num = sc.nextInt();
        sc.close();

        findPermutationOfEvenNumber(num);
    }
}
