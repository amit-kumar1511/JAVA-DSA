//CALL BY VALUE , USING FUNCTION , SOLVE 2 SWAP VALUE PROBLEM

public class callByValue {

    public static void swap(int a, int b){  //formal parameters
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a ="+a); //print swaping values
        System.out.println("b ="+b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);  //actual parameter & call function. 
    }
}
