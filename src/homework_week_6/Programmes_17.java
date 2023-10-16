package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * <p>
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * <p>
 * Binary number is: 101
 */

public class Programmes_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a Decimal Number:");
        int decimalNumber = input.nextInt();


        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary number is:" + binaryNumber);



    }

    public static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";

        }
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber = decimalNumber / 2;

        }
        return binary.toString();

    }
}
