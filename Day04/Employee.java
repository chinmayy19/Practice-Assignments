public class Employee {
    private String empName;
    private int empID;
    private String empRole;

    // 1. No-argument constructor
    public Employee() {
        this.empID = 0;
        this.empName = "Unknown";
        this.empRole = "Not Assigned";
    }

    // 2. Constructor with empID and empName (empRole hardcoded)
    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee";  // hardcoded role
    }

    // 3. Constructor with empID, empName and empRole
    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee [ID=" + empID + ", Name=" + empName + ", Role=" + empRole + "]";
    }
}