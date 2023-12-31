import java.util.*;


//class student
class Student{
  
    private String name;
    private int roll;
    private double grades;

   public Student(String name , int roll , double grades)
    {
       
        this.name = name;
        this.roll = roll;
        this.grades = grades;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getGrades(){
        return grades;
    }

    @Override
public String toString() {
    return "Student {name='" + name + "', rollNumber=" + roll + ", grades=" + grades + "}";
}


   

}


//student controller type all functions
class StudentRepository{

    //to store Student objects 
    private List<Student> students;

    //default constructor
    public StudentRepository(){
        students = new ArrayList<>();
    }

    //add students
    public void addStudent(Student student){
        students.add(student);
    }

    //delete students
    public void deleteStudent(int roll)
    {
         students.removeIf(student -> student.getRoll() == roll);
    }

    public List<Student> getAllStudents(){
        return new ArrayList<>(students);
    }

}




class StudentManagement{
    private StudentRepository studentRepository;

    public StudentManagement(){
        studentRepository = new StudentRepository();
    }

    public void addStudent(String name , int roll , double grades){
        Student student =  new Student(name,roll,grades);
        studentRepository.addStudent(student);
        System.out.println("Student added successfully!");
    }


    public void deleteStudent(int roll){
        studentRepository.deleteStudent(roll);
        System.out.println("Student deleted successfully!");

    }

    public void displayStudents(){
        List<Student> students = studentRepository.getAllStudents();

        if(students.isEmpty())
        {
            System.out.println("No students to display.");
        }
        else
        {
            System.out.println("List of students ");
            for(Student student : students){
                System.out.println(student);
            }
        }
    }

        public static void main(String[] args) {
                  Scanner s = new Scanner(System.in);

                  StudentManagement system = new StudentManagement();

                  while(true)
                  {
                        System.out.println("\nStudent Management System Menu:");
                        System.out.println("1. Add Student");
                        System.out.println("2. Delete Student");
                        System.out.println("3. Display Students");
                        System.out.println("4. Exit");
                        System.out.print("Enter your choice (1-4): ");

                        int choice = s.nextInt();

                        switch(choice){
                            case 1: 
                            System.out.println("Enter student name ");
                            String name = s.next();
                            System.out.println("Enter roll number ");
                            int roll = s.nextInt();
                            System.out.println("Enter grades ");
                            double grades = s.nextDouble();

                            system.addStudent(name,roll,grades);
                            break;


                            case 2: 
                            System.out.println("Enter roll no of student to delte ");
                            int rolltoDelte = s.nextInt();
                            system.deleteStudent(rolltoDelte);
                            break;

                            case 3: 
                            system.displayStudents();
                            break;

                            case 4:
                            System.out.println("Good bye ");
                            break;

                            default:
                                System.out.println("Wrong choice ");

                        }


                  }
  
    }

}
    
 


                    
                
