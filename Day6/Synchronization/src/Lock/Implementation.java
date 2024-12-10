package Lock;

public class Implementation {
    public static void main(String[] args) {
        StoreAndFetch storeAndFetch = new StoreAndFetch();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                storeAndFetch.store(10);
                storeAndFetch.store(22);
                storeAndFetch.store(33);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                Reading data
                try {
                    System.out.println("Element present at position 1 : " + storeAndFetch.read(0));
                    System.out.println("Element present at position 1 : " + storeAndFetch.read(1));
                    System.out.println("Element present at position 1 : " + storeAndFetch.read(2));
                }catch (IndexOutOfBoundsException indexOutOfBoundsException){
                    System.out.println(indexOutOfBoundsException.getMessage());
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
