package org.mizzoucs3330team.assignment_02;

import java.util.Scanner;

import org.mizzoucs3330team.assignment_02.characters.Dwarf;
import org.mizzoucs3330team.assignment_02.characters.Elf;
import org.mizzoucs3330team.assignment_02.characters.Human;
import org.mizzoucs3330team.assignment_02.characters.MiddleEarthCharacter;
import org.mizzoucs3330team.assignment_02.characters.Orc;
import org.mizzoucs3330team.assignment_02.characters.Wizard;

public class Menu {

	public Menu(CharacterManager cm) {
		boolean online = true;
		while (online) {
			System.out.println("<< MENU >>");
			System.out.println("1. Add a New Character");
			System.out.println("2. View All Characters");
			System.out.println("3. Update a Character");
			System.out.println("4. Delete a Character");
			System.out.println("5. Execute All Character Attacks");
			System.out.println("6. Exit");

			Scanner s = new Scanner(System.in);
			int sel = s.nextInt();

			switch (sel) {
				case 1: {
					System.out.println("<<< Add a Character >>>");

					System.out.print("Race: ");
					String race = s.next();

					System.out.print("Name: ");
					String n = s.nextLine();

					System.out.print("Health: ");
					Double h = s.nextDouble();

					System.out.print("Power: ");
					Double p = s.nextDouble();

					MiddleEarthCharacter c = null;

					switch (race) {
						case "Elf":
							c = new Elf(n, h, p);
							break;
						case "Dwarf":
							c = new Dwarf(n, h, p);
							break;
						case "Human":
							c = new Human(n, h, p);
							break;
						case "Orc":
							c = new Orc(n, h, p);
							break;
						case "Wizard":
							c = new Wizard(n, h, p);
							break;
					}

					if (c == null) {
						System.out.println("Invalid race.");
						return;
					}

					if (cm.addCharacter(c)) {
						System.out.println("Character Successfully Created!");
					} else {
						System.out.println("Character Creation Failed");
					}

					break;
				}
				case 2: {
					System.out.println("<<< View All Characters >>>");
					cm.displayAllCharacters();
					break;
				}
				case 3: {
					System.out.println("<<< Update a Character >>>");
					cm.displayAllCharacters();

					System.out.print("Enter Character Name: ");
					String oldN = s.nextLine();

					MiddleEarthCharacter c = cm.getCharacter(oldN);

					System.out.print("New Name: ");
					String n = s.nextLine();

					System.out.print("New Health: ");
					double h = s.nextDouble();
					if (h < 0) {
						return;
					}

					System.out.print("New Power: ");
					double p = s.nextDouble();
					// run checks

					break;
				}
				case 4: {
					System.out.println("<<< Delete a Character >>>");
					cm.displayAllCharacters();

					System.out.print("Enter Character Name: ");
					String n = s.nextLine();
					MiddleEarthCharacter c = cm.getCharacter(n);

					cm.deleteCharacter(c);
					break;
				}
				case 5: {
					System.out.println("<<< Attacking Characters >>>");

					int size = cm.getSize();

					for (int i = 0; i < size - 2; i++) {
						MiddleEarthCharacter attacker = cm.getCharacterByIndex(i);

						MiddleEarthCharacter v = cm.getCharacterByIndex(i + 1);

						attacker.attack(v);
					}

					cm.getCharacterByIndex(size - 1).attack(cm.getCharacterByIndex(0));

					break;
				}
				case 6: {
					System.out.println("Exiting Menu...");
					online = false;
					break;
				}
			}
		}
	}
}
