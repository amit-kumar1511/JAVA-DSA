// IF ELSE PROBLEM

import java.util.Scanner;

public class largest2No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first no : ");
        int A = sc.nextInt();

        System.out.println("Enter second no : ");
        int B = sc.nextInt();

        if (A>B) {   //check condition 
            System.out.println("A is largest number.");
        }
        else{
            System.out.println("B is largest number.");
        }
}
}
