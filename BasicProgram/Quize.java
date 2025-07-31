/*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen a
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)/* */


import java.util.Scanner;

public class Quize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the pencile price :");
        float pencile = sc.nextFloat();

        System.out.println("enter the eraser price :");
        float eraser = sc.nextFloat();

        System.out.println("enter the pen price :");
        float pen = sc.nextFloat();

        float sum = (pencile+eraser+pen);
        System.out.println("pencile, eraser ,pen -cost : "+ sum);

        float GST = (sum*10)/100;
        System.out.println("GST 10% :"+GST);

        float result = sum+GST;
        System.out.println("Total cost : "+result);

        
    }
}
