//function overloading using parameter

public class methodOL {
    // fubction 1 calculate sum of 2 no
    public static int sum(int a, int b){
        return a+b;
    }

     // fubction 2 calculate sum of 3 no
    public static int sum(int a, int b, int c){
        return a+b+c;
    } 

      // fubction 3 calculate sum of 4 no
      public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }


    //call all function
    public static void main(String[] args) {
        System.out.println(sum(10, 13));
        System.out.println(sum(10, 5, 9));
       System.out.println(sum(10, 4, 7, 8));
    }
    
}
