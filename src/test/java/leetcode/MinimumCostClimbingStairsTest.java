package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCostClimbingStairsTest {

    MinimumCostClimbingStairs minimumCostClimbingStairs = null;

    @BeforeEach
    public void setUp() {
        minimumCostClimbingStairs = new MinimumCostClimbingStairs();
    }

    @Test
    void minCostClimbingStairs() {
    }

    @Test
    void minCostClimbingStairs_tabulation() {

        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int actual = minimumCostClimbingStairs.minCostClimbingStairs_tabulation(cost);
        int expected = 6;

        assertEquals(expected, actual);
    }
}