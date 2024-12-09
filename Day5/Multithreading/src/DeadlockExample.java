public class DeadlockExample {
    public static void main(String[] args) {
        try{
            System.out.println("Entering into deadlock");
            Thread.currentThread().join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
