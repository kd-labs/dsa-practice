package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    private CombinationSum combinationSum;

    @BeforeEach
    public void setUp() {
        combinationSum = new CombinationSum();
    }

    @Test
    public void TC1() {
        List<List<Integer>> res = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        Assertions.assertEquals(2, res.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> res = combinationSum.combinationSum(new int[]{2, 3, 5}, 8);
        Assertions.assertEquals(3, res.size());
    }

    @Test
   public void TC3() {
        List<List<Integer>> res = combinationSum.combinationSum(new int[]{2}, 1);
        Assertions.assertEquals(0, res.size());
    }

}