package org.mizzoucs3330team.assignment_02;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance = new MiddleEarthCouncil();
	private static CharacterManager cm = new CharacterManager();

	private MiddleEarthCouncil() {
	}

	/**
	 * The MiddleEarthCouncil Singleton allows access to the character manager, while instantiating both itself and a CharacterManager
	 * 
	 * @return instance The instantiated Council object
	 */
	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}

		return instance;
	}

	/**
	 * 
	 * @return cm The CharacterManager (i.e. "cm") instance paired with the Council Singleton
	 */
	public CharacterManager getCharacterManager() {
		return cm;
	}

}
