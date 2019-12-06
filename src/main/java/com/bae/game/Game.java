package com.bae.game;

import com.bae.entities.Swamp;

public class Game {
	Swamp swamp = new Swamp();
	
	
	public String newGame() {
		
		return "You took " + player.movesTaken();
	}

}
