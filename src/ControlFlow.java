import java.util.Scanner;

/**
 * Beginner Control Flow class.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.1
 */

public class ControlFlow {
    public static void main(String[] args) {
        // SCOPE - The area in which a variable is accessible
        // This variable's scope is local to psvm
        String shaniasWord = "Katzen";
        // printf - print format, allows you to format a string using specifiers
        System.out.printf("This word is accessible in all of PSVM: %s\n", shaniasWord);

        // USER INPUT
        // Ask the user to input a number into the console
        System.out.println("~ Pick a number between 1 and 10 ~ ");
        // Declare and instantiate a Scanner object
        Scanner userInput = new Scanner(System.in);
        // Store user input from the Scanner in a variable
        int chosenNum = userInput.nextInt();

        // Control Flow - If Statement
        // Determine whether the chosen number is greater or less than 5
        if (chosenNum < 5) {
            // If less than 5, print new word
            shaniasWord = "Koyangi";
            System.out.printf("You picked %d! The word is now: %s\n", chosenNum, shaniasWord);
        } else {
            // if more than 5, print new word
            shaniasWord = "Neko";
            System.out.printf("You picked %d! The word is now: %s\n", chosenNum, shaniasWord);
        }

        // Despite shaniasWord changing in the if statement, the value remains the same due to the scope
        System.out.printf("And yet, outside of the scope of the if statement, the word remains: %s\n", shaniasWord);

    }
}
