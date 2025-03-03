package org.mizzoucs3330team.assignment_02;

public class MiddleEarthCharacter {
	private String name;
	private double health;
	private double power;
	
	public MiddleEarthCharacter(String n, double h, double p) {
		name = n;
		health = h;
		power = p;
	}
	
	// I am assuming every method is private until it is determined otherwise.
	// Feel free to change them to public if you need.
	
	// Returns true if attack was successful, otherwise false
	private boolean attack(MiddleEarthCharacter target) {
		// not implemented.
		
		return false;
	}
	
	private String getRace() {
		return "not implemented.--abstract character";
	}
}
