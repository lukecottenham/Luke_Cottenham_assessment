package com.bae.entities;

import java.text.DecimalFormat;

public class Swamp {
	private int swampSize = 1000;
	private DecimalFormat df = new DecimalFormat("#.##");

	public int getSwampSize() {
		return swampSize;
	}

	public void setSwampSize(int swampSize) {
		this.swampSize = swampSize;
	}
	
	public String distanceFromGoal(int goalXLocation, int goalYLocation, int playerXLocation, int playerYLocation) {
		int xDistance = Math.abs(playerXLocation - goalXLocation);
		int yDistance = Math.abs(playerYLocation - goalYLocation);
		String distance = df.format(Math.hypot(xDistance,yDistance));
		return "You are " + distance + "m from the exit.\n";
	}

}
