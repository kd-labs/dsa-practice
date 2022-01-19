package track.recursion.gfg.cip.dsa.basic;

import java.io.IOException;

public class CheckPalindrome {
    public static void main(String args[])throws IOException
    {
        System.out.println(new Solve().isPalin(71205217)?1:0);
    }
}

class Solve
{
    // Complete the function
    // N: input element
    static boolean isPalin(int N)
    {
        int reverseOfN = reverseRecursive(N, 0);
        return N == reverseOfN ? true : false;
    }

    static int reverseRecursive(int N , int temp) {
        if(N == 0) return temp;
        temp = (temp * 10) + N%10;
        return reverseRecursive( N/10, temp);
    }
}
