/**
 * Main class that the Triangle class runs from.
 * Followed LinkedIn Learning Video - Learning Java 17 by Kathryn Hodge
 *     ~ https://www.linkedin.com/learning/learning-java-17 ~
 * Started Feb 2025
 *
 * @author Shania Muller
 * @version 1.1
 */

public class Main {
    public static void main(String[] args) {
        // Created new triangle objects using the triangle constructor
        // Datatype label = constructor(values)
        Triangle triangleA = new Triangle(20, 15, 10, 10, 10);
        Triangle triangleB = new Triangle(15, 10, 5, 4, 6);

        // Find the area using the instance method created in the Triangle class
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);

        // Access individual instance variables using the dot operator
        System.out.println(triangleA.sideLen1);
        System.out.println(triangleB.height);

        // Access a static variable in a class
        System.out.println(Triangle.numOfSides);
    }
}
