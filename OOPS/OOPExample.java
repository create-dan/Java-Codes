class Employee{

    //private fields providing encapsulation
    private String name;
    private int employeeId;
    private double salary;

    //constrcturor
    public Employee(String name , int employeeId , double salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    //Getter and Setter methods
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
   this.salary= salary;

    }

    public void displayInfo()
    {
        System.out.println("EmployeeeId :"+employeeId);
        System.out.println("Name :"+name);
        System.out.println("Salary :"+salary);
    }
}

 class Manager extends Employee{
    private String department;

    //constructor

    public Manager(String name , int employeeId, double salary, String department)
    {
        super(name,employeeId,salary);
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Departement "+ department);
    }

    //Manager Specific method
    public void conductMeeting()
    {
        System.out.println("Manager is conducting a meeting");
    }

}


public class OOPExample {
    public static void main(String args[]){


        //create employee object
        Employee employee = new Employee("Dnyaneshwar Shinde",100,400);

        System.out.println("Employee Information");
        employee.displayInfo();

        System.out.println();

        //create a manager object
        Manager manager = new Manager("Dnyan",200,800,"IT");

        System.out.println("Manager Information");
        manager.displayInfo();

        manager.conductMeeting();

    }
}