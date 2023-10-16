package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Programmes_7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // user enter the temperature in fahrenheit
        System.out.println("Enter a temperature in degree Fahrenheit: "  );
        int fahrenheit = scanner.nextInt();

        // Convert fahrenheit to celsius
        int celsius = (fahrenheit - 32)* 5/9;

        // Result
        System.out.println("Temperature in degree celsius :"+ celsius);

        // Close scanner
        scanner.close();



    }
}
