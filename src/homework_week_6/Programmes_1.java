package homework_week_6;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Programmes_1 {

    //Declare two instance variables

    int  a = 10; // a is a Instance Variable
    String name = "Dhruvil"; // name is instance Variable

    // Declare one instance method

    public void method (){

        System.out.println(a);
        System.out.println(name);

    }
    // Declare the Main method
    public static void main(String[] args){
        Programmes_1 d1 = new Programmes_1();//object creation
        d1.method();// instance method Declare into main method
    }
}
