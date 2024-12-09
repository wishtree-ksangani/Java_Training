public class PriorityExample {
    public static void main(String[] args) {
//        Create a thread for printing the odd numbers with priority = 10
        Thread oddNumber = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int number = 0; number<20; number++){
                    if(number % 2 != 0)
                        System.out.println(number);
                }
            }
        }, "Odd Number");
        oddNumber.setPriority(Thread.MAX_PRIORITY); //It will set priority to 10;

        Thread evenNumber = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int number = 0; number<20; number++){
                    if(number % 2 == 0)
                        System.out.println(number);
                }
            }
        }, "Even Number");
        evenNumber.setPriority(Thread.MIN_PRIORITY); // It will set priority to 1;

        oddNumber.start();
        evenNumber.start();
//        Get the priority
        System.out.println("Priority of the of odd number thread : " + oddNumber.getPriority());
        System.out.println("Priority of the of even number thread : " + evenNumber.getPriority());
        System.out.println("Priority of the of main thread : " + Thread.currentThread().getPriority());
        System.out.println("Name of Even thread : " + evenNumber.getName());
        System.out.println("Name of Odd thread : " + oddNumber.getName());
        System.out.println("Name of Main thread : " + Thread.currentThread().getName());
    }

}
