package com.bae.game;

import java.util.Scanner;

import com.bae.entities.Direction;
import com.bae.entities.Swamp;

public class ScannerInputChecker {
	
	public Boolean sizeEntry(Scanner scan, Swamp swamp) {
		int swampSizeInputInt;
		Boolean proceed = true;
		String swampSizeInput = scan.nextLine();
		try {
			swampSizeInputInt = Integer.parseInt(swampSizeInput);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please make sure you only enter an integer value between 100 and 10,000.");
			proceed = false;
			return proceed;
		}
		if (swampSizeInputInt >= 100 && swampSizeInputInt <= 10000) { 
			swamp.setSwampSize(swampSizeInputInt);
		}
		else {
			System.out.println("Please make sure you only enter an integer value between 100 and 10,000.");
			proceed = false;
		}
		return proceed;
	}

}
