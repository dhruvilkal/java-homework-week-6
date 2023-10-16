package homework_week_6;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods
 */

public class Programmes_5 {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello Please input first number and press enter:"  );
    int a = scanner.nextInt();
    System.out.println("Please input second number and press enter:  ");
    int b = scanner.nextInt();
    addition(a, b);
    subtration(a,b);
    Programmes_5 obj = new Programmes_5();
    obj.division(a,b);
    obj.multipication(a,b);
    scanner.close();

}
// static method
    public static void addition(int a, int b){
        int add = a + b;
        System.out.println("addition of two number is:" + add);
    }
    // static method
    public static void subtration(int a ,int b){
        int sub = a- b;
        System.out.println("subtraction of two number is :"+ sub);
    }
    // Instance method
    public void division(int a, int b){
        int div = a /b;
        System.out.println("division of two number is : "+div);

}
// Instance method
    public void multipication(int a, int b){
        int mul = a * b;
        System.out.println("multipicaton of two number is:"+ mul);

    }





}

