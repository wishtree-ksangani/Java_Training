import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
//       Consumer which can only consume the input not going to return anything
        Consumer<String> greetMsg = (message) -> System.out.println("Greet msg is " + message);
        greetMsg.accept("well done.");

//        predicate It will tanke input and will returns a bollean value
        Predicate<Integer> oddNumber = (number) -> number % 2 == 0;
//        Odd numbers between 0 to 10
        System.out.println("Odd numbers between 0 to 10.");
        for(int i = 0; i < 10; i++){
            if(oddNumber.test(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();

//        UnaryOperator (One input arg and same the output)
        UnaryOperator<Integer> square = (a) -> a * a;
        System.out.println("5^2 =  " + square.apply(5));

//        BinaryOperator (two args of the same type as input and the same as the output)
        BinaryOperator<Integer> addition =  (a , b ) -> a + b;
        System.out.println("5 + 10 = " + addition.apply(5, 10));

//        Supplier
        Supplier<String> getGreetMessage = () -> "Welcome to the Kevin's house";
        System.out.println(getGreetMessage.get());
    }
}
