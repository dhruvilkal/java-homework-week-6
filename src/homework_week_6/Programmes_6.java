package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class Programmes_6 {
    public static void main(String[] args){

        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        // the user to enter the radius
        System.out.println("Enter the radius of the circle:  ");

        // radius value from the user
        double radius  = scanner.nextInt();

        // close the scanner
        scanner.close();

        // Calculate the area of the circle
        double area  = Math.PI * radius *radius;

        // Display the result
        System.out.println("area of the circle with radius "+ radius+"is :"+area);


    }
}
