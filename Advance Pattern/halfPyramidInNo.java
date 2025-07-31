public class halfPyramidInNo {

    public static void half_Pyramid_withNo(int n){
        //outer loop for print line
        for(int i=1; i<=n; i++){
            //inner loop for print number
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_Pyramid_withNo(5);
    }
}
