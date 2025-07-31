public class binarToDecimle {

    public static void binTodec(int n){
       int pow = 0;
       int  decimle = 0;
      
       while (n > 0) {
        int ladtdigit = n  % 10;
        decimle = decimle +(ladtdigit *(int) Math.pow(2, pow));
        pow++;

        n = n/10;
       }
       System.out.println("decimal no is = "+ decimle);
    }
    public static void main(String[] args) {
        binTodec(101);
    }
}
