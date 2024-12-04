package sealed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) throws IOException {
//        scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine(); //It will take input from user


//        Buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your contact no : " );
        String contactNo = br.readLine();

    }
}
