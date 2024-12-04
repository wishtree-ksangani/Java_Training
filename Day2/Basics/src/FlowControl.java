public class FlowControl {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        If else & if else ladder
        if(a > b){
            System.out.println("a is greater than b");
        }else if(a == 10){
            System.out.println("a is equals to 10");
        }
        else {
            System.out.println("a is less than b");
        }

        System.out.println();

//        For loop
        for(int i=0; i < a; i++){
            for (int j = 0; j <=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

//        For each loop
        System.out.println("For each loop...");
        int[] arr = {1,2,3,4,5,6};

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();


//        While loop control flow statement used to execute the block of statements repeatedly until the given condition evaluates to false
        while(a > 0){
            System.out.print(a-- + " ");
        }

//        do-while loop for exit control loop it ensures the code inside the block is executes at least one time.
        do{
            a++;
        }while (a < 10);

//        break will stop the execution of current loop or its parent loop
        do{
            a--;
            if(a == 5)
                break;
        }while (a > 0);

//        continue for skiping the code below that block for the current iteration
        for(int i=0; i < a; i++){
            if(i % 2 == 0)
                continue;
            for (int j = 0; j <=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
}
