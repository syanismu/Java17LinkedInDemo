import java.util.Scanner;

/**
 * Beginner Control Flow class.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.0
 */

public class ControlFlow {
    public static void main(String[] args) {
        // Ask the user to input a number into the console
        System.out.println("~ Pick a number between 1 and 10 ~ ");
        // Declare and instantiate a Scanner object
        Scanner userInput = new Scanner(System.in);
        // Store user input from the Scanner in a variable
        int chosenNum = userInput.nextInt();

        // Control Flow - If Statement
        // Determine whether the chosen number is greater or less than 5
        if (chosenNum < 5) {
            // If less than 5, print tomato
            System.out.println("Tomato");
        } else {
            // if more than 5, print potato
            System.out.println("Potato");
        }
    }
}
