public class InterafeImplementation {
    public static void main(String[] args) {
//        Lamda expression for the make addition with the functional interface
        Operation<Integer> addition = (num1,  num2) -> num1 + num2;
//        Lamda expression for the make substraction with the functional interface
        Operation<Integer> substraction = (num1, num2) -> num1 -  num2;

        System.out.println("Addition of 1, 2 : " + addition.operate(1, 2));
        System.out.println("Substraction of 1, 2 : " + substraction.operate(1,2));
    }
}
