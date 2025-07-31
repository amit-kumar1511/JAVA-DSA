// BREAK STATEMENT (TO EXIT THE LOOP )

public class breakStatement {
    public static void main(String[] args) {
        
        for(int i =0; i<= 5; i++){
            if (i == 3) {   // check true condition
               // break;   //use bterak statement print 0,1,2
                continue;   //use continue print 1,2,4,5 (3)skip ho jayega
            }
            System.out.println(i);  //print i  0,1,2  3 is true condition the out of loop
        }
        System.out.println(" iam out of loop ");
    }
}
