public class NQueen {
    
        public static boolean IsSafe(char board[][] , int row , int col){
            // check verticall up
            for(int i=row-1; i>=0; i++){
                if (board[i][col] == 'Q') {
                    return false;
                }
            }
        

            // digonal left up
            for(int i =row-1, j=col-1; i>=0 && j>=0; i--, j++){
                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            //digonal right up
            for(int i =row-1, j=col+1; i>=0 && j<board.length; i--, j++){
                if (board[i][j] == 'Q') {
                    return false;
                }}
            return false;

        }
        public static void nQueens(char board[][] , int row){
        //base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
           if (IsSafe(board,row,j)) {
             board[row][j] = 'Q';  // 1st row me queen ko bethana he 
            nQueens(board, row+1); // recursive call foe next row
            board[row][j] ='x'; //after backtracking to remove previous queen
            
           }
        }

    }

    public static void printBoard(char board[][]){
        System.out.println("-----------------------");
        for(int i=0;i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int n =4;
        char board [][] = new char[n][n];

        for(int i= 0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x'; //initlize row and column are blank
            }
        }
        nQueens(board, 0);
    }
}

