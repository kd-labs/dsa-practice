package track.recursion.gfg.cip.dsa.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveSequence {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            System.out.println(new Sequence().theSequence(n));
        }
    }
}

class Sequence
{
    // N: input element
    public static int theSequence(int N)
    {
        if(N == 0) return 1;
        return N + (N * theSequence(N-1));
    }

}
