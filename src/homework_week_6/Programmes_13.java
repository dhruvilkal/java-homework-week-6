package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

public class Programmes_13 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first number: " );// Enter the first number
        int a = scanner.nextInt();

        System.out.println("Enter the second number:" );// Enter the second number
        int b = scanner.nextInt();

        System.out.println("enter the third number:"  );// Enter the third number
        int c = scanner.nextInt();
        // calculate the average
        int average = (a + b+ c)/3;


        // print the result
        System.out.println("Average of the three number is:" + average );

    }

}
