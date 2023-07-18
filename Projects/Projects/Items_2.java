package com.digit.javaTraining.Projects;

public class Items_2 extends Itams_3 {

	// ELECTRONICS
	// TV
	void tvappl() {

		System.out.println("A.\033[1mLG\n\033[0m"
				+ "\033[0mB.\033[1m\033[1mSony\n\033[0m"
				+ "\033[0mC.\033[1m\033[1mSamsung\n\033[0m"
				+ "\033[0mD.\033[1m\033[1mOnePlus\n\033[0m"
				+ "\033[0mE.\033[1m\033[1mMi\033[0m\033[0m");
		choicefive();
		if (option == 1) {
			lg();
		} else if (option == 2) {
			sony();
		} else if (option == 3) {
			samsung();
		} else if (option == 4) {
			sony();
		} else if (option == 5) {
			samsung();
		}
	}

	// Mobile
	void mobiles() {
		System.out.println("A.\033[1mIphone\n\033[0m"
				+ "\033[0mB.\033[1m\033[1mIQOO\n\033[0m"
				+ "\033[0mC.\033[1m\033[1mMI\n\033[0m"
				+ "\033[0mD.\033[1m\033[1mSamsung\n\033[0m"
				+ "\033[0mE.\033[1m\033[1mOne Plus\033[0m");
		choicefive();
		if (option == 1) {
			iphone();
		} else if (option == 2) {
			iqoo();
		} else if (option == 3) {
			miphone();
		} else if (option == 4) {
			samsungphone();
		} else if (option == 5) {
			oneplusphone();
		}
	}

	// HeadPhones
	void headphones() {
		System.out.println("A.\033[1mBoat\n\033[0m"
				+ "\033[0mB.\033[1m\033[1mRealme\n\033[0m"
				+ "\033[0mC.\033[1m\033[1mOneplus\n\033[0m"
				+ "\033[0mD.\033[1m\033[1mNoise\n\033[0m"
				+ "\033[0mE.\033[1m\033[1mJBL\033[0m");
		choicefive();
		if (option == 1) {
			boat();
		} else if (option == 2) {
			realme();
		} else if (option == 3) {
			oneplus();
		} else if (option == 4) {
			noise();
		} else if (option == 5) {
			jbl();
		}
	}

	// Clothes

	void topware() {
		System.out.println("A.\033[1mShirts \n\033[0m"
				+ "\033[0mB.\033[1m\033[1mT-shirt\n\033[0m"
				+ "\033[0mC.\033[1m\033[1mVest\n\033[0m"
				+ "\033[0mD.\033[1m\033[1mSweatshirt\n\033[0m"
				+ "\033[0mE.\033[1m\033[1mSweaters\033[0m");
		choicefive();
		if (option == 1) {
			shirt();
		} else if (option == 2) {
			tshirt();
		} else if (option == 3) {
			vest();
		} else if (option == 4) {
			sweat();
		} else if (option == 5) {
			sweaters();
		}
	}

	void bottomware() {
		System.out.println("A.\033[1mJeans \n \033[0mB.\033[1mShorts\n \033[0mC.\033[1mTrack Pants\n\033[0mD.\033[1mTrousers\n\033[0mE.\033[1mJoggers\033[0m");
		choicefive();
		if (option == 1) {
			jeans();
		} else if (option == 2) {
			shorts();
		} else if (option == 3) {
			trackpant();
		} else if (option == 4) {
			trouser();
		} else if (option == 5) {
			jogger();
		}
	}

	void shoes() {
		System.out.println("A.\033[1mCasual \n \033[0mB.\033[1mSport Shoe\n \033[0mC.\033[1mSneakers\n\033[0mD.\033[1mSandals\n\033[0mE.\033[1mFlip Flops\033[0m");
		choicefive();
		if (option == 1) {
			casual();
		} else if (option == 2) {
			sportz();
		} else if (option == 3) {
			sneaker();
		} else if (option == 4) {
			sandals();
		} else if (option == 5) {
			flipflop();
		}
	}

	// grocery
	void staples() {
		System.out.println("A.\033[1mDal& Pluses \n \033[0mB.\033[1mGhee& Oils\n \033[0mC.\033[1mAtta & Flours\n\033[0mD.\033[1mMasalas & Spices\n\033[0mE.\033[1mRice Products\033[0m");
		choicefive();
		if (option == 1) {
			dal();
		} else if (option == 2) {
			oil();
		} else if (option == 3) {
			atta();
		} else if (option == 4) {
			masala();
		} else if (option == 5) {
			rice();
		}
	}

	void snacks() {
		System.out.println("A.\033[1mBiscuits\n\033[0mB.\033[1mChips \n\033[0mC.\033[1mTea & Coffee\n\033[0mD.\033[1mJuice\n\033[0mE.\033[1mSquash & Syrups\033[0m");
		choicefive();
		if (option == 1) {
			biscuit();
		} else if (option == 2) {
			chips();
		} else if (option == 3) {
			tea();
		} else if (option == 4) {
			juice();
		} else if (option == 5) {
			squash();
		}
	}

	void dairy() {
		System.out.println("A.\033[1mMilk\n\033[0mB.\033[1mCheese\n\033[0mC.\033[1mButter\n\033[0mD.\033[1mPaneer\n\033[0mE.\033[1mEgg\033[0m");
		choicefive();
		if (option == 1) {
			milk();
		} else if (option == 2) {
			cheese();
		} else if (option == 3) {
			butter();
		} else if (option == 4) {
			panner();
		} else if (option == 5) {
			egg();
		}
	}

	// Sports
	void cricket() {
		System.out.println("A.\033[1mBat\n\033[0mB.\033[1mBall\n\033[0mC.\033[1mStumps\n\033[0mD.\033[1mKit\n\033[0mE.\033[1mGloves\033[0m");
		choicefive();
		if (option == 1) {
			bat();
		} else if (option == 2) {
			ball();
		} else if (option == 3) {
			stumps();
		} else if (option == 4) {
			kit();
		} else if (option == 5) {
			gloves();
		}
	}

	void football() {
		System.out.println("A.\033[1mFootBall\n\033[0mB.\033[1mBasketBall\n\033[0mC.\033[1mAir Pump\n\033[0mD.\033[1mBasketball Net\n\033[0mE.\033[1mFootball Net\033[0m");
		choicefive();
		if (option == 1) {
			fball();
		} else if (option == 2) {
			basketball();
		} else if (option == 3) {
			airpump();
		} else if (option == 4) {
			bnet();
		} else if (option == 5) {
			fnet();
		}
	}

	void badminton() {
		System.out.println("A.\033[1mRacket\n\033[0mB.\033[1mShuttlecock\n\033[0mC.\033[1mNet\n\033[0mD.\033[1mTennis Bat\n\033[0mE.\033[1mTennis Ball\033[0m");
		choicefive();
		if (option == 1) {
			racket();
		} else if (option == 2) {
			shuttlecock ();
		} else if (option == 3) {
			net();
		} else if (option == 4) {
			tbat();
		} else if (option == 5) {
			tball();
		}
	}

	// Suppliance
	void home() {
		System.out.println("A.\033[1mPurifier\n\033[0mB.\033[1mRefrigerator\n\033[0mC.\033[1mmicrowave\n\033[0mD.\033[1mFan\n\033[0mE.\033[1mKitchen Vent\033[0m");
		choicefive();
		if (option == 1) {
			purifier();
		} else if (option == 2) {
			refrigerator();
		} else if (option == 3) {
			microwave();
		} else if (option == 4) {
			fan();
		} else if (option == 5) {
			vent();
		}
	}

	void garden() {
		System.out.println("A.\033[1mPost Lamp\n\033[0m"
				+ "B.\033[1mPot Stand\n\033[0mC.\033[1mGloves\n\033[0mD.\033[1mGardening Scissors\n\033[0mE.\033[1mWatering Can\033[0m");
		choicefive();
		if (option == 1) {
			postlamp();
		} else if (option == 2) {
			potstand();
		} else if (option == 3) {
			handglove();
		} else if (option == 4) {
			scossirs();
		} else if (option == 5) {
			can();
		}
	}

	void office() {
		System.out.println("A.\033[1mPrinter\n\033[0mB.\033[1mProjector\n\033[0mC.\033[1mOffice Chair\n\033[0mD.\033[1mBioMetric\n\033[0mE.\033[1mCoffee Machine\033[0m");
		choicefive();
		if (option == 1) {
			printer();
		} else if (option == 2) {
			projector();
		} else if (option == 3) {
			cctv();
		} else if (option == 4) {
			chair();
		} else if (option == 5) {
			cm();
		}
	}
}
