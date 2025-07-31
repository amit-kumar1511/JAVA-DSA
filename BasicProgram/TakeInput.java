import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = input.nextInt();  //take input as a integer

        System.out.println("Enter your name : ");
        String name = input.nextLine();   //take input as a string


    }
}
