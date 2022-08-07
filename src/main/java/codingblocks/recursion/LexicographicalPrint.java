package codingblocks.recursion;

public class LexicographicalPrint {

    public static void main(String[] args) {

//        for(int i = 0 ; i <= 9 ; i++) {
//            lexicagraphicalPrint(1000, "" + i);
//        }

        lexicographicalPrintMonuBhaiya(0, 1000);
    }

    private static void lexicagraphicalPrint(int max, String num) {

        // Edge Base Case : if number is 0 then return
        if(Integer.parseInt(num) == 0 || Integer.parseInt(num) > max) {
            return;
        }

        // print the number which will print in lexicographical order
        System.out.println(num);

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
