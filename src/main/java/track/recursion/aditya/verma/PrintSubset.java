package track.recursion.aditya.verma;

public class PrintSubset {

    public static void main(String[] args) {
        
        String ip = "abc";
        printSubset(ip, "");
    }

    /*
        OP-IP recursion tree
     */
    private static void printSubset(String ip, String op) {

        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }

        String substring = ip.substring(1);
        printSubset(substring, op);
        printSubset(substring, op + ip.charAt(0));

    }
}
