package track.recursion.gfg.cip.dsa.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveSumN {

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            System.out.println(Solue1.recursiveSum(n));
        }
    }
}

class Solue1
{
    // Complete the function
    // N: input element
    public static int recursiveSum(int N)
    {
        // Base Case :
        //          When N == 1, return 1
        if(N == 0) return N;
        return N + recursiveSum(N-1);
    }
}


