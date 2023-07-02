package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NQueenIITest {

    private NQueensII nQueen;

    @BeforeEach
    public void setUp() {
        nQueen = new NQueensII();
    }

    @Test()
    public void TC1() {
        int configCount = nQueen.solveNQueens(1);
        Assertions.assertEquals(1, configCount);
    }

    @Test()
    public void TC2() {
        int configCount = nQueen.solveNQueens(4);
        Assertions.assertEquals(2, configCount);
    }
}
