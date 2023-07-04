package practice_july_2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    private Permutations permutations;

    @BeforeEach
    public void setUp() {
        permutations = new Permutations();
    }

    @Test
    public void TC1() {
        List<List<Integer>> permute = permutations.permute(new int[]{1, 2, 3});
        assertEquals(6, permute.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> permute = permutations.permute(new int[]{0, 1});
        assertEquals(2, permute.size());
    }

    @Test
    public void TC3() {
        List<List<Integer>> permute = permutations.permute(new int[]{1});
        assertEquals(1, permute.size());
    }
}