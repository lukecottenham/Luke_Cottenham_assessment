package com.bae.entities;

import com.bae.game.MovementMessage;

public class Player {
	private int xLocation = 0;
	private int yLocation = 0;
	MovementMessage playerLeavesSwamp = new MovementMessage();
	
	public String movePlayer(Direction dir, int distance) {
		String movementInfo = null;
		switch(dir) {
		case NORTH:
			this.yLocation += distance;
			if (this.yLocation > 1000) {
				this.yLocation = 0;
				movementInfo = playerLeavesSwamp.playerOutOfBounds();
			}
			else
			break;
		case EAST:
			this.xLocation += distance;
			break;
		case SOUTH:
			this.yLocation -= distance;
			break;
		case WEST:
			this.xLocation -= distance;
			break;
				
		}
		return movementInfo; 
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
