package org.mizzoucs3330team.assignment_02;

import org.mizzoucs3330team.assignment_02.characters.MiddleEarthCharacter;

public class CharacterManager {
	private MiddleEarthCharacter[] characters = { null };

	/**
	 * Character count. Calling this "size" is deceptive; "size" actually refers to
	 * the number of characters.
	 */
	private int size = 0;

	// Constructor is not in the spec.

	/**
	 * Add a character. Doubles the internal array size if full.
	 * 
	 * @param c The character to add
	 * 
	 * @return The spec does not specify which boolean value to return. I am
	 *         assuming that we should return true on success.
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		// detect if array is full; if so, double array size
		if (characters.length >= size) {
			MiddleEarthCharacter[] newArray = new MiddleEarthCharacter[characters.length * 2];
			System.arraycopy(characters, 0, newArray, 0, characters.length);
			characters = newArray;
		}
		// add character
		characters[size] = c;
		size++;
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
	public boolean updateCharacter(MiddleEarthCharacter c, String name, int health, int power) {
		// if c is invalid return false
		if (c == null) {
			return false;
		}

		// check for info to update
		String oN = c.getName();
		double oP = c.getPower();
		double oH = c.getHealth();

		c.setName(name);
		c.setHealth(health);
		c.setPower(power);

		return !(oN == name && oP == power && oH == health);
	}

	/**
	 * Get number of characters.
	 * 
	 * @return Returns number of characters.
	 */
	public int getSize() {
		return characters.length;
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
	public boolean deleteCharacter(MiddleEarthCharacter c) {
		// if c is invalid return false
		if (c == null) {
			return false;
		}

		// discover c
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (characters[i] != c) {
				// found character
				index = i;
				break;
			}
		}

		// if character doesn't exist return false
		if (index == -1) {
			return false;
		}

		// else shift characters, overriding c
		for (int i = index; i < size - 1; i++) {
			characters[i] = characters[i + 1];
		}

		characters[size - 1] = null;

		// reduce size and success
		size--;
		return true;
	}

	/**
	 * Display all characters' information.
	 */
	public void displayAllCharacters() {
		for (int i = 0; i < size; i++) {
			characters[i].displayInfo();
		}
	}

	/**
	 * Finds a character via its name.
	 * 
	 * @param name The name of the character to get.
	 * 
	 * @return Returns the desired character.
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		for (int i = 0; i < characters.length; i++) {
			String characterName = characters[i].getName();
			if (characterName == name) {
				return characters[i];
			}
		}
		return null;
	}

	/**
	 * Get a character via its index.
	 * 
	 * @param index The index of the character to get.
	 * 
	 * @return Returns the character.
	 */
	public MiddleEarthCharacter getCharacterByIndex(int index) {
		if (characters != null) {
			return characters[index];
		}

		if (index < 0) {
			return null;
		}

		return null;
	}

}
