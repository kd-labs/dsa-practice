package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {

    private LetterCombinations letterCombinations;

    @BeforeEach
    public void setUp() {
        letterCombinations = new LetterCombinations();
    }

    @Test
    public void TC1() {
        List<String> strings = letterCombinations.letterCombinations("23");
        assertEquals(9, strings.size());
    }

    @Test
    public void TC2() {
        List<String> strings = letterCombinations.letterCombinations("");
        assertEquals(0, strings.size());
    }

    @Test
    public void TC3() {
        List<String> strings = letterCombinations.letterCombinations("2");
        assertEquals(3, strings.size());
    }

}