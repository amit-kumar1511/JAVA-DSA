public class abstr_act {
    public static void main(String[] args) {

        Horses h = new Horses();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        //constructor call object
        dog d = new dog();  // constructor call output sabse phele parent constructor call hoga esliye o/p - brown aayega€
        
    }
}
abstract class Animal {
    // constructor call
    Animal(){
        System.out.println("animal constructor is clled");
    }
   
    // non abstract method
    void eat(){
        System.out.println("eats");
    }

    // abstract method
    abstract void walk();
    
}

class Horses extends Animal {
    // constructor call
    Horses(){
        System.out.println("horses constructor is called");
    }
    // implimentation of abract method
    void walk(){
        System.out.println("4 lages");
    }
}

class dog extends Horses{
    // constructor call
    dog(){
        System.out.println("dog constructor is called");
    }
}

class Chicken extends Animal{
    // implimentation of abract method
    void walk(){
        System.out.println("2 lages");
    }
}
