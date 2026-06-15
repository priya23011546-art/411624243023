public class Demo3 {
    public static void main(String[] args) {
        String n="385642";
        for(int i = n.length()-1;i>=0;i--){
            int digit = n.charAt(i)-'0';
            if(digit % 2 !=0){
                System.out.println(n.substring(0,i+1));
                return;
            }

        }
        System.out.println("");
    }
    
}
