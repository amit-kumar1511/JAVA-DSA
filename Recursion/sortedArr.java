public class sortedArr {
    public static boolean IsSorted(int arr[], int i){
        //base case
        if (i == arr.length-1) {
            return true;
        }
        //check condition
        if (arr[i] > arr[i+1]) {
            return false;
        }
        //function call for next comparision
        return IsSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};
        //print soted arr or not
        System.out.println(IsSorted(arr, 0));
    }
}
