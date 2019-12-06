package com.bae.entities;

import com.bae.game.MovementMessage;

public class Player {
	private int xLocation = 0;
	private int yLocation = 0;
	MovementMessage playerLeavesSwamp = new MovementMessage();

	public String movePlayer(Direction dir, int distance, int swampSize) {
		String movementInfo = null;
		String direction;
		switch (dir) {
		case NORTH:
			direction = "North";
			this.yLocation += distance;
			if (this.yLocation > swampSize) {
				this.yLocation = 0;
				movementInfo = playerLeavesSwamp.playerOutOfBounds();
			} else {
				movementInfo = playerLeavesSwamp.movementSuccess(direction, distance);
			}
			break;

		case EAST:
			direction = "East";
			this.xLocation += distance;
			if (this.xLocation > swampSize) {
				this.xLocation = 0;
				movementInfo = playerLeavesSwamp.playerOutOfBounds();
			} else {
				movementInfo = playerLeavesSwamp.movementSuccess(direction, distance);
			}
			break;

		case SOUTH:
			direction = "South";
			this.yLocation -= distance;
			if (this.yLocation < -swampSize) {
				this.yLocation = 0;
				movementInfo = playerLeavesSwamp.playerOutOfBounds();
			} else {
				movementInfo = playerLeavesSwamp.movementSuccess(direction, distance);
			}
			break;

		case WEST:
			direction = "West";
			this.xLocation -= distance;
			if (this.xLocation < -swampSize) {
				this.xLocation = 0;
				movementInfo = playerLeavesSwamp.playerOutOfBounds();
			} else {
				movementInfo = playerLeavesSwamp.movementSuccess(direction, distance);
			}
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
