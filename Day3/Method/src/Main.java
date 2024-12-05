import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        String department;

        Scanner sc = new Scanner(System.in);
//        take details of Employee form user
        System.out.print("Enter the name : ");
        name = sc.nextLine();

        System.out.print("Enter the Department : ");
        department = sc.nextLine();

        Employee e = Employee.createEmployee(name, department);
        e.printEmployeeDetails();
    }
}
