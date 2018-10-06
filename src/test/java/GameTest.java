import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void simpleTest () {
        Game game = Game.startAGame(5);

        for (int i = 0; i < 5; i++) {
            assertTrue("Game ended too early", !game.isEnd());
            assertEquals("Incorrect text", "Guess a letter:", game.roundStart());
            assertEquals("Incorrect text","Missed, mistake " + (i + 1) + " out of 5.\n", game.roundCheckALetter('['));
//            assertEquals("Incorrect text", "The word: *******\n", game.roundEnd());
        }
        assertTrue("Game didn't end", game.isEnd());
        assertEquals("", "You lost!", game.gameOver());
    }
}
