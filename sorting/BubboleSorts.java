public class BubboleSorts {

    public static void BubboleSort(int arr[]){
            
        int n = arr.length;

        //n-1 itteration comparision
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                //swap
                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
    }
     
    //print sortded element 

    public static void main(String[] args) {
        int arr[] = {4,3,5,8,3,2,1};
        BubboleSort(arr);
        //print sortded element 
        for(int i : arr){
            System.out.print(i+" ");
        }
       
    }
}
