package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 * <p>
 * Write the necessary code to calculate the volume and surface area of a cylinder
 * with a radius of 3.14 and a height of 5. Print out the result.
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        double r = radius * radius;
        int height = 5;
        double pi = 3.14;

        System.out.println("Volume of the cylinder = " + pi * radius * height);
        System.out.println("Surface are of the cylinder = " + ((2 * r * height) + (2 * r * radius)));


    }
}