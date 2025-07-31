public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// parent / base class
class Animal{
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath (){
        System.out.println("braths");
    }
}

// child / derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims");
    }


    
}
