package Deadlock;

public class Main {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();
//        Create threads which are consuming the resources
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                resource1.consume(resource2);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                resource2.consume(resource1);
            }
        });
//        Starting both thread at same time
        thread1.start();
        thread2.start();
    }
}
