//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package EnhancedCalculator;

import java.util.Scanner;

public class UnitConverter {
    public static void menu(Scanner sc) {
        System.out.println("\n-- Unit Conversions --");
        System.out.println("1) Celsius -> Fahrenheit");
        System.out.println("2) Fahrenheit -> Celsius");
        System.out.println("3) Kilometers -> Miles");
        System.out.println("4) Kilograms -> Pounds");
        System.out.print("Choose: ");
        int op = sc.nextInt();
        System.out.print("Enter value: ");
        double value = sc.nextDouble();
        double var10000;
        switch (op) {
            case 1 -> var10000 = celsiusToFahrenheit(value);
            case 2 -> var10000 = fahrenheitToCelsius(value);
            case 3 -> var10000 = kilometersToMiles(value);
            case 4 -> var10000 = kilogramsToPounds(value);
            default -> var10000 = Double.NaN;
        }

        double result = var10000;
        if (!Double.isNaN(result)) {
            System.out.println("Converted value = " + result);
        } else {
            System.out.println("Invalid option!");
        }

    }

    public static double celsiusToFahrenheit(double c) {
        return c * (double)9.0F / (double)5.0F + (double)32.0F;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - (double)32.0F) * (double)5.0F / (double)9.0F;
    }

    public static double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }
}