package org.mizzoucs3330team.assignment_02;

import java.util.Scanner;

import org.mizzoucs3330team.assignment_02.characters.MiddleEarthCharacter;

public class Menu {

	public Menu(CharacterManager cm) {
		System.out.println("<< MENU >>");
		System.out.println("1. Add a New Character");
		System.out.println("2. View All Characters");
		System.out.println("3. Update a Character");
		System.out.println("4. Delete a Character");

		Scanner s = new Scanner(System.in);
		int sel = s.nextInt();

		switch (sel) {
			case 1: {
				System.out.println("<<< Add a Character >>>");
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

				System.out.print("Enter Character Index: ");
				int i = s.nextInt();

				MiddleEarthCharacter c = cm.getCharacter(i);

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

				System.out.print("Enter Character Index: ");
				int i = s.nextInt();

				cm.deleteCharacter(cm.getCharacter(i));
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				break;
			}
		}

	}

}
