package Basic;

public class PrintOddNumber extends Thread{
    private int maxLength;

    /**
     * Set the max length till run method will iterate
     * @param maxLength Max Length
     */
    public PrintOddNumber(int maxLength){
        this.maxLength = maxLength;
    }

    /**
     * Prints the even number till the maxLength
     */
    @Override
    public void run() {
        System.out.println("Id of the thread odd num: " + this.threadId());
        System.out.println("Name of the thread off num: " + this.getName());
        for(int number = 0 ; number < maxLength; number++){
            if(number % 2 != 0){
                System.out.print(number + " ");
            }
        }
    }
}
