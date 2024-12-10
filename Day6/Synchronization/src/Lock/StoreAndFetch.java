package Lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/**
 * For storing and fetching the value in the list
 */
public class StoreAndFetch {
    private final List<Integer> numbers;
    private final Lock writeLock = new ReentrantLock();
    private final Lock readLock = new ReentrantLock();

    public StoreAndFetch() {
        numbers = new ArrayList<>();
    }

    /**
     * Storing the element at the end of the list
     * @param number
     */
    public void store(int number){
        writeLock.lock();
        numbers.add(number);
        writeLock.unlock();
    }

    /**
     * Value of element present at given position
     * @param position Index
     * @return value of element
     */
    public int read(int position){
        if(position < 0){
            throw new ArrayIndexOutOfBoundsException("Accessed index is less than 0");
        }
//        check for element whether available or not.
        int answer = 0;
        readLock.lock();
        try {
            if(position < numbers.size()){
                answer = numbers.get(position);
//                sleep the thread for 1 second after read operation
                Thread.sleep(1000);
            }else{
                throw new ArrayIndexOutOfBoundsException("Element at " + position + " is not available");
            }
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }finally {
            readLock.unlock();
        }
        return answer;
    }
}
