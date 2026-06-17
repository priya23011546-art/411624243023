import java.util.Scanner;
public class Factoriall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s =factorial(1,n,1);
        System.out.println(s);

    }
    public static int factorial(int i,int n,int fact){
        if(i>n){
            return fact;
        }
        fact=fact*i;
        return factorial(i+1,n,fact);
    }

}
