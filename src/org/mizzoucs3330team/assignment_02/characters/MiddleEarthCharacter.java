package org.mizzoucs3330team.assignment_02.characters;

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
	public abstract boolean attack(MiddleEarthCharacter target);

	public void displayInfo() {
		System.out.println("<<" + name + " Status>>");
		System.out.println("Health: " + health);
		System.out.println("Power:  " + power);
		System.out.println("<<>>");
	}

	/**
	 * Damage this character.
	 * 
	 * @param amt The amount of damage to be inflicted.
	 * 
	 * @return Returns true if damage was inflicted, otherwise false.
	 */
	public boolean damage(double dmg) {
		if (dmg <= 0) {
			return false;
		}

		health -= dmg;

		if (health < 0) {
			health = 0;
		}

		return true;
	}

	/**
	 * @return Returns this character's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return Returns this character's health.
	 */
	public double getHealth() {
		return health;
	}

	/**
	 * @return Returns this character's power.
	 */
	public double getPower() {
		return power;
	}

	/**
	 * 
	 * @param name The name string to be applied to the character object.
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * 
	 * @param health The health value to be applied to the character object. Do not
	 *               use for attacking. use damage()
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * 
	 * @param power The power value to be applied to the character object.
	 */
	public void setPower(double power) {
		this.power = power;
	}

}
