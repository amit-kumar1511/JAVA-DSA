public class staticKeyWord {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "abc";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  //op - s1 kaq school name 

        Student s3 = new Student();
        s3.schoolName = "xyz";  // all student school name xyz 
    }
    
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String setName(){
        return this.name;
    }
}
