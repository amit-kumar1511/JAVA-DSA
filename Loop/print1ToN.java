// WHILE LOOP PROBLEM 


import java.util.Scanner;

public class print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how you want to print no : ");
        int n = sc.nextInt();
        
        int i=0;
        

        while (i <= n) {
            System.out.println(i);
            i++;
        }
}
}    