import java.util.Scanner;
   public class patternn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num");
        int n = sc.nextInt();
        int r=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
   }
