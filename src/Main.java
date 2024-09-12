// ITL12 - 2a APC 1. Übung
// Aufgabe: Vererbung
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        // Create a new Employee object
        t_employee employee = new t_employee("Marcus", "Ganea", "UFC341GM", 26);
        // Display menu
        boolean exit = false;
        while (!exit) {
            System.out.println("===========================");
            System.out.println("||   Employee Settings   ||");
            System.out.println("===========================");
            System.out.println("1. Display employee information");
            System.out.println("2. Set supervisor ID");
            System.out.println("3. Set salary");
            System.out.println("4. Add salary increase");
            System.out.println("5. Set age");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt(); // User input for menu option
            switch (option) {
                case 1:
                    // Display employee information
                    System.out.println();
                    employee.printAll();
                    break;
                case 2:
                    // Set supervisor ID
                    System.out.print("Enter the new supervisor ID: ");
                    String supervisorId = scanner.next();
                    employee.setSupervisorId(supervisorId);
                    System.out.println("Supervisor ID updated.");
                    break;
                case 3:
                    // Set salary
                    System.out.print("Enter the new salary: ");
                    float salary = scanner.nextFloat();
                    employee.setSalary(salary);
                    System.out.println("Salary updated.");
                    break;
                case 4:
                    // Add salary increase
                    System.out.print("Enter the salary increase: ");
                    float increase = scanner.nextFloat();
                    employee.salaryIncrease(increase);
                    System.out.println("Salary increase added.");
                    break;
                case 5:
                    // Set age
                    System.out.print("Enter the new age: ");
                    int age = scanner.nextInt();
                    employee.setAge(age);
                    System.out.println("Age updated.");
                    break;
                case 6:
                    // Exit program
                    exit = true;
                    System.out.println("Program exited.");
                    break;
                default:
                    System.out.println("Invalid option, please choose again.");
            }
        }
        scanner.close(); // Close scanner
    }
}