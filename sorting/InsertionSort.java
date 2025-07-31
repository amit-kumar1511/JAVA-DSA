public class InsertionSort {

    public static void InsertionSorts(int arr[]){

        for(int i=0; i<arr.length; i++){
            int curr= i;//assume sorted part i
            while (curr > 0 && arr[curr] < arr[curr-1]){
                //swap
                int temp = arr[curr];
                arr[curr] = arr[curr-1];
                arr[curr-1] = temp;
                curr--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,2,6,1,0,5,3};

InsertionSorts(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
