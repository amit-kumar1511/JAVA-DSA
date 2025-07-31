import java.util.Scanner;

public class SumTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rhe first no : "); //take input first no
        int a = sc.nextInt();

        System.out.println("Enter the second no : ");  // take input seond no 
        int b = sc.nextInt();

        int sum = a + b;  //sum two no

        System.out.println(sum);  //print result
        
    }
}
