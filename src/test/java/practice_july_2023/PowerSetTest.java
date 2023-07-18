package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {

    private PowerSet powerSet;

    @BeforeEach
    public void setUp() {
        this.powerSet = new PowerSet();
    }

    @Test
    public void TC1() {
        List<List<Integer>> res = powerSet.subsets(new int[]{1, 2, 3});
        Assertions.assertEquals(8, res.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> res = powerSet.subsets(new int[]{0});
        Assertions.assertEquals(2, res.size());
    }

}