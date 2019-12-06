package com.bae.entities;

import java.util.Random;

public class Goal {
	private int xLocation = 0;
	private int yLocation = 0;
	private Random rand = new Random();
	
	public Goal() {
		super();

		
	}
	public void randomiseLocation(int swampSize) {
		Random rand = new Random();
		int randomRange = (swampSize * 2) + 1;
		this.xLocation = rand.nextInt(randomRange) - swampSize;
		this.yLocation = rand.nextInt(randomRange) - swampSize;

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
