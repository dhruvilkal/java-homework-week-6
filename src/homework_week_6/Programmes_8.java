package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programmes_8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Enter the base value
        System.out.println("Enter the base of triangle:" );
        int base = scanner.nextInt();

        // Enter the height of triangle
        System.out.println("Enter the height of triangle:"  );
        int height = scanner.nextInt();

        // Close scanner
        scanner.close();


        int area = (base * height) / 2;
        System.out.println("the area of triangle is:"+ area);

    }
}
