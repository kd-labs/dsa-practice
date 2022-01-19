package track.recursion.gfg.cip.dsa.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            System.out.println(new Solution().factorial(n));
        }
    }
}

class Solution
{
    // complete the function
    // N: input element
    static int factorial(int N)
    {
       // Base Case :
       //           When N == 0, return 1;
        if(N == 0) return 1;
        return N * factorial(N-1);
    }
}
