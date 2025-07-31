public class halfPyramid {

    public static void half_Pyramid(int n){
        //outer loop for lines
        for(int i = 1; i<=n; i++){
            //1st innerloop for print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //2nd innerloop for print star
            for(int j=1;  j<=i; j++){
                System.out.print("*");
            }
            System.out.println();  //print nextline
        } 
    }
    public static void main(String[] args) {
        half_Pyramid(5);   //function call
    }    
}
