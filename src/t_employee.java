public class t_employee extends t_person {
    // Additional attributes for employee ID, supervisor ID, and salary
    private String employeeId;
    private String supervisorId;
    private float salary;

    // Constructor with parameters for last name, first name, employee ID, and age
    public t_employee(String ln, String fn, String empId, int a) {
        super(ln, fn); // Call the constructor of the base class Person
        this.employeeId = empId; // Set the employee ID
        this.salary = 60000; // Default value for salary
        this.supervisorId = "HA67M"; // Default value for supervisor ID
        this.setAge(a); // Set the age using the setter method
    }

    // Getter method for employeeId
    public String getEmployeeId() {
        return this.employeeId;
    }

    // Getter and setter methods for supervisorId
    public String getSupervisorId() {
        return this.supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId;
    }

    // Getter and setter methods for salary
    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Method to increase salary
    public void salaryIncrease(float increase) {
        this.salary += increase;
    }

    // Method to print all attributes of the employee
    public void printAll() {
        System.out.println("******************************");
        System.out.println("*        Employee Info       *");
        System.out.println("******************************");
        System.out.println("* Name: " + fullName() + "          *");
        System.out.println("* Age: " + getAge() + "                     *");
        System.out.println("* Employee ID: " + this.employeeId + "       *");
        System.out.println("* Supervisor ID: " + this.supervisorId + "       *");
        System.out.println("* Salary: " + this.salary + "€            *");
        System.out.println("******************************\n\n");
    }
}