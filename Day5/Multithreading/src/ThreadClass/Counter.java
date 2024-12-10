package ThreadClass;

public class Counter implements Runnable {
    public int seconds;

    /**
     * Set the timer for how much second is to be wait
     * @param seconds
     */
    public Counter(int seconds){
        this.seconds = seconds;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(seconds);
            System.out.println("State of thread after calling join method : " + Main.thread.getState());
            Thread.sleep(seconds*20);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
