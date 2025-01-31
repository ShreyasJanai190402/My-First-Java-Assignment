class Employee {
    private static int empCount = 0;  
    private int empNo;
    private double salary;
    private static double totalSalary = 0;  

  
    public Employee(double salary) {
        empCount++;
        this.empNo = empCount;  
        this.salary = salary;
        totalSalary += salary;  
    }

  
    public void display() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Salary: " + salary);
        System.out.println("Total Salary of all employees: " + totalSalary);
        System.out.println("----------------------------");
    }

    
    public static double getTotalSalary() {
        return totalSalary;
    }
}

public class EmployeeClient {
    public static void main(String[] args) {
      
        Employee emp1 = new Employee(5000);
        Employee emp2 = new Employee(6000);
        Employee emp3 = new Employee(7000);

      
        emp1.display();
        emp2.display();
        emp3.display();
        
      
        System.out.println("Total Salary of all employees: " + Employee.getTotalSalary());
    }
}
