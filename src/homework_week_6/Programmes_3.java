package homework_week_6;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

// Declare one instance and one static Variable

public class Programmes_3 {
    int a =20; // Instance Variable
    static String name = "Dhruvil"; // static Variable

    // Declare one instance method
    public void d1(){
    System.out.println(a);
    System.out.println(name);

    }
    // Declare one static method
    public static void m2(){
        Programmes_3 obj =new Programmes_3();
        System.out.println(obj.a);
        System.out.println(name);

    }
    // Declare main method
    public static void main (String[] args){
        Programmes_3 t1 = new Programmes_3();// object creation
        t1.d1(); // instance method into main method
        m2();  // static method into main method


    }

}
