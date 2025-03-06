package org.mizzoucs3330team.assignment_02.characters;

// Maybe this should inherit from Human? Are Wizards not human?
public class Wizard extends MiddleEarthCharacter {

	public Wizard(String n, double h, double p) {
		super(n, h, p);
	}

	/*
	 * A javadoc comment should not be necessary for these methods because
	 * subclasses inherit the javadoc from the superclass. Though it may be
	 * advisable that we confirm this with Professor.
	 */
	public String getRace() {
		return "Wizard";
	}

	public boolean attack(MiddleEarthCharacter target) {
		double mult = 1.0d;

		switch (target.getRace()) {
			case "Dwarf":
				mult = 1.5d;
				break;
			case "Human":
				mult = 0.0d;
				break;
			case "Wizard":
				mult = 0.0d;
				break;
		}

		double dmg = mult * power;

		return target.damage(dmg);
	}
}