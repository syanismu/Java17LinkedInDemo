import java.util.Scanner;

/**
 * Beginner Hello World class.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.2
 */

public class HelloWorld {
    // psvm - main function, entry point for code
    public static void main(String[] args) {
        // Print to the console
        System.out.println("Hello World! 'Tis I, Shania. ");

        // PRINT vs PRINTLN
        // print - does NOT have a newline \n character appended to the end
        System.out.print("This text does not contain a newline. ");
        // println - DOES have \n at the end
        System.out.println("As you can see, this is on the same line as the last sentence. ");
        System.out.println("New Line :)");

        // DATATYPES and VARIABLES
        // Data type is integer - whole number, variable name is studentAge, value is initialized to 15
        int studentAge = 27;
        // double - decimal number
        double studentGPA = 86.17;
        // char - single character
        // single quotes used for char characters
        char studentFirstInitial = 'S';
        char studentLastInitial ='M';
        // boolean - true or false
        boolean hasPerfectAttendance = true;

        //STRINGS
        // String type needs to start with a capital S
        String studentFirstName = "Shania";
        String studentLastName =  "Muller";

        // Calculate the first initial using studentName and charAt
        // charAt returns the char at the requested index
        char studentFirstInitialCalculated = studentFirstName.charAt(0);
        char studentLastInitialCalculated = studentLastName.charAt(0);

        // Prints 'Shania Muller' to the console
        System.out.println(studentFirstName + " " + studentLastName);
        // Prints '27' to the console
        System.out.println(studentAge);
        // Prints 'S' to the console
        System.out.println(studentFirstInitial);
        // Prints 'M' to the console
        System.out.println(studentLastInitial);
        // Prints 'S' to the console
        System.out.println(studentFirstInitialCalculated);
        // Prints 'M' to the console
        System.out.println(studentLastInitialCalculated);

        // CONCATENATION - combining 2+ variables or strings into a single string
        System.out.println(studentFirstName + " " + studentLastName + "'s GPA is " + studentGPA);
        // Asking user for input
        System.out.println("What would you like to update it to? ");
        // Gather user input using Scanner
        Scanner scanner = new Scanner(System.in);
        // Overwrite the old value with a new one
        studentGPA = scanner.nextDouble();
        // Print the new value to the console
        System.out.println(studentFirstName + " " + studentLastName + "'s GPA is now " + studentGPA);
    }
}
