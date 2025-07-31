//USING FUNCTION TO SOLVE PRODUCT OF TWO NUMBER

public class productOf2No {

    public static int multiply(int a , int b){ //formal parameter
        int product = a * b;  //product of 2 no
        return product;
    }
    public static void main(String[] args) {
        int a =10;
        int b = 5;
        int prod = multiply(a, b);   //actual parameter & call function & in store prod
        System.out.println("a * b = " +prod);

        prod = multiply(10 ,10);  //call function
        System.out.println("a * b = " +prod);  //print product of two no
    }
}
