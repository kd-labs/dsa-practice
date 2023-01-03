package codingblocks.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciMemoizationTest {

    @Test
    void fib() {

        // test
        int actual = FibonacciMemoization.fib(5);

        // assertions
        assertEquals(5, actual);

    }
}