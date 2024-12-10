package Deadlock;

/**
 * Class With stnchronized method for the thread safty
 */
public class Resource {
    public synchronized void consume(Resource resource)  {
        System.out.println("Consuming the resources");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        resource.printMessage();
    }

    public synchronized void printMessage(){
        System.out.println("Inside the Resource class printMessage method");
    }
}
