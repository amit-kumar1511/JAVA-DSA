import java.util.Scanner;

public class AreaOfCircle {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Redius : ");    //take input redius
    float rad = sc.nextFloat();

    float area = 3.14f * rad * rad;   // calculate redius formula pi*r*r

    System.out.println(area);   //result


 }   
}
