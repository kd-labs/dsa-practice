package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    private WordBreak wordBreak;

    @BeforeEach
    public void setUp() {
        wordBreak = new WordBreak();
    }

    @Test
    public void TC1() {
        Assertions.assertTrue(wordBreak.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void TC2() {
        Assertions.assertTrue(wordBreak.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void TC3() {
        Assertions.assertFalse(wordBreak.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }

}