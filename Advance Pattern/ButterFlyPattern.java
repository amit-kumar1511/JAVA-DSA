public class ButterFlyPattern {

    public static void butterfly(int n){
        //1st half pattern
        for(int i=1; i<=n; i++){

            //1st innerloop for print how many star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //2nd inner;oop for print how many spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //3rd innerloop for print how many half star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
          
        }
         
        //2nd half pattern
        for(int i=n; i>=1; i--){
         //1st innerloop for print how many star
         for(int j=1; j<=i; j++){
            System.out.print("*");
        }

        //2nd inner;oop for print how many spaces
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //3rd innerloop for print how many half star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
   
    public static void main(String[] args) {
        butterfly(4);
    }
}
