package roverproject;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class RoverTest {
	
	private Rover roverUnderTest;
	
	@Test
	public void findPositionExample1() {
		roverUnderTest = new Rover(1, 2, "N", 5, 5);
		String path = "LMLMLMLMM";
		
		Rover.findPosition(roverUnderTest, path);
		
		int expectedY = 3;
		int expectedX = 1;
		String expectedHeading = "N";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void findPositionExample2() {
		roverUnderTest = new Rover(3, 3, "E", 5, 5);
		String path = "MMRMMRMRRM";
		
		Rover.findPosition(roverUnderTest, path);
		
		int expectedY = 1;
		int expectedX = 5;
		String expectedHeading = "E";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}

	@Test
	public void moveForwardFacingNorthTest() {
		roverUnderTest = new Rover(0, 0, "N", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 1;
		int expectedX = 0;
		String expectedHeading = "N";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveForwardFacingEastTest() {
		roverUnderTest = new Rover(0, 0, "E", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 1;
		String expectedHeading = "E";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveForwardFacingSouthTest() {
		roverUnderTest = new Rover(0, 1, "S", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "S";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveForwardFacingWestTest() {
		roverUnderTest = new Rover(2, 2, "W", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 2;
		int expectedX = 1;
		String expectedHeading = "W";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnLeftFacingNorthTest() {
		roverUnderTest = new Rover(0, 0, "N", 5, 5);
		Rover.turnLeft(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "W";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnLeftFacingEastTest() {
		roverUnderTest = new Rover(0, 0, "E", 5, 5);
		Rover.turnLeft(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "N";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnLeftFacingSouthTest() {
		roverUnderTest = new Rover(0, 0, "S", 5, 5);
		Rover.turnLeft(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "E";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnLeftFacingWestTest() {
		roverUnderTest = new Rover(0, 0, "W", 5, 5);
		Rover.turnLeft(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "S";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}

	@Test
	public void turnRightFacingNorthTest() {
		roverUnderTest = new Rover(0, 0, "N", 5, 5);
		Rover.turnRight(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "E";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnRightFacingEastTest() {
		roverUnderTest = new Rover(0, 0, "E", 5, 5);
		Rover.turnRight(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "S";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnRightFacingSouthTest() {
		roverUnderTest = new Rover(0, 0, "S", 5, 5);
		Rover.turnRight(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "W";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void turnRightFacingWestTest() {
		roverUnderTest = new Rover(0, 0, "W", 5, 5);
		Rover.turnRight(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "N";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveOutOfBoundsFacingNorthTest() {
		roverUnderTest = new Rover(5, 5, "N", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 5;
		int expectedX = 5;
		String expectedHeading = "N";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveOutOfBoundsFacingEastTest() {
		roverUnderTest = new Rover(5, 5, "E", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 5;
		int expectedX = 5;
		String expectedHeading = "E";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveOutOfBoundsFacingSouthTest() {
		roverUnderTest = new Rover(0, 0, "S", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "S";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
	
	@Test
	public void moveOutOfBoundsFacingWestTest() {
		roverUnderTest = new Rover(0, 0, "W", 5, 5);
		Rover.moveForward(roverUnderTest);
		
		int expectedY = 0;
		int expectedX = 0;
		String expectedHeading = "W";
		
		assertEquals(roverUnderTest.y, expectedY);
		assertEquals(roverUnderTest.x, expectedX);
		assertEquals(roverUnderTest.heading, expectedHeading);
	}
}
