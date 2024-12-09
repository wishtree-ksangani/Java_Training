package ThreadPool;

import java.util.Date;

public class PrintThreadInfo implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Creation time of thread - " + threadName + " is " + new Date().getTime());
        for(int i= 0; i< 5; i++){
            System.out.println(threadName + " :-- " + i);
        }
        System.out.println(threadName + " Completed");
    }
}
