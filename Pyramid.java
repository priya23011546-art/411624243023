import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}