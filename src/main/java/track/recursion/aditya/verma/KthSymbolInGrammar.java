package track.recursion.aditya.verma;

public class KthSymbolInGrammar {

    public static void main(String[] args) {

        if(kthSymbolInGrammar(4, 5)) System.out.println(1);
        else System.out.println(0);
    }

    /*
        Hypothesis :
            kthSymbolGrammar returns the symbol in line n at postion k i.e.

            Grammar rules :
                return 0 if n = 1, k = 1
                return 0, 1 if symbol = 0
                return 1, 0 if symbol = 1

            Observation :
                if k > mid, then
                    k = !kthSymbolInGrammar(n-1, k-mid)
                else k < mid, then
                    k = kthSymbolInGrammar(n-1, k)

                where mid = 2^n-1/2
     */
    public static boolean kthSymbolInGrammar(int n, int k) {

        /*
            Base :
                if n == 1 and k == 1, then
                    return 0
         */
        if(n == 1 && k == 1) return false;

        int mid = (1 << (n-1))/2;
        if(k > mid) {
            return !(kthSymbolInGrammar(n-1, k-mid));
        } else {
            return kthSymbolInGrammar(n-1, k);
        }
    }
}
