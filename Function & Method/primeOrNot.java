// FUNCTION TO SOLVE OPTIMIZED PRIME OR NOT PROBLEM

public class primeOrNot {

    public static boolean isprime(int n){
        if(n == 2){   //2 ka 2 se divide krne pe 2 hi ata he esliye 2 ke lye always true
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){  // math.sqrt()- function use for find root N
            if(n % 2 == 0){  //check condition return 0 and 1
                return false;
            }
        }
        return true;
    }
      public static void main(String[] args) {
        System.out.println(isprime(16));
      }
}

