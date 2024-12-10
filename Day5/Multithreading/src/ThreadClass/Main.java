package ThreadClass;

public class Main implements Runnable{
    public static Thread thread;
    public static void main(String[] args) {
        Main main = new Main();
        thread = new Thread(main);
        System.out.println("State of the thread at the creation time : " + thread.getState());
        thread.start();
        System.out.println("Stat of the thread after start it : " + thread.getState());
    }

    @Override
    public void run() {
        Counter counter = new Counter(20);
        Thread counterThread = new Thread(counter, "Counter thread");
        counterThread.start();
        try {
            Thread.sleep(50);
            System.out.println(Thread.activeCount());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("State of counter thread after calling the sleep : " + counterThread.getState());
        try {
            counterThread.join();
            System.out.println("State of counter thread after calling the join : " + counterThread.getState());
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("State of thread after executing it : " + Thread.currentThread().getState());
    }
}
