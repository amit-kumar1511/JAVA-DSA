public class sumOfSubArr {

    public static void SubArrSum(int numbers[]){
       int currSum =0;
       int maxSum = Integer.MIN_VALUE;

        //1st loop for find start sub arr
        for(int i=0; i<numbers.length; i++){
            int start = i;

            //2nd loop for find end sun arr
            for(int j=i; j<numbers.length; j++){
                int end = j;

                currSum = 0;
                //3rd loop for start to end tk sare element print krane ke lye
                for(int k=start; k<=end; k++){
                 //sub array sum
                 currSum += numbers[k];
                    
                }
                System.out.println(maxSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                
                
            }
           
        }
        System.out.print("maximum sum "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        SubArrSum(numbers);  //function call
    }
}

