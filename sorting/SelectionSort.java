public class SelectionSort {

    public static void SelectionSorts(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest =i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }  
            }

            //swap
            int temp =arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,8,2,1,0,4,3};
        SelectionSorts(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
