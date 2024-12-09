package Basic;
/*
different outputs:
- 0 2 4 6 8 10 12 1 14 16 18 3 5 7 9 11 13 15 17 19
- 1 3 0 2 5 4 6 8 10 12 14 16 18 7 9 11 13 15 17 19
- 0 2 4 6 8 1 3 5 7 9 11 13 15 17 19 10 12 14 16 18
 */

public class ThreadInstances {
    public static void main(String[] args) throws InterruptedException {
        Thread printOddNumbers = new PrintOddNumber(20);
        Runnable printEvenNumbers = new PrintEvenNumbers(20);
//        Running both threads at same time
        printOddNumbers.start();
//        This runs synchronously in the current thread not in the new thread
        printEvenNumbers.run();


//        We can also pass runable instance to the thread class's constructor to get the details of the thread
        Thread printEvenNumbersByThread = new Thread(printEvenNumbers);
        System.out.println();
        printEvenNumbersByThread.start();
//        Thread's details
        System.out.println("Id of the thread : " + printEvenNumbersByThread.threadId());
        System.out.println("Name of the thread : " + printEvenNumbersByThread.getName());
    }
}
