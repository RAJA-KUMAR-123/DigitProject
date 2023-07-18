package com.digit.javaTraining.Projects;

public class Items_1 extends Items_2 {

	// Electronics
	void electronic() {
		System.out.println("A.\033[1mTV \033[0m\n"
				+ "B.\033[1mHeadphone\n\033[0m"
				+ "C.\033[1mMobile\033[0m");
		choicethree();
		if (option == 1) {
			tvappl();
		} else if (option == 2) {
			headphones();
		} else if (option == 3) {
			mobiles();
		} 
		
	}

	// Clothes
	void clothes() {
		System.out.println("A.\033[1mTopware \033[0m\n"
				+ "B.\033[1mBottomware\033[0m\n"
				+ "C.\033[1mshoes\033[0m");
		choicethree();
		if (option == 1) {
			topware();
		} else if (option == 2) {
			bottomware();
		} else if (option == 3) {
			shoes();
		}

	}

	void grocery() {
		System.out.println("A.\033[1mSnacks\033[0m \n"
				+ "B.\033[1mStaples\033[0m\n"
				+ "C.\033[1mDairy\033[0m");
		choicethree();
		if (option == 1) {
			snacks();
		} else if (option == 2) {
			staples();
		} else if (option == 3) {
			dairy();
		}
	}

	// sports
	void sports() {
		System.out.println("A.\033[1mCricket\033[0m\n"
				+"B.\033[1mFootball\033[0m\n"
				+"C.\033[1mBadmiton\033[0m");
		choicethree();
		if (option == 1) {
			cricket();
		} else if (option == 2) {
			football();
		} else if (option == 3) {
			badminton();
		}
	}

	// appliances
	void appliances() {
		System.out.println("A.\033[1mHome \033[0m\nB.\033[1mGarden\nC.\033[1mWork\033[0m");
		choicethree();
		if (option == 1) {
			home();
		} else if (option == 2) {
			garden();
		} else if (option == 3) {
			office();
		}
	}
}
