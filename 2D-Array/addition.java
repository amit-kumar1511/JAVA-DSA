import java.util.Scanner;

public class addition {
    public static void printMatrix(int matrix[][]){    //print matrix method
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void add(int matrix1[][] , int r1,int c1,int matrix2[][],int r2,int c2 ){  //add two matrix method
        if(r1 != r2 || c1 !=c2){
            System.out.println("wrong input addition not possible");
            return;
        }

        int sum[][] = new int[r1][c1];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(sum);  // print calculate sum matrix in output
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st matrix row and column");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int matrix1 [][] = new int [r1][c1];

        System.out.println("Enter 1st matrix value");
         for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix row and column");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int matrix2 [][] = new int [r1][c1];

        System.out.println("Enter 2nd matrix value");
         for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

       add(matrix1, r1, c1, matrix2, r2, c2);
       
    }
}
