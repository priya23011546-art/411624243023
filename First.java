import java.util.Scanner;
public class First{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name");
        String name = sc.nextLine();
        System.out.print("Age");
        int age = sc.nextInt();
        System.out.print("CGPA");
        float cgpa = sc.nextFloat();
        System.out.print("Gender");
        char gender = sc.next().charAt(0);

        
    }
}