public class largestNo {

    public static int LargestNo(int numbers[]){
       int largest = Integer.MIN_VALUE; //-infinity tk store integer lowest value
       int smallest = Integer.MAX_VALUE; //+ infinity 

       //trevel to all index
       for(int i=0; i<numbers.length; i++){
        //compare to all number from largest then update
        if (largest < numbers[i]) {
            largest = numbers[i];
        }
        // compare to all and then find smmaleswt value
        if (smallest > numbers[i]) {
            smallest = numbers[i];
        }
       }
       System.out.println("smallest value :"+smallest);//print smallest value
       return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        //print and function call
        System.out.print("largest no :" + LargestNo(numbers));
    }
}
