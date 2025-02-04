import java.util.Scanner;

/**
 * Beginner While Loop class.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.0
 */

public class WhileLoops {
    public static void main(String[] args) {
        // For obtaining user input
        Scanner input = new Scanner(System.in);
        // Set to true so the loop functions
        boolean isOnRepeat = true;

        // ALWAYS have a way to exit a while loop
        // relational operator not required here because it looks for a true condition automatically
        // adding "= true" is redundant
        while(isOnRepeat) {
            System.out.println("Currently Playing!");
            System.out.println("Would you like to stop? If so, answer yes");
            // Store user input as a String
            String userInput = input.next();

            // Exit condition
            // .equals compares strings and returns true or false, avoiding null values
            if ("yes".equals(userInput)) {
                // Change value to false to exit loop
                isOnRepeat = false;
            }
        }

        // Prints when the loop is exited
        System.out.println("Game over!");
    }
}
