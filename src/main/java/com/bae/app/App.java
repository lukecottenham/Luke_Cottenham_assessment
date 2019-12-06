package com.bae.app;

import com.bae.entities.Goal;

public class App {

	public static void main(String[] args) {
		Goal treasure = new Goal();
		
		for (int i = 0; i < 20; i++) {
			treasure = new Goal();
			System.out.println(treasure.getXLocation() + "  " + treasure.getYLocation());
			System.out.println();

		}

	}

}
