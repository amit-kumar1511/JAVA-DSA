// SOLVE BIONOMIAL PROBLEN USINF BY FUNCTION

public class bionomialCofficient {

        public static int factorial(int n){   // calculate factrorial these fun 
            int fact =1;
           
            for(int i = 1; i<=n; i++){
                fact = fact * i;
               
            }
            return fact;
        }

        public static int bionomialCofficient(int n , int r){

            int nfact = factorial(n);  //call factorial fun 
            int rfact = factorial(r);    //call factorial fun
            int nrfact = factorial(n-r);    //call factorial fun
             
         //formula bionomialcofficient nCr = n! / r! * (n-r)! 
           int calculate = nfact / (rfact * nrfact);  //calculate bionomialcofficient
           return calculate;   // retorn calculation
        }
        public static void main(String[] args) {

           
    
       System.out.println(bionomialCofficient(5, 2));   //print bionomialcofficient 
         
    }
    }

