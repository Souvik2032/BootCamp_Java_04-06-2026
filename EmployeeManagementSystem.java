package bankAccount;

public class EmployeeManagementSystem {
    String Employee_name;
    double salary;
    static int EmployeeID;
    
    public void increasedSalary(double amount) {
        salary += amount;
    }

    public void extrahoursworked(int time) {
        salary += time * 40;
    }

    public void display() {
        System.out.println(salary);
    }

    public void branchName() {
        System.out.println("ICIC Hyderabad");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem obj = new EmployeeManagementSystem();
        obj.Employee_name = "Souvik Layek";
        obj.salary = 20000;
        obj.EmployeeID = 888;
        System.out.println(obj.salary);
        System.out.println(obj.EmployeeID);
        obj.increasedSalary(500);
        obj.extrahoursworked(6);
        obj.branchName();
    }
}
        