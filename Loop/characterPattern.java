//P€TTERN PROBLEM

public class characterPattern {
    public static void main(String[] args) {
        
        int n = 4;   //jitne line print krbana he uska value variable me store kr lya he
        char ch ='A';   //character variable

        for(int line = 1; line <= n; line++){   //kitni line star print krbana he uske lye outerloop
            for(int character=1; character<=line; character++){
                System.out.print(ch); //character print krbane ke lye ex- A,B,c...
                ch++;    //character ki value badhane ke lye jese a ke baad next line b se start ho
            }
            System.out.println();
        }
    }
}
