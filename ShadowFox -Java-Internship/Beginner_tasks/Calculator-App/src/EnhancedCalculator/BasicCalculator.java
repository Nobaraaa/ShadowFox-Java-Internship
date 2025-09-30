//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EnhancedCalculator;

import java.util.Scanner;

public class BasicCalculator {
    public static void menu(Scanner sc) {
        System.out.println("\n-- Basic Arithmetic --");
        System.out.println("1) Add  2) Subtract  3) Multiply  4) Divide");
        System.out.print("Choose: ");
        int op = sc.nextInt();
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        try {
            double var10000;
            switch (op) {
                case 1 -> var10000 = add(a, b);
                case 2 -> var10000 = subtract(a, b);
                case 3 -> var10000 = multiply(a, b);
                case 4 -> var10000 = divide(a, b);
                default -> throw new IllegalArgumentException("Invalid operation!");
            }

            double result = var10000;
            System.out.println("Result = " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == (double)0.0F) {
            throw new ArithmeticException("Division by zero");
        } else {
            return a / b;
        }
    }
}