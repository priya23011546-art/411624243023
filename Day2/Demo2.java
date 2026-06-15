public class Demo2 {
    public static void main(String[] args) {
        String s1="Love";
        String s2="veLoo";
        if(s1.length()==s2.length() && (s1 + s1).contains(s2)){
            System.out.println("Rotation");
        }
        else{
            System.out.println("Not a Rotation");
        }
    }
}
