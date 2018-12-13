/**@author Matthew Cobbing
 * Rover class v1.0
 * Controls movement of individual NASA rover on mars plateau
 * TODO:Implement rover collision detection.
 */
package roverproject;

public class Rover {
	int x;
	int y;
	String heading;
	int limitX;
	int limitY;
	boolean gridArray[][];

	public Rover(int x, int y, String h, int limitX, int limitY) {
		this.x = x;
		this.y = y;
		this.heading = h;
		this.limitX = limitX;
		this.limitY = limitY;
	}

	//method moves rover to new position depending on heading and
	//will only move if the rover will stay on plateau after moving.
	public static void moveForward(Rover newRover) {
		if (newRover.heading.equals("N") && (newRover.y + 1 <= newRover.limitY)){
			newRover.y++;
		} else if (newRover.heading.equals("E") && (newRover.x + 1 <= newRover.limitX)){
			newRover.x++;
		} else if (newRover.heading.equals("S") && (newRover.y - 1 >= 0)){
			newRover.y--;
		} else if (newRover.heading.equals("W") && (newRover.x - 1 >= 0)){
			newRover.x--;
		}
	}

	public static void turnLeft(Rover newRover) {
		if (newRover.heading.equals("N")) {
			newRover.heading = "W";
		} else if (newRover.heading.equals("E")) {
			newRover.heading = "N";
		} else if (newRover.heading.equals("S")) {
			newRover.heading = "E";
		} else if (newRover.heading.equals("W")) {
			newRover.heading = "S";
		}
	}

	public static void turnRight(Rover newRover) {
		if (newRover.heading.equals("N")) {
			newRover.heading = "E";
		} else if (newRover.heading.equals("E")) {
			newRover.heading = "S";
		} else if (newRover.heading.equals("S")) {
			newRover.heading = "W";
		} else if (newRover.heading.equals("W")) {
			newRover.heading = "N";
		}
	}

	//method calculates end position of rover given the total path
	public static String findPosition(Rover newRover, String path) {
		char[] charArray = path.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'M') {
				Rover.moveForward(newRover);
			} else if (charArray[i] == 'L') {
				Rover.turnLeft(newRover);
			} else if (charArray[i] == 'R') {
				Rover.turnRight(newRover);
			}
		}
		return newRover.x + " " + newRover.y + " " + newRover.heading;
	}

}