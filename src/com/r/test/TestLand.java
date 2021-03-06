package com.r.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.r.model.GameBoard;
import com.r.model.Land;
import com.r.model.Player;

/**
 * The class <code>TestLand</code> contains tests for the class 
 * <code> {@link Land}</code>
 * @author Raghav verma
 * @version 1.0
 */

public class TestLand {
	
	Land land;
	
	/**
	 * Test case Initialization for TestLand
	 */
	
	@Before
	public void TestBefore() {
		System.out.println("@BeforeClass");
		land = new Land("new_name");
		
	}
	
	/**
	 * This Test case test the Name of the land is returned correctly
	 */

	@Test
	public void TestGetName() {
		System.out.println("testGetName");
		String landName = land.GetName();
		System.out.println(landName);
		assertEquals("new_name",landName);
	}
	
	/**
	 * This Test case test the Land id is returned correctly
	 */
	@Test
	public void TestGetId() {
		System.out.println("testGetId");
		int landId = land.GetId();
		System.out.println(landId);
		assertEquals(1,landId);

	}

	/**
	 * Perform post-test clean-up.
	 * 
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 */
	@After
	public void TearDown() throws Exception {
		System.out.println("");
		land = null;
		assertNull(land);
	}
}
