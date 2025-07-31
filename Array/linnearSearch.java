public class linnearSearch {

    public static int LinnearSearch(int numbers[], int key){ //create function
        //loop for trevel all index
        for(int i=0; i<numbers.length; i++){
            //compare to index and key value
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int numbers[] = {12,34,54,46,35,24,56,39};//array
    int key = 56; //key

   int position = LinnearSearch(numbers,key);{//function call
    // agar wrong value enter kre to
    if (position == -1) {
        System.out.println("not foubnd");
    }else{
        System.out.print("fount at position :"+position);
    }
   }

   }
}
