package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    private static final int MAX_T = 3;
    public static void main(String[] args) throws InterruptedException {
        Runnable thread1 = new PrintThreadInfo();
        Runnable thread2 = new PrintThreadInfo();
        Runnable thread3 = new PrintThreadInfo();
        Runnable thread4 = new PrintThreadInfo();
        Runnable thread5 = new PrintThreadInfo();
        Runnable thread6 = new PrintThreadInfo();
//        Fixed size thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_T);
        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);
        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.shutdown();
        Thread.sleep(3000);
//        Cached ThreadPool
        System.out.println("\n\nCached Thread pool");
        try (ExecutorService cachedExecutorService = Executors.newCachedThreadPool()) {
            cachedExecutorService.execute(thread1);
            cachedExecutorService.execute(thread2);
            cachedExecutorService.execute(thread3);
            cachedExecutorService.execute(thread4);
            cachedExecutorService.execute(thread5);
            cachedExecutorService.execute(thread6);
            cachedExecutorService.shutdown();
        }
        Thread.sleep(3000);
//        SingleThreaded Threadpool
        System.out.println("\n\nsingleThreaded Thread pool");
        try (ExecutorService singleExecutorService = Executors.newSingleThreadExecutor()) {
            singleExecutorService.execute(thread1);
            singleExecutorService.execute(thread2);
            singleExecutorService.execute(thread3);
            singleExecutorService.execute(thread4);
            singleExecutorService.execute(thread5);
            singleExecutorService.execute(thread6);
            singleExecutorService.shutdown();
        }
    }
}
