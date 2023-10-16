package homework_week_6;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 *
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 *
 * Sum of two binary numbers: 101
 */

public class Programmes_16 {
    static long binary1, binary2;
    static long[] sum = new long[20];

    static int i = 0;
    static int remainder = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Binary value: ");
        binary1 = scanner.nextLong();
        System.out.println("Enter Second Binary value: ");
        binary2 = scanner.nextLong();

        // close scanner
        scanner.close();

        addition();


    }
    // Static method including the logic to add both inserted binary numbers

    public static void addition(){
        while (binary1 != 0 || binary2 !=0){

        sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;

        remainder = (int) (binary1 % 10 + binary2 % 10 + remainder) / 2;
        binary1 = binary1 /10 ;
        binary2 = binary2 / 10;


    }
     if (remainder !=0);
        sum[i++] = remainder;
    --i;
    System.out.println("The addition of inserted Binary values is: ");
    while (i >= 0)
        System.out.print(sum[i--]);
}




}