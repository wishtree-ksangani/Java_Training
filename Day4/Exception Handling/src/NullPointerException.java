public class NullPointerException {
    public static void main(String[] args) {
        String name = null;
//        Example of nullpointer exception
        try {
            System.out.println(name.length());
        }catch (java.lang.NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception is encountered");
        }
//        Example of IllegaArgumentException
        try {
            System.out.println(getLength(name));
        }catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Illegal argument is caught");
        }
    }

    public static int getLength(String string)
    {
        if (string == null)
            throw new IllegalArgumentException(
                    "The argument cannot be null");
        return string.length();
    }
}
