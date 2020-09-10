package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Game;

public class testGameLogic {
	Game game = new Game();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWillHaveGame() {
		game.setLighting(true);
		assertFalse(game.willHaveGame(game));
	}

	@Test
	public void testOvertime() {
		game.setIowaScore(10);
		game.setIsuScore(10);
		assertTrue(game.overtime(game));
	}
}
