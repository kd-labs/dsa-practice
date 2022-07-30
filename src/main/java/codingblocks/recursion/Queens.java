package codingblocks.recursion;

public class Queens {

    public static void main(String[] args) {

    }

    private static void printQueens(boolean[] board, int tq, String ans, int qspf) {

        if(qspf == tq) {
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < board.length ; i++) {
            if(board[i] == false) {
                board[i] = true;
                printQueens(board, tq, ans+"b"+i+"q"+qspf, qspf+1);
                board[i] = false;
            }
        }

    }
}
