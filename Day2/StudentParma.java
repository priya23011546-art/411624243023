class StudentParma {
    String name;
    StudentParma(String n){
        name=n;
    }
    public static void main(String[] args) {
        StudentParma s1=new StudentParma("Menaga");
        System.out.println(s1.name);
    }
}
