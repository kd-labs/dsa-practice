package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    private WordSearch wordSearch;

    @BeforeEach
    public void setUp() {
        wordSearch = new WordSearch();
    }

    @Test
    public void TC1() {
        char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Assertions.assertTrue(wordSearch.exist(board, "ABCCED"));
    }

    @Test
    public void TC2() {
        char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Assertions.assertTrue(wordSearch.exist(board, "SEE"));
    }

    @Test
    public void TC3() {
        char[][] board = new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Assertions.assertFalse(wordSearch.exist(board, "ABCB"));
    }

}