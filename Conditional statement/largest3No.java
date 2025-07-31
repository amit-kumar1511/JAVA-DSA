// ELSE IF PROBLEM.

import java.util.Scanner;

public class largest3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int A = sc.nextInt();

        System.out.print("Enter second number: ");
        int B = sc.nextInt();

        System.out.print("Enter third number: ");
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println("A is largest number.");
        }
        else if (B >= C) {
            System.out.println("B is largest number.");
        }
        else{
            System.out.println("C is largest number.");
        }
}
}
