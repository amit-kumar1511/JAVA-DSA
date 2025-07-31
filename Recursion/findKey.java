public class findKey {
    public static int keyFind(int arr[],int i, int key){
        //base case
        if (i == arr.length) {
            return -1; //-1 denote not a number
        }
        // agar key mil jayegi to index return kr denge
        if (arr[i] == key) {
            return i;
            
        }
        //nhi mili to function call krke i+1 krenge
        return keyFind(arr, i+1,key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,6,4,3,8,9};
        //print
        System.out.println(keyFind(arr, 0, 8));
    }
}
