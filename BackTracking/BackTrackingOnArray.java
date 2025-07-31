public class BackTrackingOnArray {
    public static void ChangeArray(int arr[] , int i , int val){
        //base case
        if (i == arr.length) {
            printArr(arr); //print base case array
            return;
        }

        //recursion(kaam)
        arr[i]=val;  // array me value assign kye
        ChangeArray(arr, i + 1, val + 1); // next index pe chale gaye
        //backtracking
        arr[i] = arr[i] - 2; //backtracking use krke array me value ko change kr diya -2
    }
    public static void printArr(int arr[]){  // array print krne ka function
        for(int i= 0 ; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) { // main function
        int arr[] = new int[5];
        ChangeArray(arr, 0, 1);
        printArr(arr);
    }

}
