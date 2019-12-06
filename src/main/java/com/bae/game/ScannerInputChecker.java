package com.bae.game;

import java.util.Scanner;

import com.bae.entities.Direction;
import com.bae.entities.Swamp;

public class ScannerInputChecker {
	
	public Boolean directionEntry(Scanner scan, MoveTracker move) {
		String directionInput;
		Boolean success = true;
		directionInput = scan.nextLine().toLowerCase();

		switch (directionInput) {
		case "north":
			move.setDirection(Direction.NORTH);
			return success;

		case "east":
			move.setDirection(Direction.EAST);
			return success;

		case "south":
			move.setDirection(Direction.SOUTH);
			return success;

		case "west":
			move.setDirection(Direction.WEST);
			
			return success;

		default:
			System.out.println("\nMake sure you enter a vaild compass direction.");
			success = false;
			return success;
		}
	}
	
	public Boolean distanceEntry(Scanner scan, MoveTracker move) {
		String distanceInput;
		distanceInput = scan.nextLine();
		try {
			move.setDistance(Integer.parseInt(distanceInput));
		} catch (NumberFormatException nfe) {
			System.out.println("\nPlease make sure you only enter an integer.");
			return false;
		}
		return true;
	}
	
	public Boolean sizeEntry(Scanner scan, Swamp swamp) {
		int swampSizeInputInt;
		Boolean proceed = true;
		String swampSizeInput = scan.nextLine();
		try {
			swampSizeInputInt = Integer.parseInt(swampSizeInput);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please make sure you only enter an integer value between 100 and 10,000.");
			proceed = false;
			return proceed;
		}
		if (swampSizeInputInt >= 100 && swampSizeInputInt <= 10000) { 
			swamp.setSwampSize(swampSizeInputInt);
		}
		else {
			System.out.println("Please make sure you only enter an integer value between 100 and 10,000.");
			proceed = false;
		}
		return proceed;
	}

}
