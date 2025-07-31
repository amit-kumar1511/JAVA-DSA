public class printDecNo {
    public static void DecreasingOrder(int n){
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        DecreasingOrder(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        DecreasingOrder(n);
    }
}
