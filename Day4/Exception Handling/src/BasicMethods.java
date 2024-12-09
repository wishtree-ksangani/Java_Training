import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMethods {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 10;

        try{
//            It will throw an error bcz it will not able divide by 0.
            computeDivision(number1, number2);
        }catch (ArithmeticException arithmeticException){
//            printStackTrace method prints exception information in the format of the Name of the exception: description of the exception, stack trace.
            arithmeticException.printStackTrace();
//            toString method prints only the exception name and description
            System.out.println("toString method  : " + arithmeticException.toString());
//            getmessage prints the description of the message
            System.out.println("getMEssage : " + arithmeticException.getMessage());
        } catch (SameNumberException sameNumberException) {
            System.out.println(sameNumberException.toString());
            System.out.println("chained exception : " + sameNumberException.getCause().toString());
        } finally {
            System.out.println("Inside the finally block");
        }
    }

    /**
     * Compute division operation
     *
     * @param number1
     * @param number2
     */
    public static void computeDivision(int number1, int number2) throws SameNumberException {
        int answer;
        try{
            if(number1 == number2){
//                Chained exception handling
                SameNumberException sameNumberException = new SameNumberException("Both Numbers are same");
                sameNumberException.initCause(new ArithmeticException("Arithmatic exception"));
                throw sameNumberException;
            }
            answer = number1 / number2;
        }catch (NumberFormatException numberFormatException){
            System.out.println("Number formatException occured : " + numberFormatException.toString());
        }
    }

    /**
     * Takes Input from the user
     *
     * @param message User message for inpput
     * @return return input added by the user
     * @throws IOException Exception occured during the IO operations
     */
    public String takeUserInput(String message) throws IOException {
        System.out.print(message + " : " );
//        While reading using Bufferd reader it throws checked exception
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }
}
