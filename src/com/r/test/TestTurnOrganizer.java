package com.r.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.r.model.GameBoard;
import com.r.model.Player;
import com.r.model.TurnOrganizer;
import com.r.utility.TurnPhases;

/**
 * The class <code>TestTurnOrganizer</code> contains tests for the class
 * <code> {@link GameBoard}</code>
 * 
 * @author Raghav verma
 * @version 1.0
 */
 public class TestTurnOrganizer{
	 GameBoard game;
		
		@Before
		public void testBefore() {
			System.out.println("@BeforeClass");
			game = new GameBoard();
		}
			@Test
		public void testGetCurrentPhase() {
				TurnPhases p = game.turnOrganizer.GetCurrentPhase();
					
				assertEquals(p, TurnPhases.Startup);
		}
			
			@Test
			public void testGetNextPhase() {
				TurnPhases p= game.turnOrganizer.GetNextPhase();
				
				assertEquals(p, TurnPhases.Reinforcement);
				}
 }
