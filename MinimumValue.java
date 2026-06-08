import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }

        System.out.println("Minimum value = " + min);
    }
}
