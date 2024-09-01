package com.aruntech._02_operators;

/**
 * Operator 	   Operators	        Precedence	 Associativity
 * ---------       ----------           ----------   -------------
 * Postfix	        ++, --	             Highest	 Right-to-left
 * Unary	        +, -, !, ~	         High	     Right-to-left
 * Multiplicative	*, /, %	             Medium	     Left-to-right
 * Additive	        +, -	             Medium	     Left-to-right
 * Shift	        <<, >>, >>>	         Medium	     Left-to-right
 * Relational	    <, >, <=, >=	     Medium	     Left-to-right
 * Equality	        ==, !=	             Medium	     Left-to-right
 * Bitwise AND	    &	                 Medium	     Left-to-right
 * Bitwise XOR	    ^	                 Medium	     Left-to-right
 * Bitwise OR	    `		             Medium      Left-to-right
 * Logical AND	    &&	                 Medium	     Left-to-right
 * Logical OR	    ||		             Medium      Left-to-right
 * Conditional	    ? :	                 Medium	     Right-to-left
 * Assignment	    =, +=, -=, *=, /=	 Lowest	     Right-to-left
 */
public class _09_OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println("Operator Precedence:");

        // multiplication is taking precedence
        System.out.println("3+4*5: " + (3 + 4 * 5));
        // parenthesis decide the priority
        System.out.println("(3+4)*5: " + (3+4)*5);

        System.out.println(1 + 2 + "abc");
        System.out.println("abc" + 1 + 2);

        // this leads to compile time error becaz this evaluates as (1 <= 2) <= 3
        // the first expression return boolean so, we cannot perform <= operation
        // between boolean and int
        //System.out.println(1 <= 2 <= 3);

        // it evaluates the expression as (a==b) == c and all are boolean operation
        // so, it prints the value as true
        boolean l = false, m = false;
        boolean n = true;
        System.out.println(l == m == n);

        System.out.println(+-~17);

        // it decides to pre-increment operator on variable only and not int
        // so throw compilation error
        //System.out.println(--17);

        int x = 5;
        int y = 10;
        int z = ++x * y--;
        System.out.println(x + ", " + y + ", " + z);

        // y=x+++x means y=(x)+(++x)
        x = 10;
        y = x+++x;
        System.out.println(x + ", " + y);

        // ++++x means ++(++x) so, post increment operator work on variable not int
        // so it will throw compile time error
        //x = 10;
        //++++x;

        //left associativity
        int a = 10;
        int b = 20;
        int c = a + b - 10;
        System.out.println("Left associativity  c: " + c);

        // right associativity
        c = a = b = 30;
        System.out.println("Right associativity c: " + c);
    }
}
