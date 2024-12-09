package Basic;

public class PrintEvenNumbers implements Runnable{
    private int maxLength;

    /**
     * Set the max length till run method will iterate
     * @param maxLength Max Length
     */
    public PrintEvenNumbers(int maxLength){
        this.maxLength = maxLength;
    }

    /**
     * Prints the even number till the maxLength
     */
    @Override
    public void run() {
        for(int number = 0 ; number < maxLength; number++){
            if(number % 2 == 0){
                System.out.print(number + " ");
            }
        }
    }
}
