package com.r.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * This is a test suite class for running all the tests in the game.
 * 
 * @author Ravneet Singh Brar
 * @version 1.0
 */
@RunWith(Suite.class)
@SuiteClasses({ TestContinent.class, TestCountry.class, TestEdge.class, TestGameBoard.class,
		TestLand.class, TestMap.class, TestMapParser.class, TestNumberOfReinforcementArmies.class, TestPlayer.class,
		})
public class TestSuite {

}
