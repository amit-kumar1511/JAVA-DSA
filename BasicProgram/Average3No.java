import java.util.Scanner;

public class Average3No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int a = sc.nextInt();

        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        System.out.println("Enter the third number :");
        int c = sc.nextInt();

        System.out.println("average :");
        int n = sc.nextInt();

        int average = (a+b+c)/n;

        System.out.println(average);
    }
}
