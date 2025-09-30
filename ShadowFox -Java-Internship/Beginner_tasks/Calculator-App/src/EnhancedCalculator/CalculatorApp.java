//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EnhancedCalculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit) {
            System.out.println("\n=== Enhanced Console Calculator ===");
            System.out.println("1) Basic Arithmetic");
            System.out.println("2) Scientific Functions");
            System.out.println("3) Unit Conversions");
            System.out.println("0) Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    BasicCalculator.menu(sc);
                    break;
                case 2:
                    ScientificCalculator.menu(sc);
                    break;
                case 3:
                    UnitConverter.menu(sc);
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }

        System.out.println("Goodbye!");
    }
}