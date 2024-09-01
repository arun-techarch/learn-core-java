package com.aruntech._01_introduction;

/**
 * Function or method means the set of statement or instruction executed
 * as a single unit to perform a task. It's mainly used for code reusability
 * The syntax of the function may look like below
 *    scope [static] returnType methodName(dataType parameter1, dataType parameter2, ...) {
 *     // Method body
 *     return returnValue;
 *   }
 *  scope - it can be public, protected or private
 *  static - it's optional keyword for creating static function
 *  returnType - it can be a primitive or reference type
 *  methodName = it's user-defined name to identify a function
 *  args - It's may or may not expect parameters
 *  return - function may or may not return value.
 */
public class _11_BasicJavaFunction {

    // this is static function accept two parameters and return int value
    // other scope we understand more in classes.
    public static int addValue(int a, int b) {
        return a + b;
    }

    // this method not return anything so return type is void
    // also it doesn't have any return statement
    public static void printValue(int sum) {
        System.out.println("Add: " + sum);
    }

    // all static, final variable, function can be accessed from main
    // we can directly call the method which will be executed directly
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = addValue(a, b);
        printValue(sum);
    }
}
