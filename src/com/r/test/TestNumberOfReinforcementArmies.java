package com.r.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.r.model.GameBoard;

import com.r.model.Player;
import com.r.utility.TurnPhases;

public class TestNumberOfReinforcementArmies {

	GameBoard game;

	@Before
	public void testBefore() {
		System.out.println("@Before");

		game = new GameBoard();
	}

	@Test
	public void TestNumberOfReinforcementArmies() {

		Player p = game.GetPlayerById(game.turnOrganizer.GetCurrentPlayerId());
		game.CalculateArmies(p);

		assertEquals(p.GetArmies(), 5);
	}

}
