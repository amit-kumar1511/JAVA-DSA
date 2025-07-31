import java.util.Scanner;

public class printIncNo {

    public static void printing(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
         printing(n-1);
        System.out.println(n);
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
System.out.print("enter you want to print a number : ");
        int n = sc.nextInt();
        

        printing(n);
    }
}
