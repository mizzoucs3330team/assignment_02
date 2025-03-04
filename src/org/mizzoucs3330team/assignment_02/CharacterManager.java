package org.mizzoucs3330team.assignment_02;

public class CharacterManager {
	private MiddleEarthCharacter[] characters = { null };

	/**
	 * Character count. Calling this "size" is deceptive; "size" actually refers to
	 * the number of characters.
	 */
	private int size = 0;

	// Constructor is not in the spec.

	/**
	 * Add a character. Doubles internal array size if full.
	 * 
	 * @param c The character to add
	 * 
	 * @return The spec does not specify which boolean value to return. I am
	 *         assuming that we should return true on success.
	 */
	private boolean addCharacter(MiddleEarthCharacter c) {
		characters[size] = c;
		return true; // assuming true
	}

	/**
	 * Update a character.
	 * 
	 * @param c      The character to update.
	 * @param name   The character's new name.
	 * @param health The character's updated health.
	 * @param power  The character's updated power.
	 * 
	 * @return Returns true if there is a change. I am assuming the spec means not
	 *         only operation success, but also an actual data change.
	 */
	private boolean updateCharacter(MiddleEarthCharacter c, String name, int health, int power) {
		// TODO
		return false;
	}

	/**
	 * Delete a character.
	 * 
	 * @param c The character to be deleted.
	 * 
	 * @return The spec does not indicate what boolean value to return. Perhaps we
	 *         should just return true on success, and return false on failure, i.e.
	 *         when the character does not exist in the array.
	 */
	private boolean deleteCharacter(MiddleEarthCharacter c) {
		// TODO
		return false;
	}

	/**
	 * Display all characters' information.
	 */
	private void displayAllCharacters() {
		// use displayInfo() to display characters
	}

}
