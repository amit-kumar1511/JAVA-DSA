import java.util.ArrayList;

public class multiDimesionalAL {
    public static void main(String[] args) {
        
        // creating multidimensional arraylist
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // creating 1st Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2);
        mainList.add(list);

        //creating 2nd arraylist
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);


    }
}
