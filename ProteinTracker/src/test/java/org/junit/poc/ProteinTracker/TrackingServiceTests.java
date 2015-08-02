package org.junit.poc.ProteinTracker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrackingServiceTests {

	TrackingService trackingService;
	
	@BeforeClass
	public static void before() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void after() {
		System.out.println("After Class");
	}
	
	@Before
	public void setup() {
		System.out.println("Before"); 
		trackingService = new TrackingService();
	}
	
	@After
	public void teardown() {
		System.out.println("After"); 
	}
	
	@Test
	public void newTrackingServiceTotalIsZero() {
		assertEquals("Tracking Service Total was not zero", 0, trackingService.getTotal());
	}
	
	@Test
	@Ignore
	public void whenAddingProteinTotalIncreasesByThatAmount() {
		trackingService.addProtein(10);
		assertEquals(10, trackingService.getTotal());
	}
	
	@Test
	public void whenRemovingProteinTotalRemainsZero() {
		trackingService.removeProtein(5);
		assertEquals(0, trackingService.getTotal());
	}
	
	@Test(expected = InvalidGoalException.class)
	public void whenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
		trackingService.setGoal(-1);
	}
	
}