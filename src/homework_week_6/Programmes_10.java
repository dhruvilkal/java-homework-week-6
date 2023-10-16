package homework_week_6;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */

public class Programmes_10 {
    public static void main(String[] args ){
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // the user to enter a number
        System.out.println("Input a number:  ");
        int number = scanner.nextInt();
        // Close scanner
scanner.close();

        for (int i = 1; i <=10; i++){
            int result = number * i;
            System.out.println(number + " x " + i +" = "+ result);
        }

    }
}
