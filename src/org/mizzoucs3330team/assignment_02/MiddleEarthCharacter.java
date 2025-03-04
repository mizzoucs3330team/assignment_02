package org.mizzoucs3330team.assignment_02;

/**
 * Abstract class representing a Middle Earth character.
 */
public abstract class MiddleEarthCharacter {
	protected String name;
	protected double health;
	protected double power;

	/**
	 * Creates an abstract Middle Earth character.
	 * 
	 * @param n Character Name
	 * @param h Character Health
	 * @param p Character Power
	 */
	public MiddleEarthCharacter(String n, double h, double p) {
		name = n;
		health = h;
		power = p;
	}

	/**
	 * Gets the race of
	 * 
	 * @return
	 */
	abstract String getRace();

	/**
	 * Attack another character.
	 * 
	 * @param target The character to be attacked.
	 * 
	 * @return Returns true if the attack successfully reduced the target's health.
	 *         Returns false if the attack was ineffective, or if the attack was
	 *         against their own kin. Characters of the same kin cannot not do any
	 *         damage to each other.
	 */
	abstract boolean attack(MiddleEarthCharacter target);

	public void displayInfo() {
		System.out.println("<<" + name + " Status>>");
		System.out.println("Health: " + health);
		System.out.println("Power:  " + power);
		System.out.println("<<>>");
	}
}
