import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int year;
    private static String ID = "100";
    private int uniqueID = 5;
    private String courses = null;
    private static int costOfCourse = 600;
    private double balance;


    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the students first name: ");
        this.firstname = scan.next();
        System.out.print("Please enter the students last name: ");
        this.lastname = scan.next();
        System.out.print("Please enter the students year: \n1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior");
        this.year = scan.nextInt();
        System.out.print("Student's name is " + firstname + " " + lastname + " and they are a " + year + "rd year student.\nStudent's ID is: ");

        System.out.println(this.ID = ID + setID(uniqueID));
        setCourses();
        payTuition();

    }

    //GENERATE A UNIQUE STUDENT ID FOR EACH STUDENT
    private String setID(int length) {
        String idValues = "1234567890";
        char[] id = new char[length];
        for (int i = 0; i < length; i++) {
            int newValue = (int) (Math.random() * idValues.length() - 1);
            id[i] = idValues.charAt(newValue);
        }
        return new String(id);
    }

    public String getID() {
        return this.ID;
    }

    //DEFINES THE AVAILABLE COURSES AND THEIR VALUES
    public void setCourses() {
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your desired courses: ");
            String course = scan.next();

            if (!course.equals("Q")) {
                courses = courses + " " + course;
                balance = balance + costOfCourse;
            } else {
                System.out.println("BREAK!");
                break;
            }
        } while (1 != 0) ;
            System.out.println("Courses enrolled in: " + courses);
            System.out.println("Current balance: $" + balance + "0");

        }

        public String getCourses(){
            return this.courses;
        }

        //FINDS THE BALANCE AND ADJUSTS ACCORDINGLY TO UI UNTIL BALANCE == 0
        public void payTuition(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your payment: ");
            double payment = scan.nextDouble();
            balance = balance - payment;
            System.out.println("Your balance after the  payment of $" + payment + "0 is $" + balance + "0.");
            viewBalance();
       }


        private double viewBalance(){
            return this.balance;
        }
}


