package org.mizzoucs3330team.assignment_02;

public class CharacterManager {
	private MiddleEarthCharacter[] characters = { null };

	// Calling this "size" is deceptive; "size" actually refers to the number of
	// characters.
	private int size = 0;

	// Constructor is not in the spec.

	// Spec does specify what boolean value to return.
	private boolean addCharacter(MiddleEarthCharacter c) {
		characters[size] = c;
		return true; // assuming true
	}

	// Returns true if there is a change
	private boolean updateCharacter(MiddleEarthCharacter c, String name, int health, int power) {
		// TODO
		return false;
	}

	// Spec does not indicate what boolean value to return
	private boolean deleteCharacter(MiddleEarthCharacter c) {
		// TODO
		return false;
	}

	private void displayAllCharacters() {
		// use displayInfo() to display characters
	}

}
