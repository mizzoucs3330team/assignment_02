package org.mizzoucs3330team.assignment_02.characters;

public class Elf extends MiddleEarthCharacter {

	public Elf(String n, double h, double p) {
		super(n, h, p);
	}

	/*
	 * A javadoc comment should not be necessary for these methods because
	 * subclasses inherit the javadoc from the superclass. Though it may be
	 * advisable that we confirm this with Professor.
	 */
	public String getRace() {
		return "Elf";
	}

	public boolean attack(MiddleEarthCharacter target) {
		double mult = 1.0d;

		switch (target.getRace()) {
			case "Orc":
				mult = 1.5d;
				break;
			case "Dwarf":
				mult = 0.0d;
				break;
			case "Elf":
				mult = 0.0d;
				break;
		}

		double damage = mult * power;

		// TODO

		return false;
	}
}
