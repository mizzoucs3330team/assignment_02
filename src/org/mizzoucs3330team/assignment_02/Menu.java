package org.mizzoucs3330team.assignment_02;

import java.util.Scanner;

public class Menu {

	public Menu() {

	}

	public void open() {
		System.out.println("<< MENU >>");
		System.out.println("1. Add a New Character");
		System.out.println("2. View All Characters");
		System.out.println("3. Update a Character");
		System.out.println("4. Delete a Character");
		System.out.println("5. Execute Character Attacks");
		System.out.println("6. Exit");

		Scanner s = new Scanner(System.in);
		int sel = s.nextInt();

		switch (sel) {
		//add new character			
			case 1:{
				System.out.println("Enter character name, hp, and power separated by a space");
		
				String name = s.next();
				Double hp = s.nextDouble();
				Double power = s.nextDouble();

				MiddleEarthCharacter character = new MiddleEarthCharacter(name, hp, power);

				if (addCharacter(character)){
					System.out.println("Character created successfully");
				}
				else System.out.println("Character creation failed");
				}

			}

		//view all characters			
			case 2:displayAllCharacters();
			

		//update a character		
			case 3:

		//delete a character		
			case 4:

		//execute attacks		
			case 5:

		//exit		
			case 6:

		}
	}
}
