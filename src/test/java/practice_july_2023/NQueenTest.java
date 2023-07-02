package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class NQueenTest {

    private NQueen nQueen;

    @BeforeEach
    public void setUp() {
        nQueen = new NQueen();
    }

    @Test()
    public void TC1() {
        List<List<String>> nQueensConfig = nQueen.solveNQueens(1);
        Assertions.assertEquals(1, nQueensConfig.size());
    }

    @Test()
    public void TC2() {
        List<List<String>> nQueensConfig = nQueen.solveNQueens(4);
        Assertions.assertEquals(2, nQueensConfig.size());
    }
}
