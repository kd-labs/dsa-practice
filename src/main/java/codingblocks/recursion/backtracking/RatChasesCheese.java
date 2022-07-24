package codingblocks.recursion.backtracking;

public class RatChasesCheese {

    public static void main(String[] args) {

        int[][] arr = new int[5][4];
        printAllPath(arr, 0, 0);

    }

    private static void printAllPath(int[][] arr, int cr, int cc) {

        // board boundary case
        if(cc < 0 || cc >= arr[0].length || cr < 0 || cr >= arr.length || arr[cr][cc] == 1 ) {
            return;
        }

        // Positive Base Case
        if(cr == arr.length-1 && cc == arr[0].length-1) {
            // set the cell
            arr[cr][cc] = 1;
            // print the maze
            for(int i = 0 ; i < arr.length ; i++) {
                for(int k = 0 ; k < arr[i].length ; k++) {
                    System.out.print(arr[i][k] + "\t");
                }
                System.out.println();
            }
            arr[cr][cc] = 0;
            System.out.println("********************************");
        }

        arr[cr][cc] = 1;
        printAllPath(arr, cr+1, cc);
        printAllPath(arr, cr, cc+1);
        printAllPath(arr, cr-1, cc);
        printAllPath(arr, cr, cc-1);
        arr[cr][cc] = 0;

    }
}
