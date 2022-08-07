package codingblocks.contests.contest_3061;

import java.util.ArrayList;
import java.util.List;

public class AxisOrbitPalindromeSubstring {

    public static void main(String[] args) {


    }

    /*
        Counting odd palindromic substrings
     */
    private static int axisOrbitPalindromeSubstringsOdd(String str) {

        List<String> res = new ArrayList<>();
        int count = 0;

        /*
            Start the axis at every character

               axis = 0
                |
                nitin
                |

                axis = 1
                 |
                nitin
                 |

                 axis = 2
                  |
                nitin
                  |
         */
        for(int axis = 0 ; axis < str.length() ; axis++) {

            /*
                Grow the orbit from 0 around each axis
             */
            for(int orbit = 0 ; axis-orbit>=0 && axis+orbit < str.length() ; orbit++) {

                int leftCh = str.charAt(axis-orbit);
                int rightCh = str.charAt(axis+orbit);

                if(leftCh == rightCh) {
                    count++;
                } else {
                    break;
                }

            }
        }

        return count;
    }

    /*
        Counting even palindromic substrings
     */
    private static int axisOrbitPalindromeSubstringsEven(String str) {

        List<String> res = new ArrayList<>();
        int count = 0;

        /*
            Start the axis at every character

               axis = 0.5
                |
                nitin
                |

                axis = 1.5
                 |
                nitin
                 |

                 axis = 2.5
                  |
                nitin
                  |
         */
        for(double axis = 0.5 ; axis < str.length() ; axis++) {

            /*
                Grow the orbit from 0 around each axis
             */
            for(double orbit = 0.5 ; axis-orbit>=0 && axis+orbit < str.length() ; orbit++) {

                int leftCh = str.charAt((int) (axis-orbit));
                int rightCh = str.charAt((int) (axis+orbit));

                if(leftCh == rightCh) {
                    count++;
                } else {
                    break;
                }

            }
        }

        return count;
    }
}
