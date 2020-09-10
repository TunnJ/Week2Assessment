package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Game;

public class TestGameLogic2 {
	Game game = new Game();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWinner() {
		game.setIowaScore(21);
		game.setIsuScore(20);
		assertEquals("Iowa", game.winner(game));
	}

}
