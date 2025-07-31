public class AM {
    public static void main(String[] args) {

        // method call
        App3 obj3 = new App3();
        obj3.printFromOutsodePackage();
    }
}
class App3{
    App obj = new App();
    void printFromOutsodePackage(){
        System.out.println(obj.str1);
    }
}
