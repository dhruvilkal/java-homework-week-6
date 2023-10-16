package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case. use of scanner
 */

public class Programmes_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string in uppercase: ");
        String input = scanner.nextLine();

        // Convert the input string to lowercase
        String lowercase = input.toLowerCase();
        System.out.println("String in lowercase: "+ lowercase);
scanner.close();
    }
}
