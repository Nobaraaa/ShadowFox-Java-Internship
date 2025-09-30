//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EnhancedCalculator;

import java.io.PrintStream;
import java.util.Scanner;

public class ScientificCalculator {
    public static void menu(Scanner sc) {
        System.out.println("\n-- Scientific Functions --");
        System.out.println("1) sin  2) cos  3) tan  4) sqrt  5) power");
        System.out.print("Choose: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Enter radians: ");
                double r = sc.nextDouble();
                System.out.println("sin = " + Math.sin(r));
                break;
            case 2:
                System.out.print("Enter radians: ");
                double a = sc.nextDouble();
                System.out.println("cos = " + Math.cos(a));
                break;
            case 3:
                System.out.print("Enter radians: ");
                double c = sc.nextDouble();
                System.out.println("tan = " + Math.tan(c));
                break;
            case 4:
                System.out.print("Enter number: ");
                double n = sc.nextDouble();
                System.out.println("sqrt = " + Math.sqrt(n));
                break;
            case 5:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter exponent: ");
                double e = sc.nextDouble();
                PrintStream var10000 = System.out;
                double var10001 = Math.pow(b, e);
                var10000.println("pow = " + var10001);
                break;
            default:
                System.out.println("Invalid option!");
        }

    }
}