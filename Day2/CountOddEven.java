import java.util.Scanner;
public class CountOddEven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int oddCount=0;
    int evenCount=0;
    while(n>0){
        int digit=n%10;
        if(digit%2==0){
            evenCount++;
        }
        else{
            oddCount++;
        }
        n=n/10;
    }
    System.out.println("number of odd digits :"+oddCount);
    System.out.println("number of even digits :"+evenCount);
    }
}