import java.util.ArrayList;
import java.util.Collections;

public class sorting{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(7);

        System.out.println(list);
        Collections.sort(list); // sort element in assending order
        System.out.println(list); // after sorting

        Collections.sort(list , Collections.reverseOrder()); //sort element in dessending order
        System.out.println(list);// after sorting
    }
}
