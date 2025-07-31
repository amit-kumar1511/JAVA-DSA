 class Student {    //java class ex
    
    int rollNo; // attribute   // data member(alsi instance variable)
    String studentName; // attribute 

 }
public class Main{
    public static void main(String[] args) {
        // creating an object 1

        Student obj1 = new Student();

        obj1.rollNo=1;  // setting attribute value
        obj1.studentName = "amit kumar";

        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

         // object 2
        
         Student obj2 = new Student();

        obj2.rollNo=2;
        obj2.studentName = "ankit kumar";

        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);
    }
}
 