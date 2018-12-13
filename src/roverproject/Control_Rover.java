/**@author Matthew Cobbing
 * Control_Rover class v1.0
 * Takes input from NASA text file and finds end location
 * of each rover by using Rover class. Output is sent to
 * console.
 * TODO:Implement rover collision detection.
 */
package roverproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Control_Rover {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		printRoverPositionsFromFile("input.txt");
	}
	
	public static void printRoverPositionsFromFile(String fileName) {
		int limitX; int limitY;
		int x; int y;
		String heading;
		String path;
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			//All data in text file is assumed to be correct.
			limitX = scanner.nextInt();
			limitY = scanner.nextInt();
			//loops text file until each rover is moved.
			while (scanner.hasNext()) {
				x = scanner.nextInt();
				y = scanner.nextInt();
				heading = scanner.next();
				path = scanner.next();
				//create rover object and then print to console.
				Rover newRover = new Rover(x, y, heading, limitX, limitY);
				System.out.println(Rover.findPosition(newRover, path));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problem reading file: ");
			e.printStackTrace();
		}
	}

}
