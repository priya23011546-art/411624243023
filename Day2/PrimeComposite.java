import java.util.Scanner;
public class PrimeComposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (n <= 1) {
            System.out.println(n + " is neither Prime nor Composite");
        } else if (count == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is a Composite Number");
        }
        sc.close();
    }
}
