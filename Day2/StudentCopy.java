class StudentCopy {
    String name;
    StudentCopy(String n) {
        name = n;
    }
    StudentCopy(StudentCopy s) {
        name = s.name;
    }
    public static void main(String[] args) {
        StudentCopy s1 = new StudentCopy("Menaga");
        StudentCopy s2 = new StudentCopy(s1);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
