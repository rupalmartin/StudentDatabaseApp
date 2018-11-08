import java.util.Scanner;

public class Student {
    public String firstName;
    private String lastName;
    private int gradeYear;
    private int studentId;
    private String courses;
    private int tuitionBalances;
    private int costofCourses =600;

    public Student(){

        System.out.println("Enter the students FirstName");
        Scanner scanner = new Scanner(System.in);
        this.firstName=scanner.nextLine();

        System.out.println("Enter the students LastName");
        this.lastName=scanner.nextLine();

        System.out.println("1 -- Freshman \n2 --Junior\n3-- Graduate \nEnter the students Graduation level");
        this.gradeYear=scanner.nextInt();

        System.out.println("Firstname,LastName,Students Graduation level is "+this.firstName +" " + this.lastName+" "+this.gradeYear);
    }


    //constructor prompt student to enter name and year

    //generate id

    // enroll in courses

    // view bal and pay tution

    //show status
}
