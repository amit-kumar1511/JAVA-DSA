import java.util.Scanner;

public class createArray {
    public static void main(String[] args) {
        //create a araay size 
        int marks[] = new int[50];  

        Scanner sc = new Scanner(System.in);

        //create 3 subjects of marks
        System.out.println("enter physics msrks ");
        marks[0] = sc.nextInt();
        System.out.println("enter chemestery marks ");
        marks[1] = sc.nextInt();
        System.out.println("enter math marks ");
        marks[2] = sc.nextInt();

        //print 3 subject of marks
        System.out.println("phy :"+marks[0]);
        System.out.println("chem :"+marks[1]);
        System.out.println("math :"+marks[2]);
        //UPDATE SUBJECT MARKS

        //marks[2] = marks[2] + 2;
        //System.out.println("math :"+marks[2]);

        //all subject to find percentage 
        int percentage = (marks[0] + marks[1] + marks[2])  / 3;
        System.out.println("percentage :"+percentage+"%");
       
    }
}
