package track.recursion.aditya.verma;

public class LetterCaseChange {

    public static void main(String[] args) {

        String ip = "a1b2";
        permutationWithLetterCase(ip, "");

    }

    private static void permutationWithLetterCase(String ip , String op) {
        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }

        Character c = ip.charAt(0);
        String substring = ip.substring(1);
        if(Character.isDigit(c)) {
            permutationWithLetterCase(substring, op + ip.charAt(0));
        } else {
            permutationWithLetterCase(substring, op + c.toString().intern().toUpperCase());
            permutationWithLetterCase(substring, op + c.toString().intern().toLowerCase());
        }
    }
}
