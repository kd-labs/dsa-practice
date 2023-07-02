package practice_july_2023;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JumpGameTest {

    private JumpGame jumpGame;

    @BeforeEach
    public void setUp() {
        this.jumpGame = new JumpGame();
    }

    @Test
    public void TC1() {
        Assertions.assertTrue(jumpGame.canJump(new int[] {2, 3, 1, 1, 4}));
    }

    @Test
    public void TC2() {
        Assertions.assertFalse(jumpGame.canJump(new int[] {3, 2, 1, 0, 4}));
    }

    @Test
    public void TC3() {
        Assertions.assertTrue(jumpGame.canJump(new int[] {0}));
    }
}
