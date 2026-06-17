import java.util.Scanner;
public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] rollNo = new int[50];
        String[] name = new String[50];
        String[] dob = new String[50];
        String[] bloodGroup = new String[50];
        String[] address = new String[50];
        double[] cgpa = new double[50];

        int count = 0;

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Total Students");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number : ");
                    rollNo[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter DOB : ");
                    dob[count] = sc.nextLine();

                    System.out.print("Enter Blood Group : ");
                    bloodGroup[count] = sc.nextLine();

                    System.out.print("Enter Address : ");
                    address[count] = sc.nextLine();

                    System.out.print("Enter CGPA : ");
                    cgpa[count] = sc.nextDouble();

                    count++;

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No Students Found");
                    } else {

                        System.out.println("\n----- STUDENT DETAILS -----");

                        for (int i = 0; i < count; i++) {

                            System.out.println("---------------------------");
                            System.out.println("Roll No      : " + rollNo[i]);
                            System.out.println("Name         : " + name[i]);
                            System.out.println("DOB          : " + dob[i]);
                            System.out.println("Blood Group  : " + bloodGroup[i]);
                            System.out.println("Address      : " + address[i]);
                            System.out.println("CGPA         : " + cgpa[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Roll Number : ");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (rollNo[i] == search) {

                            System.out.println("\nStudent Found");
                            System.out.println("---------------------------");
                            System.out.println("Roll No      : " + rollNo[i]);
                            System.out.println("Name         : " + name[i]);
                            System.out.println("DOB          : " + dob[i]);
                            System.out.println("Blood Group  : " + bloodGroup[i]);
                            System.out.println("Address      : " + address[i]);
                            System.out.println("CGPA         : " + cgpa[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.println("Total Students : " + count);
                    break;

                case 5:

                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}