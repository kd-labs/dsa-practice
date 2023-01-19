package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence longestIncreasingSubsequence;

    @BeforeEach
    public void setUp() {
        longestIncreasingSubsequence = new LongestIncreasingSubsequence();
    }

    @Test
    public void TC1() {
        int actual = longestIncreasingSubsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});

        int expected = 4;

        assertEquals(expected, actual, String.format("Expected %d but got %d", expected, actual));
    }


}