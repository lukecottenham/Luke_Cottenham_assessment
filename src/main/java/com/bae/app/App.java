package com.bae.app;

import com.bae.entities.Direction;
import com.bae.entities.Goal;
import com.bae.entities.Player;

public class App {

	public static void main(String[] args) {
		Goal treasure = new Goal();
		Player player = new Player();
		
		for (int i = 0; i < 20; i++) {
			treasure = new Goal();
			System.out.println(treasure.getXLocation() + "  " + treasure.getYLocation());
			System.out.println();

		}
		System.out.println(player.movePlayer(Direction.NORTH, 200, 1000));
		System.out.println(player.movePlayer(Direction.SOUTH, 2000, 1000));
		

	}

}
