package org.mizzoucs3330team.assignment_02;

public class MiddleEarthApp {

	/**
	 * The entry point for the application.
	 * 
	 * @param args Arguments
	 */
	public static void main(String[] args) {
		MiddleEarthCouncil council = MiddleEarthCouncil.getInstance();
		Menu m = new Menu(council.getCharacterManager());
	}
}
