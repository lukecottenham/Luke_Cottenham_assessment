package com.bae.game;

import java.util.Scanner;

import com.bae.entities.Goal;
import com.bae.entities.Player;
import com.bae.entities.Swamp;

public class Game {
	Swamp swamp = new Swamp();
	Player player = new Player();
	Goal exit = new Goal();
	
	
	public String newGame() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to \"Escape The Swamp\" please choose an integer size of swamp between 100m and 10,000m to escape from");
		String swampSizeInput = scan.nextLine();
		
		exit.randomiseLocation(this.swamp.getSwampSize());
		
		
		
		
		scan.close();
		return "You took " + player.getMovesTaken() + " moves to escape the swamp.";
	}

}
