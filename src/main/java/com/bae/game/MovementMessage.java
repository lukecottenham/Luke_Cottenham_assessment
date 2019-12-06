package com.bae.game;

public class MovementMessage {
	
	public String playerOutOfBounds() {
		return "\nThe fog closes in around you... \nAs it fades away you realise you are now back where you first entered the swamp...";
	}
	
	public String movementSuccess(String dir, int distance) {
		return "\nYou have moved " + distance + "m " + dir + ".";
	}

}
