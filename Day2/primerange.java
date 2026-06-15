public class primerange {
    public static void main(String[] args) {
        int n=25;
        if(n<=1){
            System.out.println("Not a prime");
        }if(n!=2 && n%2==0){
            System.out.println("Not a prime");
        }if(n==2){
            System.out.println("Prime");
        }
        boolean Check=true;
        for(int i=3;i<=Math.sqrt(n);i=i+2){
            if(n%i==0){
                System.out.println("Not prime");
                Check=false;
                break;
            }
        }if(Check){
            System.out.println("Prime");
        }
    }
}