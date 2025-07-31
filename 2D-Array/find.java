public class find {
   public static boolean search(int arr[][],int key){
       
        for(int i =0; i<arr.length; i++){ //represent row
            for(int j= 0 ; j<arr[i].length; j++){  // represent coloumns
                if(arr[i][j]==key){
                    System.out.println("elements fount at position" + i +","+ j);
                    return true;
                }
            }
           
        }
        return false;
    }
    public static void main(String[] args) {
    
int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};  //user input
        
search(arr, 5); //function call
    }
}
