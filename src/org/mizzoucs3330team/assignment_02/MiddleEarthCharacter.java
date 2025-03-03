package org.mizzoucs3330team.assignment_02;

public abstract class MiddleEarthCharacter {
	protected String name;
	protected double health;
	protected double power;

	public MiddleEarthCharacter(String n, double h, double p) {
		name = n;
		health = h;
		power = p;
	}

	abstract String getRace();

	abstract boolean attack(MiddleEarthCharacter target);

	public void displayInfo() {
		System.out.println("<<" + name + " Status>>");
		System.out.println("Health: " + health);
		System.out.println("Power:  " + power);
		System.out.println("<<>>");
	}
}
