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
		MoveTracker move = new MoveTracker();
		Scanner scan = new Scanner(System.in);
		ScannerInputChecker inputChecker = new ScannerInputChecker();
		System.out.println("Welcome to Escape The Swamp!");
		do {
			System.out.println(
					"Please choose a new integer distance to the swamp edge for the swamp to escape from between 100m and 10,000m...");
			Boolean validSize = inputChecker.sizeEntry(scan, this.swamp);
			if (validSize) {
				exit.randomiseLocation(this.swamp.getSwampSize());
			} else {
				continue;
			}

			Boolean goalFound = false;
			System.out.println("You pick up a weird looking compass. "
					+ "\nThe compass starts to glow and a mysterious fog starts to appear around you."
					+ "\nWhen it clears you find yourself in a foggy swamp stretching out for at least "
					+ this.swamp.getSwampSize() + "m in each direction. "
					+ "\nYou look at the compass, all that it is showing is a glowing number that says:");
			do {
				System.out.println("\n"
						+ this.swamp.distanceFromGoal(this.exit.getXLocation(), this.exit.getYLocation(),
								this.player.getXLocation(), this.player.getYLocation())
						+ "\nPlease enter a cardinal direction to move in...");
				
				if (!inputChecker.directionEntry(scan, move)) {
					continue;
				}

				System.out.println(
						"\nPlease enter an integer distance in m that will still leave you in the swamp to move in the direction you chose...");
				
				if (!inputChecker.distanceEntry(scan, move)) {
					continue;
				}

				this.player.movePlayer(move.getDirection(), move.getDistance(), swamp.getSwampSize());
				if (this.player.getXLocation() == this.exit.getXLocation()
						&& this.player.getYLocation() == this.exit.getYLocation()) {
					goalFound = true;
				}

			} while (!goalFound);

			System.out.println("\nYou took " + this.player.getMovesTaken() + " moves to escape the swamp.");
			System.out.println("\nWould you like to play again? Enter n for no and anything else for yes...");
			String continuePlaying = scan.nextLine();

			if (continuePlaying.equalsIgnoreCase("y")) {
				playGame = false;
			}

		} while (playGame);
		scan.close();
		return "\nThank you for playing Escape The Swamp";
	}

}
