package com.bae.entities;

import java.util.Random;

public class Goal {
	private int xLocation;
	private int yLocation;
	
	
	public Goal() {
		super();
		Random rand = new Random();
		xLocation = rand.nextInt(2001) - 1000;
		yLocation = rand.nextInt(2001) - 1000;

		
	}


	public int getXLocation() {
		return xLocation;
	}


	public void setXLocation(int xLocation) {
		this.xLocation = xLocation;
	}


	public int getYLocation() {
		return yLocation;
	}


	public void setYLocation(int yLocation) {
		this.yLocation = yLocation;
	}
	


}
