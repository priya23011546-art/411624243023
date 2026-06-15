import java.util.Scanner;
    public class DigitSumrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sum(n,0);
        System.out.println(s);
    }
    public static int sum(int n,int sum){
        if(n<=0){
            return sum;
        }
        sum = sum+(n%10);
        return sum(n/10,sum);
    }
    
}
