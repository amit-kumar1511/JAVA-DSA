// WHILE LOOP PROBLEM 


import java.util.Scanner;

public class sumAllNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the natural no of sum :");  //input n number 
        int n = sc.nextInt();

        int sum =0;
        int i = 1;

        while ( i <= n) {
            sum = sum + i;  //store and sum all number
            i++;
        }
        System.out.println("sum is :"+sum);  // print sum
    }
}
