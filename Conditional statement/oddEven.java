// IF ELSE PROBLEM

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no : ");
        int A = sc.nextInt();

        if (A % 2 ==0 ) {   // 
            System.out.println("Given number is even .");
        }
        else{
            System.out.println("Given number is odd.");
        }

    }
}
