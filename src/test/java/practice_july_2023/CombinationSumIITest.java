package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIITest {

    private CombinationSumII combinationSumII;

    @BeforeEach
    public void setUp() {
        combinationSumII = new CombinationSumII();
    }

    @Test
    public void TC1() {
        List<List<Integer>> res = combinationSumII.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        Assertions.assertEquals(2, res.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> res = combinationSumII.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        Assertions.assertEquals(4, res.size());
    }
}