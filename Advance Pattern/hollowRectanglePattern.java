public class hollowRectanglePattern {

    public static void hollowRectangle(int totrows , int totcols){
        //outerloop travels all line rows
        for(int i = 1; i<=totrows; i++){
            //innerloop trevels all coloums
            for(int j=1; j<=totcols; j++){  //cell(i,j)
                
                //boundery cells pr print * otherwise space print
                if (i == 1 || i==totrows || j==1 || j==totcols ) {  
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                
              
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRectangle(4, 5);   //function call
    }
}