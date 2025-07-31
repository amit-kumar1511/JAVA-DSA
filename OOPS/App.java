public class App {
    public String str1 = "i am a public member";
    // method
    void printFromClass(){
        System.out.println("within class " + str1);
    }

    public static void main(String[] args) {

        App obj = new App();

        obj.printFromClass();
        System.out.println("within class " + obj.str1);


            // method call
        App2 obj2= new App2();
        obj2.printFromOutsodeClass();
    }
}

class App2{
    void printFromOutsodeClass() {
        App obj = new App();
        
        System.out.println("within class but0outside from class " + obj.str1);
    }
}
