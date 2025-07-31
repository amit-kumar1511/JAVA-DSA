public class triangle {

    public static void traiangle(int n){
        //outer loop for print total line
        for(int i=0; i<=n; i++){
            //innerloop for print how may coloum item 
            for(int j=1; j<=i; j++){
                //check condition no even he to print 1 otherwise 0
                if ((i+j)%2==0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        traiangle(5);  //function call
    }
}
