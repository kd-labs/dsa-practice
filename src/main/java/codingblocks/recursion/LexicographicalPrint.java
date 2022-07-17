package codingblocks.recursion;

public class LexicographicalPrint {

    public static void main(String[] args) {

//        for(int i = 0 ; i <= 9 ; i++) {
//            lexicagraphicalPrint(1000, "" + i);
//        }

        lexicographicalPrintMonuBhaiya(0, 1000);
    }

    private static void lexicagraphicalPrint(int max, String num) {

        // Negative Base Case : If num is greater than max, then return
        if(Integer.parseInt(num) == 0) {
            System.out.println(num);
            return;
        }
        if(Integer.parseInt(num) > max) {
            return;
        } else {
            System.out.println(num);
        }

        for(int i = 0 ; i <= 9 ; i++){
            lexicagraphicalPrint(max, num + i);
        }

    }

    private static void lexicographicalPrintMonuBhaiya(int curr, int max) {
       if(curr > max) {
           return;
       }
        System.out.println(curr);

       int i = 0;
       if(curr == 0) {
           i = 1;
       }

       for(; i<=9 ; i++) {
          lexicographicalPrintMonuBhaiya(curr*10 + i, max);
       }
    }
}
