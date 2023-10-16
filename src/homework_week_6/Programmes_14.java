package homework_week_6;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 * Expected Output:
 *
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programmes_14 {
    public static void main(String[] args){

        // data for rectangle
        double width = 5.5;
        double height = 8.5;

        // calculate area and Perimeter
        double area = width * height;
        double Perimeter = 2 * (width + height);

        // print result
        System.out.println("Area is "+ width + " * "+ height+ " = "+(width * height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ")= " + (2 * (width + height)));

        }

    }

