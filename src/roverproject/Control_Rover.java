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
		int limitX;
		int limitY;
		int x;
		int y;
		String heading;
		String path;
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			limitX = scanner.nextInt();
			limitY = scanner.nextInt();
			while (scanner.hasNext()) {
				x = scanner.nextInt();
				y = scanner.nextInt();
				heading = scanner.next();
				path = scanner.next();
				Rover newRover = new Rover(x, y, heading, limitX, limitY);
				System.out.println(Rover.findPosition(newRover, path));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
