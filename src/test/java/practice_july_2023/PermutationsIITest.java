package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsIITest {

    private PermutationsII permutationsII;

    @BeforeEach
    public void setUp() {
        permutationsII = new PermutationsII();
    }

    @Test
    public void TC1() {
        List<List<Integer>> lists = permutationsII.permuteUnique(new int[]{1, 1, 2});
        Assertions.assertEquals(3, lists.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> lists = permutationsII.permuteUnique(new int[]{1, 2, 3});
        Assertions.assertEquals(6, lists.size());
    }

    @Test
    public void TC3() {
        List<List<Integer>> lists = permutationsII.permuteUnique(new int[]{2, 2, 1, 1});
        Assertions.assertEquals(6, lists.size());
    }

}