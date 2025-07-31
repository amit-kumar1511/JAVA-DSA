import java.util.ArrayList;

public class Q_printAL {
    public static void main(String[] args) {
        // creating main arraylist 
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        //create 3 arrylist
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // add element
        for(int i = 1; i<=5; i++){
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        //all element add in mailist
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(3);

        //print main list
        //System.out.println(mainList);

        //print list in type of list
        //travel on mainlist
        for(int i=0; i<mainList.size(); i++){
            //store mainlist in currentlist
        ArrayList<Integer>currList = mainList.get(i);
        //travel on current list and print
        for(int j=0; j<currList.size(); j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
        }
    }
    
}
