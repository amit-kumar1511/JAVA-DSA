public class print {
    static void printArray(int arr[][]){
       
        for(int i =0; i<arr.length; i++){ //represent row
            for(int j= 0 ; j<arr[i].length; j++){  // represent coloumns
                System.out.print(arr[i][j] +" "); //print row and columns
            }
            System.out.println();  //print next line
        }
    }
    public static void main(String[] args) {
    //int arr[][] = new int [3][3];  
int arr2[][] ={{1,2,3},{4,5,6},{7,8,9}};  //user input
        
printArray(arr2);  //function call
    }
}
