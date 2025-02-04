import java.util.Scanner;

/**
 * Beginner Functions class.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.0
 */

public class Functions {

    // FUNCTION - series of finite steps made to accomplish a task
    // Placed outside of main, invoked within it
    public static void announceTeaTime() {
        System.out.println("Waiting for tea time ~");
        System.out.println("Type something random: ");
        Scanner input = new Scanner(System.in);
        // No need to store the input
        input.next();
        System.out.println("It's tea time! ~");
    }

    // Function using parameters
    public static void calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double total = listedPrice + tip + tax;

        // %.2f formats the decimal to 2 places
        System.out.printf("Your total meal price comes to $%.2f\n", total);
    }

    // Function using parameters AND a double return type
    public static double calculateTotalMealPrice2(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double total = listedPrice + tip + tax;

        // Returns a value so it can be used outside the function
        return total;
    }

    // Main Function - Invokes automatically when the program runs
    public static void main(String[] args) {
        // Invokes the function once
        announceTeaTime();

        // Invokes the function with 3 parameters once
        calculateTotalMealPrice(25.99,.15,.13);

        // Store the returned value from the function
        double groupMealCost = calculateTotalMealPrice2(32.99,.2,.13);

        // Format decimal and divide cost
        System.out.printf("The individual price per person is $%.2f", (groupMealCost / 5));
    }
}
