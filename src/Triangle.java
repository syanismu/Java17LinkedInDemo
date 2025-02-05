/**
 * Beginner Class and Constructor class.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.0
 */


public class Triangle {
    // Instance variables
    // Declare multiple variables of the same type in a single line to save space
    double base, height, sideLen1, sideLen2, sideLen3;

    // Constructor - method/behvaiour that creates and initializes instances of a class
    // Instance - an object created from a class blueprint (triangleA)
    // This constructor requires 5 parameters to initialize the instance variables
    public Triangle(double base, double height, double sideLen1, double sideLen2, double sideLen3) {
        // this. refers to the instance variables of the current object
        this.base = base;
        this.height = height;
        this.sideLen1 = sideLen1;
        this.sideLen2 = sideLen2;
        this.sideLen3 = sideLen3;
    }

    // Another method (behaviour) - calculates and returns the area of a triangle
    public double findArea() {
        return (this.base * this.height) / 2;
    }
}
