package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIIITest {

    private CombinationSumIII combinationSumIII;

    @BeforeEach
    public void setUp() {
        combinationSumIII = new CombinationSumIII();
    }

    @Test
    public void TC1() {
        List<List<Integer>> res = combinationSumIII.combinationSum3(3, 9);
        Assertions.assertEquals(3, res.size());
    }
    @Test
    public void TC2() {
        List<List<Integer>> res = combinationSumIII.combinationSum3(3, 7);
        Assertions.assertEquals(1, res.size());
    }

    @Test
    public void TC3() {
        List<List<Integer>> res = combinationSumIII.combinationSum3(4, 1);
        Assertions.assertEquals(0, res.size());
    }

    @Test
    public void TC4() {
        List<List<Integer>> res = combinationSumIII.combinationSum3(9, 45);
        Assertions.assertEquals(1, res.size());
    }

}