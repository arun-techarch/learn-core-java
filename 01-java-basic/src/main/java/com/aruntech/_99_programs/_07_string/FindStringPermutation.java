package com.aruntech._99_programs._07_string;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * program to generate the permutation of a string
 * e.g: str=abc then [cba, bca, bac, cab, acb, abc]
 */
public class FindStringPermutation {
    public static List<String> generatePermutations(String str) {
        List<String> permutationList = new ArrayList<>();
        permutationList.add("");

        for (int i = 0; i < str.length(); i++) {
            List<String> newPermutations = new ArrayList<>();
            for (String permutation : permutationList) {
                for (int j = 0; j <= permutation.length(); j++) {
                    newPermutations.add(permutation.substring(0, j) + str.charAt(i) + permutation.substring(j));
                }
            }
            permutationList = newPermutations;
        }

        return permutationList;
    }

    public static void main(String[] args) {
        System.out.println("Find String Permutation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        if(str.isBlank() || str.trim().isEmpty()) {
            System.out.println("Invalid input!!");
        } else {
            System.out.printf("The %s permutations are: %s%n", str, generatePermutations(str));
        }
    }
}
