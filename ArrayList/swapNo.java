import java.util.ArrayList;

public class swapNo {
    public static void Swaping(ArrayList<Integer> list , int index1,int index2){
        int temp = list.get(index1);  // index1 ko temp variable  mw daal dye
        list.set(index1 , list.get(index2)); // uske baad index pe index2 set kr dye
        list.set(index2,temp); // fir index2 pr temp value

    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(5);

        int index1 = 1 , index2 = 3;
        System.out.println(list); //print normal list

        Swaping(list,index1,index2);

        System.out.println(list);  //after swaoing new list
    }
}
