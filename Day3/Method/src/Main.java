import sealed.Circle;
import sealed.Rectangle;
import sealed.Shape;

import java.util.Scanner;

public class Main {
    public static void main(StringExample[] args) {

        String name;
        String department;

        Scanner scanner = new Scanner(System.in);
//        take details of Employee form user
        System.out.print("Enter the name : ");
        name = scanner.nextLine();

        System.out.print("Enter the Department : ");
        department = scanner.nextLine();

        Employee e = Employee.createEmployee(name, department);
        e.printEmployeeDetails();
        
        /*
        Abstract class as referencr
         */

        Shape shape = null;

        System.out.print("""
                Which Shape do you want to print ? 
                1 for circle & 2 for rectangle : """);
        int shapeNumber = scanner.nextInt();
//        Draw square if 1 else if 2 draw circle else show error msg
        switch (shapeNumber){
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Rectangle();
                break;
            default:
                System.out.println("You have Entered invalid input");
        }

        if(shape != null){
            System.out.println(shape.draw("Drawn the original one."));
        }
    }
}
