import java.util.Scanner;

public class user {
    static void printArray(int arr[][]){
       
        for(int i =0; i<arr.length; i++){   //represent row
            for(int j= 0 ; j<arr[i].length; j++){   // represent coloumns
                System.out.print(arr[i][j] +" ");   //print row and columns
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter no of rows : ");  
    int row = sc.nextInt();

    System.out.println("Enter no of columns : ");
    int column = sc.nextInt();

    int arr[][] = new int [row][column];   //total element row*columns

System.out.println("Enter "+ row*column+" elements");

    for(int i=0; i<row; i++){  //take input row
        for(int j=0; j<column; j++){ // take input columns
            arr[i][j] = sc.nextInt();  //array of 2d arry input
        }
    }

    
        
printArray(arr);
    }
}
