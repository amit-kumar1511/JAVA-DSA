public class flyodsTriangle {

    public static void floyd_triangle(int n){
        int counter=1; //number increase krne ke lye
        //outer loop for print total lines
        for(int i=1; i<=n; i++){
            //inner loop for print how many time counter print
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        floyd_triangle(5);
    }
}
