public class sumNaturalNo {
    public static int calSum(int n){

        if (n  ==  1) {
            return 1;
        }
        int sum =calSum(n-1);
        int sn = n +  sum;
        return sn ;
    }
    public static void main(String[] args) {
         int n= 5;
         System.out.println(calSum(n));
    }
}
