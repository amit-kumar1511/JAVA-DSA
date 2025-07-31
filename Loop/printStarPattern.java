//PETTERN PROBLEM

public class printStarPattern {
    public static void main(String[] args) {
        
        for(int line=1; line<=4; line++){  //kitne line star print krbani he uske lye outer loop
            for(int star=1; star<=line; star++){  //each line me kitne star print krbane hr uske lye inner loop
                System.out.print("* "); //print star using loop
            }
            System.out.println(); //loop end hone ke baad next line ke lye 
        }
    }
}
