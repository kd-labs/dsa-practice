package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetIITest {

    private PowerSetII powerSetII;

    @BeforeEach
    public void setUp() {
        powerSetII = new PowerSetII();
    }

    @Test
    public void TC1() {
        List<List<Integer>> ans = powerSetII.subsets(new int[]{1, 2, 2});
        Assertions.assertEquals(6, ans.size());
    }

    @Test
    public void TC2() {
        List<List<Integer>> ans = powerSetII.subsets(new int[]{0});
        Assertions.assertEquals(2, ans.size());
    }

}