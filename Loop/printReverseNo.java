// while LOOP PROBLEM.

import java.util.Scanner;

public class printReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no :");  //input no 1234
        int n = sc.nextInt();
        int reverse = 0;  //automatic rev ke lye (p2)
        while (n > 0) {
            int lastdigit = n%10;   //find last digit 4(all)
            //System.out.println(lastdigit);  //print lastdigit (p1)
            
            reverse = (reverse * 10) + lastdigit; //lastdigit print nhi automatic reverse hoga is formule se(p2)
            n = n/10;  // remove lastdigit from number 123 and continew loop(all)
        }

        //System.out.println();  //print next line + lastdigit print ke lye(p1)
        System.out.println(reverse);  // reverse digit ko print ke lye(p2)
    }
}
