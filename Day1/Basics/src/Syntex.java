import java.util.Objects;
import java.util.Stack;

// File name should be Syntex.java
public class Syntex {

    public static void main(String[] args) {
        System.out.println(getClassName("Kevin"));  // output : java.lang.String

    }

    /**
     Get the Name of the class
     - This is documenrt comment which show the Information or description.
     */
    public static String getClassName(Object o){
        return o.getClass().getName();
    }

}
