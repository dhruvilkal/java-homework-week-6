package homework_week_6;

/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme
 */
// Declare two static variables

public class Programmes_2 {
    static int a = 40; // a is static variable
    static String name = "Java"; // name is static variable

// Declare one static method

    public static void j2(){
        System.out.println(a);
        System.out.println(name);
    }
    // Declare the Main method
    public static void main(String [] args){
        j2(); // call the static method into main method
    }
}
