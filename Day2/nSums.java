import java.util.Scanner;
public class nSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        int s=print(1,n,0);
        System.out.println(s);

    }
    public static int print(int i,int n,int sum){
        if(i>n){
            return sum;
        }
        sum=sum+i;
        return print(i+1,n,sum);
    }
}