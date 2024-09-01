package com.aruntech._02_operators;

public class _08_BitwiseProgram {
    public static void main(String[] args) {
        // checking the flag was set
        int flag = 16;
        boolean isFlagSet = (flag & 16) != 0; // verify 2^4 position was set
        System.out.println("16 flag was set: " + isFlagSet);

        // set and clear flag
        /*
        set and clear the flag
        16 = 00010000
        16 | 8 = 00011000 (set the flag on 2^3)
        16 & ~8 = 00010000 (clear the flag on 2^3)
         */
        flag |= 8;
        System.out.println("Set the flag: " + flag);
        flag &= ~8;
        System.out.println("Clear the flag: " + flag);
        System.out.println();

        // implementing bitmask
        System.out.println("Bitmask");
        int permission = 0; // 00000000
        System.out.println("Permission: " + permission);
        permission |= 1;  // 00000001
        System.out.println("Read Permission: " + permission);
        permission |= 2;  // 00000011
        System.out.println("Write Permission: " + permission);
        System.out.println();

        // print the even numbers
        int n = 10;
        System.out.println("Print Even Numbers:");
        for(int i = 1; i <= n; i++) {
            // it check 2^0 flag was 0 means even
            if((i & 1) == 0) {
                System.out.print((i == n) ? (i) : i +", ");
            }
        }

        // print the odd numbers
        System.out.println();
        System.out.println("Print Odd Numbers:");
        for(int i = 1; i <= n; i++) {
            // it check 2^0 flag was 1 means odd
            if((i & 1) == 1) {
                System.out.print((i == n-1) ? (i) : i +", ");
            }
        }
    }
}
