package com.bae.game;

import com.bae.entities.Direction;

public class MovementMessage {
	
	public String playerOutOfBounds() {
		return "The fog closes in around you... \nAs it fades away you realise you are now back where you first entered the swamp...\n";
	}
	
	public String movementSuccess(String dir, int distance) {
		return "You have moved " + distance + "m " + dir + ".\n";
	}

}
