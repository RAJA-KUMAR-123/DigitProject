package com.digit.javaTraining.Projects;

import java.util.Scanner;

class Application extends Items_1 {

	void major() {
		System.out.println("Enter what you want to buy");
		System.out
				.println("Press\033[1m A \033[0mfor \033[1mElectronic\033[0m\n" + "Press \033[1mB\033[0m for \033[1mClothing\033[0m\n"
						+ "Press \033[1mC \033[0mfor \033[1mGrocery\033[0m\n" + "Press \033[1mD \033[0mfor \033[1mSports\033[0m\n" + "Press \033[1mE \033[0mfor \033[1mappliances\033[0m\n");
		choicefive();
		if (option == 1) {
			electronic();
		} else if (option == 2) {
			clothes();
		} else if (option == 3) {
			grocery();
		} else if (option == 4) {
			sports();
		} else if (option == 5) {
			appliances();
		}

	}

	void welcome() {
		System.out.println("\033[1m----WELCOME ----\033[0m");
		System.out.println("Welcome to MyCart E-commerece Application");
		major();

	}

	void welcomeagain() {
		System.out.println("\033[1m----WELCOME AGAIN ----\033[0m");
		System.out.println("Welcome to MyCart E-commerece Application");
		major();

	}

}

class E_commereceApp {
	public static void main(String[] args) {
		Application a = new Application();
		Scanner s1 = new Scanner(System.in);
		a.welcome();
		String ex;

		for (int i = 0;; i++) {
			System.out.println("Press \033[1m M\033[0m to Go to the Main Menu");
			System.out.println("Type any key to Exit");
			ex = s1.next();
			if (ex.equalsIgnoreCase("m")) {
				a.welcomeagain();
			} else {
				System.out.println("Thanks");
				System.exit(0);
			}
//		a.welcomeagain();
		}
	}
}