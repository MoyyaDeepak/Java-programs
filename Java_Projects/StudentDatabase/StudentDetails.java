package Java_Projects.StudentDatabase;

import java.util.Scanner;

public class StudentDetails {
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;
    private String gender;
    private String courses=null;
    private String studentId;
    private int gradeYear;
    private int tutionBalance=0;
    private static int costOfCourse=600;
    private static int id=1;

    public StudentDetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        this.FirstName = s.nextLine();
        System.out.println("Enter your Last Name: ");
        this.LastName = s.nextLine();
        System.out.println("Enter your Email: ");
        this.Email = s.nextLine();
        System.out.println("Enter your Phone Number: ");
        this.PhoneNumber = s.nextLine();
        System.out.println("Enter your GradeYear: 1/2/3/4");
        this.gradeYear = s.nextInt();
        System.out.println("Enter your Gender: ");
        this.gender = s.next();

        setStudentId();
    }

    private void setStudentId(){
        id++;
        this.studentId=gradeYear+" "+id;
    }

    public void enroll(){
        String course;
        do{
            System.out.println("Enter Course to enroll (Q to quit): ");
            Scanner s=new Scanner(System.in);
            course=s.nextLine();
            if(!course.equals("Q")){
                courses =course;
                tutionBalance+=costOfCourse;
            }
        }while(!course.equals("Q"));
            System.out.println("ENROLLED IN: "+courses);
    }

    public void viewBalance(){
        System.out.println("Your balance to pay: "+tutionBalance);
    }

    public void payTution(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your payment: ");
        int payment = s.nextInt();
        tutionBalance-=payment;
        System.out.println("Thank You for your payment of "+payment);
        viewBalance();
    }

    public String toString(){
        return "\nDetails of the student"+"\nName: "+FirstName+" "+LastName+
        "\nEmail: "+Email+"\nPhone Number: "+PhoneNumber+
        "\nGender: "+gender+
        "\nGrade Year: "+gradeYear+
        "\nCourses Enrolled: "+courses+
        "\nStudent ID: "+studentId+
        "\nBalance: "+tutionBalance;
    }
}
