package LeetcodeDailyCodeChallenge;

/*
@link [buddy strings](https://leetcode.com/problems/buddy-strings/description/)
 */
public class BuddyStrings {

    public boolean buddyStrings(String s, String goal) {

        if(s.equalsIgnoreCase(goal)) return true;

        char[] original = s.toCharArray();
        for (int i = 0 ; i < s.length() ; i++) {
            for (int j = i+1 ; j < s.length() ; j++) {
                if(original[i] != original[j]) {

                    // swap char[i] and char[j]
                    swap(original, i, j);

                    // convert char[] to string
                    String swappedString = String.valueOf(original);

                    // compare swapped string with goal and return true if equal else swap back
                    if (swappedString.equalsIgnoreCase(goal)) return true;
                    else swap(original, i, j);

                }
            }
        }
        return false;
    }

    private void swap(char[] ch, int a, int b) {
        int temp = ch[a];
        ch[a] = ch[b];
        ch[b] = (char)temp;
    }
}
