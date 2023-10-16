package homework_week_6;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programmes_4 {
    // Declare two instance and two static variable
    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    // Declare one instance method
    public void m1() {
        System.out.println(a); // a is instance variable into instance method
        System.out.println(b); // b is instance variable into instance method
        System.out.println(c); // c is  static variable   into instance method
        System.out.println(d); // d is static variable   into instance method

    }

    // Declare one static method
    public static void m2() {
        Programmes_4 obj = new Programmes_4(); // object creation
        System.out.println(obj.a); // instance variable into static method
        System.out.println(obj.b); // instance variable into static method
        System.out.println(c);// static variable into static method
        System.out.println(d); // static variable into static method

    }

    // Declare main method
    public static void main(String[] args) {
        // call both instance and static methods into main method
        Programmes_4 t1 = new Programmes_4();// object creation
        t1.m1();// instance method into main method
        m2(); // static method into main method
    }

}
