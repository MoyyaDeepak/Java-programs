package Java_Projects.StudentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.println("Enter no. of students to Enroll: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        StudentDetails[] students=new StudentDetails[n];
        for(int i=0;i<n;i++) {
            students[i]=new StudentDetails();
            students[i].enroll();
            students[i].payTution();
            System.err.println(students[i].toString());
        }
    }
}
