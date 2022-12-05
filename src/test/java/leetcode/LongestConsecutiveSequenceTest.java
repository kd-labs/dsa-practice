package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    public void tc_1() {
        // setup
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        // test
        int actual = lcs.longestConsecutive(new int[]{100, 4, 200, 1, 2, 3});

        // assertions
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void tc_2() {
        // setup
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();

        // test
        int actual = lcs.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1});

        // assertions
        Assertions.assertEquals(9, actual);
    }

}