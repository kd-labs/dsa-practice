package LeetcodeDailyCodeChallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuddyStringsTest {

    private BuddyStrings buddyStrings;

    @BeforeEach
    public void setUp() {
        this.buddyStrings = new BuddyStrings();
    }

    @Test
    public void TC1() {
        Assertions.assertTrue(buddyStrings.buddyStrings("abcd", "cbad"));
    }

    @Test
    public void TC2() {
        Assertions.assertTrue(buddyStrings.buddyStrings("ab", "ba"));
    }

    @Test
    public void TC3() {
        Assertions.assertFalse(buddyStrings.buddyStrings("ab", "ab"));
    }

    @Test
    public void TC4() {
        Assertions.assertTrue(buddyStrings.buddyStrings("aa", "aa"));
    }

    @Test
    public void TC5() {
        Assertions.assertTrue(buddyStrings.buddyStrings("aaaaaaaaaaaabc", "aaaaaaaaaaaacb"));
    }

}