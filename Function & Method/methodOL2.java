//function overloading using DATA TYPE

public class methodOL2 {
    // fubction 1 calculate sum of 2 no
    public static int sum(int a, int b){
        return a+b;
    }

     // fubction 2 calculate sum of 3 no
    public static float sum(float a, float b){
        return a+b;
    } 



    //call all function
    public static void main(String[] args) {
        System.out.println(sum(10, 13));
        System.out.println(sum(1.1f, 1.2f));
       
      
    }
    
}

