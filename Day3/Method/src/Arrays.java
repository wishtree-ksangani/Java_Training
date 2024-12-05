import java.util.stream.IntStream;
import java.util.*;
import java.util.stream.StreamSupport;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5};
        int[] numbersClone = numbers.clone();

        System.out.println("Comparison of original vs clone array : " + (numbers == numbersClone));
//        Comparison of each element
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " == " + numbersClone[i] + " : " + (numbers[i]==numbersClone[i]));
        }
//       Initialization an array using instream
        int[] numbers3 = IntStream.range(1, 4).toArray();
        int[] numbers4 = IntStream.rangeClosed(1, 4).toArray();
        int[] numbers5 = IntStream.of(1,2,5,4,5).toArray();

        System.out.print("numbers3 :" );
        for(int number : numbers3){
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("numbers4 : ");
        for(int number : numbers4){
            System.out.print(number+ " ");
        }
        System.out.println();

        System.out.print("numbers5 : ");
        for(int number : numbers5){
            System.out.print(number + " ");
        }
        System.out.println();
//        Jagged Array
        System.out.println("Jagged array");
        int[][] numbers6 = {
                {1},
                {1,2},
                {1,2,3}
        };
//        Accessing the jagged array
        for(int[] innerArray : numbers6){
            for(int i : innerArray){
                System.out.print(i + " ");
            }
            System.out.println();
        }
//        Prefix Sum
        java.util.Arrays.parallelPrefix(numbers, 0, numbers.length, Integer::sum);
        System.out.println("Parellel prefix : " + java.util.Arrays.toString(numbers));
//        Parellel prefix operation with custom function
        java.util.Arrays.parallelPrefix(numbers3, (a, b) -> (a * b));
        System.out.println("Parellel prefix : " + java.util.Arrays.toString(numbers3));
//        Parellal sort
        java.util.Arrays.parallelSort(numbers5);
        System.out.println(java.util.Arrays.toString(numbers5));
        // Create a Spliterator for the whole array
        Spliterator<Integer> spliterator = java.util.Arrays.spliterator(numbers, 0, numbers.length);
        // Create a parallel stream using the Spliterator
        StreamSupport.stream(spliterator, true)
                .forEach(number -> System.out.println(Thread.currentThread().getName() + ": " + number));
    }
}
