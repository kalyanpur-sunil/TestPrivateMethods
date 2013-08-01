package org.sunil;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Game game=null;
	Tennis tennis = null;

	/**
	 * Sets up the test fixture. 
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp(){
		game = new Game();
		tennis = new Tennis();
		tennis.setPlayer("player");
		tennis.setNumOfPlayers(2);
		tennis.setGender("M");
	}

	/**
	 * Tears down the test fixture. 
	 * (Called after every test case method.)
	 */
	@After
	public void tearUp(){
		game = null;
		tennis = null;
	}

	@Test
	public void testShout() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String input = "Test input";
		Method method = Game.class.getDeclaredMethod("shout", String.class);
		method.setAccessible(true);
		String output = (String) method.invoke(game, input);
		assertEquals("TEST INPUT", output);
	}

	@Test
	public void testEditChecks() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		game.setTennis(tennis);
		Method method = Game.class.getDeclaredMethod("editChecks");
		method.setAccessible(true);
		Boolean b = (Boolean)method.invoke(game);
		assertFalse(b);
	}


}
