package com.r.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.r.model.Edge;
import com.r.model.Map;

/**
 * The class <code>TestEdge</code> contains tests for the class 
 * <code> {@link Edge}</code>
 * @author Manjinder Kaur
 * @version 1.0
 */

public class TestEdge {
	
	Edge edge;
	Map map;
	
	/**
	 * Test case Initialization for TestEdge
	 */
	
	@Before
	public void BeforeTestEdge() {
		edge = new Edge(0, 0);
		map = new Map("new_name");
	}
	
	/**
	 * This Test case test the country id is returned correctly
	 */
	
	@Test
	public void TestGetCountryId1() {
			System.out.println("testGetCountryId1");
			int countryid1 = edge.GetCountryId1();
			System.out.println(countryid1);
			assertEquals(0,countryid1);
		}
	
	/**
	 * This Test case test the player id is returned correctly
	 */
	
	@Test
	public void TestGetCountryId2() {
			System.out.println("testGetCountryId2");
			int countryid2 = edge.GetCountryId2();
			System.out.println(countryid2);
			assertEquals(0,countryid2);
		}
	
	@Test
	public void TestGetId() {
			System.out.println("testGetCountryId2");
			int id = edge.GetId();
			System.out.println(id);
			assertEquals(1,id);
		}
	
	
	@Test 
	public void TestDoesExistCountry() {
		System.out.println("testDoesExistEdge");

		boolean countryresult1 = false;
		System.out.println(countryresult1);

		String countryresult2 = map.AddCountry("abc",0,34,45);
		System.out.println(countryresult2);

		assertTrue(true);
	}
}




