package homework_week_6;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

public class Programmes_18 {
    public static void main(String[] args) {


        // Define two input
        int a = 125;
        int b = 24;
        // Perform arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int divided = a / b;
        int mod = a % b;
        // print result of two input


        System.out.println(a + " + " + b +"= " +sum);
        System.out.println( a + "-"+ b+ "= "+ difference);
        System.out.println( a +"*"+ b+ "="+product);
        System.out.println(a +"/"+  b+"="+divided);
        System.out.println(a +"%"+ b+"="+mod);



    }
}
