package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {

        // setup
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        // test
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"ate", "bat", "tea", "nat", "eat", "tan"});

        // assert
        Assertions.assertEquals(3, lists.size(), "expected and actual list size don't match");
    }
}