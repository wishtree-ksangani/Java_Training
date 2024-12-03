import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class ClassInfo {
    public static void main(String[] args){
        Employee e = new Employee();
        Class c = e.getClass();
        System.out.println(c.getName());
        Method[] methods = c.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }

        Field[] f = c.getDeclaredFields();
        for (Field f1 : f){
            System.out.println(f1.getName());
        }
    }
}


