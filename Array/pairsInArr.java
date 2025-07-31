public class pairsInArr {

    public static void PairsInArr(int numbers[]){
        int totalPair=0;
        for(int i =0; i<numbers.length; i++){

            int curr = numbers[i]; //current no firstr time 2 ,fir 4 ,fir 6..  
            for(int j =i+1; j<numbers.length; j++){

                System.out.println("("+curr+","+numbers[j]+")"); //print pair
                totalPair++;

            }
            System.out.println();
        }
        System.out.print("total pair :"+totalPair);//print total pair
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};  //array
        PairsInArr(numbers);  //function call
    }
}
