package com.bae.game;

import java.util.Scanner;

import com.bae.entities.Goal;
import com.bae.entities.Player;
import com.bae.entities.Swamp;
import com.bae.game.ScannerInputChecker;

public class Game {
	Swamp swamp = new Swamp();
	Player player = new Player();
	Goal exit = new Goal();

	public String newGame() {
		Boolean playGame = true;
		Scanner scan = new Scanner(System.in);
		ScannerInputChecker swampInput = new ScannerInputChecker();
		System.out.println("Welcome to Escape The Swamp");
		do {
			System.out.println("Please choose a new integer distance to the swamp edge for the swamp to escape from between 100m and 10,000m...");
			Boolean validSize = swampInput.sizeEntry(scan, this.swamp);
			if (validSize) {
				exit.randomiseLocation(this.swamp.getSwampSize());
			}
			else {
				continue;
			}

			Boolean goalFound = false;
			System.out.println("You pick up a weird looking compass. "
					+ "\nThe compass starts to glow and a mysterious fog starts to appear around you."
					+ "\nWhen it clears you find yourself in a foggy swamp stretching out for at least"
					+ this.swamp.getSwampSize()
					+ "m in each direction. "
					+ "\nYou look at the compass, all that it is showing is a glowing number that says: \n");
			String directionInput;
			do {

					System.out.println(this.swamp.distanceFromGoal(this.exit.getXLocation(), this.exit.getYLocation(), this.player.getXLocation(), this.player.getYLocation())
					+ "Please enter a cardinal direction to move in...");
					directionInput = scan.nextLine();
					
					System.out.println("Please enter an integer distance in m that will leave you in the swamp to move in that direction...");
						
				
			}
			while(!goalFound);
		
			System.out.println("You took " + this.player.getMovesTaken() + " moves to escape the swamp.");

		
		}
		while(playGame);
		scan.close();
		return "Thank you for playing Escape The Swamp";
	}

}
