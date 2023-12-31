import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double grades;

    public Student(String name, int rollNumber, double grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grades=" + grades +
                '}';
    }
}

class StudentRepository {
    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}

class StudentManagementSystem {
    private StudentRepository studentRepository;

    public StudentManagementSystem() {
        studentRepository = new StudentRepository();
    }

    public void addStudent(String name, int rollNumber, double grades) {
        Student student = new Student(name, rollNumber, grades);
        studentRepository.addStudent(student);
        System.out.println("Student added successfully!");
    }

    public void deleteStudent(int rollNumber) {
        studentRepository.deleteStudent(rollNumber);
        System.out.println("Student deleted successfully!");
    }

    public void displayStudents() {
        List<Student> students = studentRepository.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    System.out.print("Enter grades: ");
                    double grades = scanner.nextDouble();

                    system.addStudent(name, rollNumber, grades);
                    break;

                case 2:
                    System.out.print("Enter roll number of the student to delete: ");
                    int deleteRollNumber = scanner.nextInt();
                    system.deleteStudent(deleteRollNumber);
                    break;

                case 3:
                    system.displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
