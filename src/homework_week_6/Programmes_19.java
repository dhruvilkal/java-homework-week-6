package homework_week_6;

/**
 *
 19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog
 */

public class Programmes_19 {
    public static void main (String[] args){
        String uppercase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        // Convert the uppercase into lowercase
        String LowercaseString = uppercase.toLowerCase();

        System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.:"+uppercase);
        System.out.println("LowercaseString:"+LowercaseString);

    }
}
