public class reverseArr {
    public static void ReverseArr(int numbers[]){
        int first =0 , last = numbers.length -1;

        while (first < last) {

            //swap two value
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;//first 1 index aage badhega
            last--;// last 1 index piche aayega
        }
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,5,6,7,8,9};

        ReverseArr(numbers);  //functon call
        //print arrays
        for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");
        }
        System.out.println();
    } 
    
}
