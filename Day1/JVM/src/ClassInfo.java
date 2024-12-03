import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class ClassInfo {
    public static void main(String[] args) {

        /*
        How to get information of the class
        - class name
        - no. of methods & details of each method
        - no. of fields & details of each field
        */

//        Employee e = new Employee();
//        Class c = e.getClass();
//        System.out.println(c.getName());
//        Method[] methods = c.getDeclaredMethods();
//        for(Method m : methods){
//            System.out.println(m.getName());
//        }
//
//        Field[] f = c.getDeclaredFields();
//        for (Field f1 : f){
//            System.out.println(f1.getName());
//        }

        /*
        To get information of the classloader
        */

        System.out.println(Employee.class.getClassLoader()); //returns applicationclassloader
        System.out.println(ClassInfo.class.getClassLoader()); //returns applicationclassloader
        System.out.println(String.class.getClassLoader()); // returns null bcz it doesn't have classloader object associated with it.
    }
}


