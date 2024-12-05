import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VariableArguments {
    public static void main(String[] args) {

        if(args.length > 0){
            for(String arg : args){
                System.out.println(arg + " ");
            }
        }

        System.out.println("Enter the integers by space saperated and enter -1 to end.");
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while(a != -1){
            a = scanner.nextInt();
            list.add(a);
        }
//        Convert List to the arry so that it is passed in the sum method as varargs
        int[] intList = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Summetion is : " + sum(intList));

    }

    /**
     * for doing the summention of all the numbers passed in the arhuments
     *<p>
     *     Variable args should be always at the end and only one vararg are possible in one method
     *</p>
     * @param numbers Comma saperated Integers
     * @return Summetion off all the Integers
     */
    public static int sum(int ...numbers){
        int answer = 0;
//        iterate through numbers and add it to the sum.
        for(int number : numbers){
            answer += number;
        }
        return answer;
    }
}
