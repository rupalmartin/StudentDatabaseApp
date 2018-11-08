import java.util.Scanner;

public class Student {
    public String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses="Math,";
    private int tuitionBalances;
    private static int costofCourses =600;
    private static int Id=1000;

    public Student(){

        System.out.println("Enter the students FirstName");
        Scanner scanner = new Scanner(System.in);
        this.firstName=scanner.nextLine();

        System.out.println("Enter the students LastName");
        this.lastName=scanner.nextLine();

        System.out.println("1 -- Freshman \n2 --Junior\n3-- Graduate \nEnter the students Graduation level");
        this.gradeYear=scanner.nextInt();
        setStudentId();
        System.out.println("Firstname,LastName,Students Graduation level is "+this.firstName +" " + this.lastName+" "+
                this.gradeYear +" "+this.studentId);



    }

    //generate an Id
    private void setStudentId(){
        Id++;
        this.studentId=gradeYear +""+Id;
    }
    //Grade level + Id;


    //constructor prompt student to enter name and year

    //generate id

    // enroll in courses

    public void enroll(){
        System.out.println("Enter the course to enroll(Q to quit)");
        Scanner sc= new Scanner(System.in);
        String course=sc.nextLine();
        if(course!="Q"){
            courses= courses +"\n"+ course;
            tuitionBalances=tuitionBalances+costofCourses;

            System.out.println("Enrolled in: "+courses);
            System.out.println("Tuition is: "+tuitionBalances);

        }
    }

    // view bal and pay tution

    //show status
}
