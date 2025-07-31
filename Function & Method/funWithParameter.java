//IN FUNCTION WITH PARAMETER , SOLVE ADD 2 NO PROBLEM

import java.util.Scanner;

public class funWithParameter {
 public static int calculateSum(int num1 ,int num2){  //parameters and formal parameters
    int sum = num1 + num2;  // calculate sum
     return sum;
 }   
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();  //input first no
    int b = sc.nextInt();   //input second number

    int sum = calculateSum(a , b);  //arguments and actual parameters
    System.out.println("sum is "+ sum);   //print sum

 
}}
