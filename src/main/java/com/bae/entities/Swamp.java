package com.bae.entities;

public class Swamp {
	private int swampSize = 1000;

	public int getSwampSize() {
		return swampSize;
	}

	public void setSwampSize(int swampSize) {
		this.swampSize = swampSize;
	}
	
	public String distanceFromGoal(int goalXLocation, int goalYLocation, int playerXLocation, int playerYLocation) {
		int xDistance = Math.abs(playerXLocation - goalXLocation);
		int yDistance = Math.abs(playerYLocation - goalYLocation);
		return "You are " + Math.hypot(xDistance,yDistance) + "m from the exit.\n";
	}

}
