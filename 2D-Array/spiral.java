public class spiral {

    public static void printSpiral(int matrix[][]){
        int start_row =0;
        int start_col =0;
        int end_row = matrix.length-1;
        int end_col = matrix[0].length-1;

        while (start_row <= end_row && start_col <= end_col) {
            // top part print
            for(int j=start_col; j<=end_col; j++){
                System.out.println(matrix[start_row][j] +" ");
            }

            //right part
            for(int i=start_row+1; i<=end_row; i++){
                System.out.println(matrix[i][end_col]);
            }

            //bootom part
            for(int j=end_col-1; j>=start_col; j--){
                System.out.println(matrix[end_row][j]+ " ");
            }

            //left part
            for(int i=end_row-1; i<=start_row+1; i++){
                System.out.println(matrix[i][start_col]);
            }

            start_row++;
            end_col--;
            start_col++;
            end_col--;
        }

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(matrix);
    }
}
