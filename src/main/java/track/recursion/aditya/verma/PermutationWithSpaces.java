package track.recursion.aditya.verma;

public class PermutationWithSpaces {

    public static void main(String[] args) {

        String ip = "abc";
        permutationWithUnderscore(ip.substring(1), ip.substring(0,1));

    }

    public static void permutationWithUnderscore(String ip, String op) {

        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }

        String substring = ip.substring(1);
        permutationWithUnderscore(substring, op + "_" + ip.charAt(0));
        permutationWithUnderscore(substring, op + ip.charAt(0));
    }
}
