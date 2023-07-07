package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    private Combinations combinations;

    @BeforeEach
    public void setUp() {
        combinations = new Combinations();
    }

    @Test
    public void TC1() {
        List<List<Integer>> res = combinations.combine(4, 2);
        Assertions.assertEquals(6, res.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> res = combinations.combine(1, 1);
        Assertions.assertEquals(1, res.size());
    }

}