import java.util.Scanner;
public class mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s=multiply(a,b);
        System.out.println(s);
    }
    public static int multiply(int a,int b){
        int m=a*b;
        return m;
    }
}
