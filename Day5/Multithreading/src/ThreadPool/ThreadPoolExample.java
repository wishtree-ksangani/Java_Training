package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    private static final int MAX_T = 3;
    public static void main(String[] args) {
        Runnable thread1 = new PrintThreadInfo();
        Runnable thread2 = new PrintThreadInfo();
        Runnable thread3 = new PrintThreadInfo();
        Runnable thread4 = new PrintThreadInfo();
        Runnable thread5 = new PrintThreadInfo();
        Runnable thread6 = new PrintThreadInfo();

        ExecutorService executorService = Executors.newFixedThreadPool(MAX_T);
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);

        executorService.shutdown();
    }
}
