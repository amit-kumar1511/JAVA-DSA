public class constructors {
    public static void main(String[] args) {

        Student s1 = new Student();
       // Student s2 = new Student("Amit kumar");
     //   Student s3 = new Student(12);


        s1.name ="amit";
        s1.roll = 123;
        s1.password = "absd";

        Student s2 = new Student(s1);
        s2.password = "xyz";


        
    }
    
}

class Student{
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }

    // NoN parameterized constructor
    Student(){
        System.out.println("construcor is called....");
    }

    //  parameterized constctor
    Student(String name){
        this.name = name;
    }

    //  parameterized constructor
    Student(int roll){
        this.roll = roll;
    }
}
