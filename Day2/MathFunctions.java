import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a negative number: ");
        int c = sc.nextInt();
        System.out.print("Enter a decimal number: ");
        double d = sc.nextDouble();
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Minimum: " + Math.min(a, b));
        System.out.println("Absolute Value: " + Math.abs(c));
        System.out.println("Power (a^b): " + Math.pow(a, b));
        System.out.println("Square Root of a: " + Math.sqrt(a));
        System.out.println("Round: " + Math.round(d));
        System.out.println("Ceil: " + Math.ceil(d));
        System.out.println("Floor: " + Math.floor(d));

        sc.close();
    }
}