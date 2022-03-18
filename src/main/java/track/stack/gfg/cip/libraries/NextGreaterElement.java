package track.stack.gfg.cip.libraries;

import java.util.ArrayDeque;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] ip = {1, 3, 0, 0, 1, 2, 4};

        int [] bruteRes = nextGreaterElementBrute(ip);
        for (int bruteRe : bruteRes) {
            System.out.print( bruteRe + " ");
        }
        System.out.println();

        int [] stackRes = nextGreaterElementStack(ip);
        for (int stackRe : stackRes) {
            System.out.print( stackRe + " ");
        }
    }

    private static int[] nextGreaterElementBrute(int[] ip) {
        int length = ip.length;
        int[] res = new int[length];

        for(int i = 0 ; i < length; i++) {
            if(i == length-1) {
                res[i] = -1;
            } else {
                for(int j = i + 1 ; j < length ; j++) {
                    if(ip[j] > ip[i]) {
                        res[i] = ip[j];
                        break;
                    }
                }
            }
        }

        return res;
    }

    private static int[] nextGreaterElementStack(int[] ip) {
        int length = ip.length;
        int[] res = new int[length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = length-1 ; i >= 0 ; i-- ) {
            if(stack.isEmpty()) {
                stack.push(ip[i]);
                res[i] = -1;
            } else {
                while(ip[i] > stack.peek()) {
                   stack.pop();
                }
                res[i] = stack.peek();
                stack.push(ip[i]);
            }
        }
        return res;
    }
}
