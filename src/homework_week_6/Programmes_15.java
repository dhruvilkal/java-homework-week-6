package homework_week_6;

/**
 * Write a Java program to swap two variables
 */

public class Programmes_15 {
    public static void main(String[] args ){
        // Define two variables to swap
        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        // swap the variables
        int temp = a;
        a = b ;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
