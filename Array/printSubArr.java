public class printSubArr {

    public static void PrintSubArr(int numbers[]){
        int totSubArr=0;
        //1st loop for find start sub arr
        for(int i=0; i<numbers.length; i++){
            int start = i;

            //2nd loop for find end sun arr
            for(int j=i; j<numbers.length; j++){
                int end = j;

                //3rd loop for start to end tk sare element print krane ke lye
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");  //print sub array
                    
                }
                totSubArr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("total sub array :"+totSubArr);//print for total subarray
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        PrintSubArr(numbers);  //function call
    }
}
