import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count = new AtomicInteger();
    public volatile boolean flag = true;

    /**
     * set the value og the counter
     * @param count
     */
    public void setCount(int count){
        this.count.set(count);
    }

    /**
     * Increment counter variable
     */
    public void increment(){
        this.count.incrementAndGet();
    }

    /**
     * Get the value of the counter variable
     * @return the value of the counter
     */
    public int getCount(){
        return count.get();
    }
}
