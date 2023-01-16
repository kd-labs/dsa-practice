package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    private EditDistance editDistance;

    @BeforeEach
    public void setUp() {
       editDistance = new EditDistance();
    }

    @Test
    public void TC1() {

        // Test
        int actual = editDistance.minDistance("food", "monkey");
        int expected = 5;

        // Assert
        assertEquals(expected, actual, String.format("Expected : %d, Got : %d", expected, actual));

    }

    @Test
    public void TC2() {

        // Test
        int actual = editDistance.minDistance("horse", "ros");
        int expected = 3;

        // Assert
        assertEquals(expected, actual, String.format("Expected : %d, Got : %d", expected, actual));

    }


}