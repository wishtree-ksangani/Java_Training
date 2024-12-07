import java.io.IOException;

/**
 * Represents the employee.
 * <p>
 *     This class is provided the methods to create and display details of the employee.
 * </p>
 */
public class Employee {

    private int id;
    private String name;
    private String department;
    protected static int nextId = 0;

    /**
     * private constroctor because id is not of user choice it is unique and autogenerated
     *
     * @param id Id of the Employee
     * @param name name of the employee
     * @param department Department in which employee is worked
     */
    private Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    /**
     * Constructor
     *
     * @param name name of the employee
     * @param department Department in which employee is worked
     */
    public Employee(String name, String department){
        this(nextId++, name, department);
    }

    /**
     * Static method to Create object of employee bcz it is dhould be accessable without creating the instance of the object.
     *
     * @param name Name of the employee
     * @param department Department in which em
     * @return Object of Employee with given details
     */
    public static Employee createEmployee(String name, String department){
        return new Employee(nextId++, name, department);
    }

    /**
     * Method without any access modifier should be trated as default
     */
    void printEmployeeDetails(){
        System.out.println("""
                id : %d,
                name : %s,
                department : %s
                """.formatted(id, name, department));
    }

    /**
     * Add employee to the database
     *
     * <p>
     *     method with public access modifiers and exception list which it can throw
     * </p>
     *
     * @return Status 0 if not executed Status 1 if successfully executed
     * @throws IOException Thrown if length of name is greate than 10
     */
    public int addEmployeeToDatabase () throws IOException{
        if(name.length() > 10){
            throw new IOException("ZLength of name should be less then 10");
        }
        System.out.println("Employee is added successfully");

        return  0;
    }
}
