// ELSE IF PROBLEM.

import java.util.Scanner;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;

        }
        else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * (0.2));  // use type casting, doublr convert to integer
        }
        else{
            tax = (int) (income * (0.3));
        }
          System.out.print("your taxes :" + tax);  //print calculate tax
        }
    }

