public class polymorphism {

    // method overloading class
    
    public static void main(String[] args) {
      //  Calculator calci = new Calculator();
      //  System.out.println(calci.sum(3, 04));
       // System.out.println(calci.sum((float)1.3, (float)2.4));
       // System.out.println(calci.sum(2, 3, 7));


       
    // method overiding

         Deer d = new Deer();  // agar child class ke obj bnayenge to child class bala hi fumnction call hoga
        d.eat(); //o/p-eat grass

    }
}

class Calculator{
    int sum(int a , int b){  //sum two no integer
        return a + b;
    }
    float sum(float a , float b){  //sum two no floting value
        return a + b;
    }

    int sum (int a , int b, int c){   // sum two no integer vale
        return a+ b + c;
    }
}



// method overiding



class Animal {
    void eat(){
        System.out.println("eats");
    }
}

class Deer extends Animal{
        void eat(){
            System.out.println("eat grass");
        }
    }
