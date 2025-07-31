import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number :");
        int A = sc.nextInt();

        System.out.println("Enter operator any (+,-,*,/,%) : ");
        char op = sc.next().charAt(0);

        System.out.println("Enter second number :");
        int B = sc.nextInt();

        switch (op) {
                 case '+': System.out.println( A + B);
                 break;
            
                 case '-': System.out.println(A - B);
                 break;
        
                 case '*': System.out.println( A * B);
                 break;
        
                 case '/': System.out.println( A / B);
                 break;
        
                 case '%': System.out.println( A % B);
                 break;
        
                default:System.out.println("Enter vaild operator.");
                break;
        }
    }
}
