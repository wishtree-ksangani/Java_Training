/*
 compile using the java -ea filename :- where -ea stan ds for enable assertion
 if compile using -da then no assertion exception is called

 - if condition becomes false it will throw **AssertionError** will be thrown
 - if message is specified after  ":" then that msg is passed with the exception
 */


public class AssertionExample {
    public static void main(String[] args) {
        //
        int number = 15;

        try {
            // Simple assertion
            assert number > 0;

            // Assertion with a message
            assert number < 10 : "Number is too large!";

            System.out.println("Number is valid: " + number);

        }
        catch (AssertionError ae){
            System.out.println(ae.getMessage());
        }
    }
}