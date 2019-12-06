package com.bae.game;

import java.util.Scanner;

import com.bae.entities.Goal;
import com.bae.entities.Player;
import com.bae.entities.Swamp;
import com.bae.game.SwampInput;

public class Game {
	Swamp swamp = new Swamp();
	Player player = new Player();
	Goal exit = new Goal();

	public String newGame() {
		Boolean playGame = true;
		Scanner scan = new Scanner(System.in);
		SwampInput swampInput = new SwampInput();
		System.out.println("Welcome to Escape The Swamp");
		do {
			System.out.println("Please choose a new integer distance to the swamp edge for the swamp to escape from between 100m and 10,000m...");
			Boolean validSize = swampInput.sizeEntry(scan, swamp);
			if (validSize) {
				exit.randomiseLocation(this.swamp.getSwampSize());
			}
			else {
				continue;
			}

			swamp.distanceFromGoal(exit.getXLocation(), exit.getYLocation(), player.getXLocation(), player.getYLocation());
		
		
			System.out.println("You took " + player.getMovesTaken() + " moves to escape the swamp.");

		
		}
		while(playGame);
		scan.close();
		return "Thank you for playing Escape The Swamp";
	}

}
