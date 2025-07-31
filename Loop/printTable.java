//FOR LOOP PROBLEM

import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you want to print table :");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}
