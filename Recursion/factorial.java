public class factorial {
    public static int fact(int n){
        if (n == 0) {
          
            return 1;
        }
        int fact =  fact(n-1);
        int factN  = n  * fact(n-1);
        return factN;
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(fact(n));
    }
}
