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

		Scanner s = new Scanner(System.in);
		int sel = s.nextInt();

		switch (sel) {
//			case 1:

		}
	}
}
