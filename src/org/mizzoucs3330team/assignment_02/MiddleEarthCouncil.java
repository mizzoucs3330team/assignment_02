package org.mizzoucs3330team.assignment_02;

public class MiddleEarthCouncil {
	private static MiddleEarthCouncil instance = new MiddleEarthCouncil();
	private static CharacterManager cm = new CharacterManager();

	private MiddleEarthCouncil() {
	}

	public static MiddleEarthCouncil getInstance() {
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}

		return instance;
	}

	private static CharacterManager getCharacterManger() {
		if (cm == null) {
			cm = new CharacterManager();
		}

		return cm;
	}

}
