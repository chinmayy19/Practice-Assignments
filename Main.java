import java.util.*;
import java.io.*;

public class Main {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Employee Management System ======");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees Sorted by ID");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // clear buffer

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: removeEmployee(); break;
                case 3: showAllEmployees(); break;
                case 4: showSortedEmployees(); break;
                case 5: findEmployeeByName(); break;
                case 6: saveToFile(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }

    // 1. Add Employee
    public static void addEmployee() {
        System.out.println("1. No-arg constructor");
        System.out.println("2. Constructor with ID and Name");
        System.out.println("3. Constructor with ID, Name and Role");
        System.out.print("Choose type of Employee creation: ");
        int type = sc.nextInt();
        sc.nextLine();

        Employee emp = null;

        switch (type) {
            case 1:
                emp = new Employee();
                break;
            case 2:
                System.out.print("Enter Employee ID: ");
                int id2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String name2 = sc.nextLine();
                emp = new Employee(id2, name2);
                break;
            case 3:
                System.out.print("Enter Employee ID: ");
                int id3 = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Employee Name: ");
                String name3 = sc.nextLine();
                System.out.print("Enter Employee Role: ");
                String role = sc.nextLine();
                emp = new Employee(id3, name3, role);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        if (emp != null) {
            employeeList.add(emp);
            System.out.println("✅ Employee added successfully!");
        }
    }

    // 2. Remove Employee
    public static void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean removed = employeeList.removeIf(emp -> emp.getEmpID() == id);
        if (removed)
            System.out.println("✅ Employee removed.");
        else
            System.out.println("❌ Employee not found.");
    }

    // 3. Show All Employees
    public static void showAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees in the list.");
        } else {
            System.out.println("All Employees:");
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    // 4. Show Employees in Sorted Order (by ID)
    public static void showSortedEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
        employeeList.sort(Comparator.comparingInt(Employee::getEmpID));
        System.out.println("Employees sorted by ID:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    // 5. Find Employee by Name
    public static void findEmployeeByName() {
        System.out.print("Enter Employee Name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.getEmpName().equalsIgnoreCase(name)) {
                System.out.println("Employee found: " + emp);
                found = true;
            }
        }
        if (!found) {
            System.out.println("❌ No employee found with name: " + name);
        }
    }

    // 6. Save Employees to File
    public static void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))) {
            for (Employee emp : employeeList) {
                writer.println(emp.toString());
            }
            System.out.println("✅ Employee details saved to employees.txt");
        } catch (IOException e) {
            System.out.println("❌ Error saving file: " + e.getMessage());
        }
    }
}