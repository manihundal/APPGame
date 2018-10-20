package com.r.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.r.model.GameBoard;

/**
 * The class <code>TestGameBoard</code> contains tests for the class 
 * <code> {@link GameBoard}</code>
 * @author raghav verma
 * @version 1.0
 */

public class TestGameBoard1 {
	GameBoard gameboard;
	
	/**
	 * Test case Initialization for TestGameBoard
	 */
	
	@Before
	public void BeforeTestGameBoard() {
		gameboard = new GameBoard();
	}
/**
 * This testGetGameBoard checks the single instance creation (singleton)
 */
	@Test
	public void TestGetGameBoard() {
		
		assertNotNull(gameboard.GetGameBoard()); 
	}
	
}
