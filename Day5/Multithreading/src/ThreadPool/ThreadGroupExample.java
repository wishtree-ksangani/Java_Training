package ThreadPool;

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("ParentThreadClass");
        Thread thread1 = new Thread(threadGroup, new PrintThreadInfo(), "Thread-1");
        Thread thread2 = new Thread(threadGroup, new PrintThreadInfo(), "Thread-2");
        Thread thread3 = new Thread(threadGroup, new PrintThreadInfo(), "Thread-3");
        Thread thread4 = new Thread(threadGroup, new PrintThreadInfo(), "Thread-4");
        Thread thread5 = new Thread(threadGroup, new PrintThreadInfo(), "Thread-5");
        Thread thread6 = new Thread(threadGroup, new PrintThreadInfo(), "Thread-6");

        System.out.println("Active threads before started : " + threadGroup.activeCount());
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        System.out.println("Active threads after started : " + threadGroup.activeCount());
    }
}
