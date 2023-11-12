import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the sides of the triangle:");

        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("It's a valid triangle.");

            if (isEquilateral(side1, side2, side3)) {
                System.out.println("It's an equilateral triangle.");
            } else if (isIsosceles(side1, side2, side3)) {
                System.out.println("It's an isosceles triangle.");
            } else {
                System.out.println("It's a scalene triangle.");
            }
        } else {
            System.out.println("It's not a valid triangle.");
        }

    }

    private static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2);
    }

    private static boolean isEquilateral(double side1, double side2, double side3) {
        return side1 == side2 && side2 == side3;
    }

    private static boolean isIsosceles(double side1, double side2, double side3) {
        return side1 == side2 || side2 == side3 || side3 == side1;
    }

}