import java.util.Scanner;

public class CountLettersNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letters = 0;
        int numbers = 0;
        int Uppercase=0;
        int Lowercase=0;


           for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;

                if (Character.isUpperCase(ch)) {
                    Uppercase++;
                } else if (Character.isLowerCase(ch)) {
                    Lowercase++;
                }
            }

            if (Character.isDigit(ch)) {
                numbers++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Uppercase: " + Uppercase);
        System.out.println("Lowercase: " + Lowercase);

        sc.close();
    }
}
