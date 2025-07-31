import java.util.*;

public class createArrayList {
    public static void main(String[] args) {
        
        // create Array list

        ArrayList<Integer> list = new ArrayList<>();  //integer is a class not a data type
        ArrayList<String> list2 = new ArrayList<>();    //string is a class not a function
        ArrayList<Boolean> list3 = new ArrayList<>();   //boolean is a class not a data type

        // operations in Arraylist

        //1.Add element tc=0(1) 

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //add element without remove element
        list.add(1,9); //add element in list index , element false value tc=(n) 
        //System.out.println(list);  
        //o/p= [1,2,3,4,5]

        //2.get element tv=0(1)

        int element = list.get(2);  //print index element
        //System.out.println(element);

        //3.Remove element tc=(n) linear time

      // list.remove(2);
    //System.out.println(list);

        //4.set element at index tc=(n) linear time

        list.set(2, 5);
        //System.out.println(list);

        //5.contain/find element tc=(n) linear time

        System.out.println(list.contains(1)); //return true  
        System.out.println(list.contains(11));

        //  SIZE OF ARRAYLIST
    
        System.err.println(list.size()); // size soesnot property that is method in Ar

            //loop in arraylist
            for(int i =0; i<list.size(); i++){
                System.out.println(list.get(i));
            }

    }
}
