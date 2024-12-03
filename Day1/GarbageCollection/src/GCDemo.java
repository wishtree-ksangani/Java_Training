import com.sun.tools.javac.Main;

public class GCDemo {
    public static void main(String[] args) throws InterruptedException {

        /*
        * add finalize method which will decrease the nextId when employee is removed
        * we can use this for cleanup of also closing the database connectivity
        * finalize will clalled when gc.runFinalization will called
        * */

        GCDemo m = new GCDemo();
        Employee e1 = new Employee("Kevin", 21);
        Employee e2 = new Employee("Kevin", 21);
        Employee e3 = new Employee("Kevin", 21);

        e1 = null;
        e2 = null;

        System.out.println(Employee.nextId);
        System.gc();
        System.runFinalization();
        System.out.println(Employee.nextId);
    }
}
