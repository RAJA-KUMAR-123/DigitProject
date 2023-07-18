package com.digit.javaTraining.Projects;

import java.util.Scanner;

public class Itams_3 {
	Scanner sc = new Scanner(System.in);
	String opt, s1, menu;
	int option;
	float price, discount;

	void choicefive() {
		System.out.println("Enter your choice:-");
		opt = sc.next();
		if (opt.equalsIgnoreCase("a")) {
			option = 1;

		} else if (opt.equalsIgnoreCase("b")) {
			option = 2;
		} else if (opt.equalsIgnoreCase("c")) {
			option = 3;
		} else if (opt.equalsIgnoreCase("d")) {
			option = 4;
		} else if (opt.equalsIgnoreCase("e")) {
			option = 5;

		} else {
			System.out.println("Enter a valid Option");
			System.out.println("\n");
			choicefive();
		}
	}
	void choicethree() {
		System.out.println("Enter your choice:-");
		opt = sc.next();
		if (opt.equalsIgnoreCase("a")) {
			option = 1;

		} else if (opt.equalsIgnoreCase("b")) {
			option = 2;
		} else if (opt.equalsIgnoreCase("c")) {
			option = 3;
		} else if (opt.equalsIgnoreCase("p")) {
			option = 4;
		} else {
			System.out.println("Enter a valid Option");
			System.out.println("\n");
			choicethree();
		}
	}
	void buy() {
		System.out.println("Type \033[1m Y\033[0m to Buy");
		s1 = sc.next();
		if (s1.equalsIgnoreCase("y")) {
			System.out.println("Thanks for shopping 🛍️");
			System.out.println("Your Bill amount is: \033[1m" + price+"\033[0m\n");
		}
		else if(s1.equalsIgnoreCase("n")) {
			System.out.println("Thank You");
		}
		else {
			System.out.println("\nEnter a valid option.");
			buy();
		}
	}

	void dis(float amount, float discount) {
		float ap, dp;
		dp = price * discount / 100;
		ap = price - dp;
		if (discount != 0) {
			System.out.println("\033[1mCongratulation🎉🎉🎉 \033[0m\n" + "You're Eligible for a Discount of \033[1m" + discount
					+ "%f\033[0m\n" + "Your overall bill is :\033[1m" + ap+"\033[0m");

		} else {
			System.out.println("Your Bill amount is :\033[1m" + ap+"\033[0m");
		}

	}

	// TV APPLIANCE
	void lg() {
		price = 13990;
		discount = 0;
		System.out.println(
				"Product :\033[1mLG\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "\nDescription:\033[1m "
						+ "LG 80 cm (32 inches) HD Ready Smart LED TV 32LM563BPTC (Dark Iron Gray)" + "\033[0m");

		dis(price, discount);

	}

	void sony() {
		price = 57990;
		discount = 0;
		System.out.println("Product :\033[1m Sony Bravia\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Sony Bravia 139 cm (55 inches) 4K Ultra HD Smart LED Google TV KD-55X74K (Black)\n" + "\033[0m");

		dis(price, discount);

		buy();

	}

	void samsung() {
		price = 12990;
		discount = 19;
		System.out.println("Product :\033[1m Sony Bravia\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Samsung 80 cm (32 Inches) Wondertainment Series HD Ready LED Smart TV UA32T4340BKXXL (Glossy Black)"
				+ "\033[0m");

		dis(price, discount);

		buy();

	}

	void oneplustv() {
		price = 39990;
		discount = 19;
		System.out.println("Product :\033[1m One Plus\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "OnePlus 138 cm (55 inches) Y Series 4K Ultra HD Smart Android LED TV 55Y1S Pro (Black)" + "\033[0m");

		dis(price, discount);

		buy();

	}

	void mitv() {
		price = 15990;
		discount = 19;
		System.out.println("Product :\033[1m Mi\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Mi 80 cm (32 inches) 5A Series HD Ready Smart Android LED TV L32M7-5AIN (Black)" + "\033[0m");

		dis(price, discount);

		buy();

	

	}

	// MOBILES
	void iphone() {
		price = 163990;
		discount = 10;
		System.out.println("Product :\033[1m Apple iPhone\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m " + "Apple iPhone 14 Pro (1 TB) - Gold" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void iqoo() {
		price = 163990;
		discount = 10;
		System.out.println("Product :\033[1m iQOO Neo 7 Pro 5G\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "iQOO Neo 7 Pro 5G (Dark Storm, 12GB RAM, 256GB Storage) | Snapdragon® 8+ Gen 1 | Independent Gaming Chip | Flagship 50MP OIS Camera | AG Glass Design"
				+ "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void miphone() {
		price = 29990;
		discount = 10;
		System.out.println("Product :\033[1m Mi 11X \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Cosmic Black 6GB RAM 128GB ROM Storage 5G | SD 870 | DisplayMate A+ rated 120Hz E4 AMOLED | 48MP Sony sensor\r\n"
				+ "" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void samsungphone() {
		price = 8499;
		discount = 10;
		System.out.println("Product :\033[1m Samsung Galaxy M04 \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Dark Blue, 4GB RAM, 64GB Storage | Upto 8GB RAM with RAM Plus | MediaTek Helio P35 Octa-core Processor | 5000 mAh Battery | 13MP Dual Camera"
				+ "\033[0m");

		dis(price, discount);

		buy();


	}

	void oneplusphone() {
		price = 17999;
		discount = 10;
		System.out.println("Product :\033[1m OnePlus Nord CE 2 Lite \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m " + "OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)"
				+ "\033[0m");

		dis(price, discount);

		buy();

	

	}

	// HeadPhones
	void boat() {
		price = 1490;
		discount = 0;
		System.out.println("Product :\033[1m boAt Rockerz 450\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Headphones with Mic, Upto 15 Hours Playback, 40MM Drivers, Padded Ear Cushions" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void realme() {
		price = 1299;
		discount = 0;
		System.out.println("Product :\033[1m realme Buds Wireless 2 Neo\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Bluetooth in Ear Earphones with Mic, Fast Charging & Up to 17Hrs Playtime (Blue)" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void oneplus() {
		price = 1999;
		discount = 0;
		System.out.println("Product :\033[1m OnePlus Bullets Z2\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Earphones with Mic, Bombastic Bass - 12.4 mm Drivers, 10 Mins Charge - 20 Hrs Music, 30 Hrs Battery Life"
				+ "\033[0m");

		dis(price, discount);

		buy();

	

	}

	void noise() {
		price = 1499;
		discount = 0;
		System.out.println("Product :\033[1m Noise\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Headphones with 50 Hours Playtime, Low Latency(up to 40ms), 4 Play Modes, Dual Pairing, BT v5.3 (Bold Black)"
				+ "\033[0m");

		dis(price, discount);

		buy();

	
	}

	void jbl() {
		price = 1999;
		discount = 0;
		System.out.println("Product :\033[1m JBL Tune 230NC\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Active Noise Cancellation Earbuds with Mic, Massive 40 Hrs Playtime with Speed Charge, Adjustable EQ APP, 4Mics for Perfect Calls,"
				+ "\033[0m");

		dis(price, discount);

		buy();

	}

	

//Clothing 
	// topware
	// shirt
	void shirt() {
		price = 690;
		discount = 0;
		System.out.println(
				"Product :\033[1m HERE&NOW\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "Size :\033[1m M\033[0m\n"
						+ "\nDescription:\033[1m " + "Men Black Slim Fit Casual Shirt" + "\033[0m");

		dis(price, discount);

		buy();

	
	}

	void tshirt() {
		price = 340;
		discount = 0;
		System.out.println("Product :\033[1m Roadster\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Men Black Colorblocked Round Neck Pure Cotton T-shirt" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void vest() {
		price = 499;
		discount = 0;
		System.out.println("Product :\033[1m Jockey\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Men Pack of 3 Cotton Round Neck Sleeveless Easy Tuck Vest 8820" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void sweat() {
		price = 659;
		discount = 0;
		System.out.println("Product :\033[1m HRX by Hrithik Roshan\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Men Grey Melange Striped Detail Training Sweatshirtt" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void sweaters() {
		price = 5399;
		discount = 0;
		System.out.println("Product :\033[1m Antony Morato\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m " + "Men Textured Pullover Sweater" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Bottomware
	void jeans() {
		price = 492;
		discount = 0;
		System.out.println("Product :\033[1m HIGHLANDER\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Men Black Slim Fit Low Distress Light Fade Stretchable Jeans" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void shorts() {
		price = 337;
		discount = 0;
		System.out.println("Product :\033[1m HIGHLANDER\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m " + "Men Blue Solid Slim Fit Regular Shorts\r\n"
				+ "" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void trackpant() {
		price = 483;
		discount = 0;
		System.out.println("Product :\033[1m KETCH\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m " + "Men Green Solid Track Pants" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void trouser() {
		price = 599;
		discount = 0;
		System.out.println("Product :\033[1m INVICTUS" + "\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m "
				+ "Men Charcoal Grey Checked Slim Fit Formal Trousers" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void jogger() {
		price = 330;
		discount = 0;
		System.out.println("Product :\033[1m TRIPR" + "\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m M\033[0m\n" + "\nDescription:\033[1m " + "Men Colourblocked Regular Fit Joggers\n"
				+ "\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Shoes
	void casual() {
		price = 648;
		discount = 0;
		System.out.println(
				"Product :\033[1m HERE&NOW\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "Size :\033[1m M\033[0m\n"
						+ "\nDescription:\033[1m " + "Men White & Blue Comfort Insole Basics Sneakers" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void sportz() {
		price = 2799;
		discount = 0;
		System.out.println(
				"Product :\033[1m Puma" + "\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "Size :\033[1m M\033[0m\n"
						+ "\nDescription:\033[1m " + "Black Softride Enzo Evo Sports Shoes" + "\033[0m");

		dis(price, discount);

		buy();

	

	}

	void sneaker() {
		price = 330;
		discount = 0;
		System.out.println("Product :\033[1m ASIAN \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m 7\033[0m\n" + "\nDescription:\033[1m " + "Men White Sneakers" + "\033[0m");

		dis(price, discount);

		buy();

	

	}

	void sandals() {
		price = 1537;
		discount = 0;
		System.out.println("Product :\033[1m Woodland \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "Size :\033[1m 8\033[0m\n" + "\nDescription:\033[1m "
				+ "Men Khaki & Olive Green Colourblocked Comfort Sandals" + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	void flipflop() {
		price = 2831;
		discount = 0;
		System.out.println(
				"Product :\033[1m Crocs \033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "Size :\033[1m 7\033[0m\n"
						+ "\nDescription:\033[1m " + "Bayaband Unisex Navy Blue Solid Clogs" + "\033[0m");

		dis(price, discount);

		buy();

	
	}

	// Grocery
	void dal() {
		price = 179;
		discount = 0;

		System.out.println("Model:\033[1m Moong Dal(11111)\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Natureland Organics \033[0m" + "\nType:\033[1m Moong Dal\033[0m"
				+ "\nQuantity:\033[1m 1Kg\033[0m" + "\nMaximum Shelf Life:\033[1m 12 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void oil() {
		price = 121;
		discount = 0;

		System.out.println("Model:\033[1m Fortune Sunlite Refined Sunflower Oil\033[0m\n" + "Price:\033[1m" + price
				+ "\033[0m" + "\nBrand:\033[1m Fortune \033[0m" + "\nType:\033[1m Sunflower Oil\033[0m"
				+ "\nQuantity:\033[1m 1Kg\033[0m" + "\nMaximum Shelf Life:\033[1m 9 Months\033[0m");

		dis(price, discount);

		buy();

	}

	
	void atta() {
		price = 417;
		discount = 0;

		System.out.println("Model:\033[1m AASHIRVAAD Shudh Chakki Atta\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m AASHIRVAAD \033[0m" + "\nType:\033[1m Whole-Wheat Flour\033[0m"
				+ "\nQuantity:\033[1m 10Kg\033[0m" + "\nMaximum Shelf Life:\033[1m 3 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void masala() {
		price = 417;
		discount = 0;

		System.out.println("Model:\033[1m Garam Masala\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Catch \033[0m" + "\nType:\033[1m Garam Masala Powder\033[0m"
				+ "\nQuantity:\033[1m 200g\033[0m" + "\nMaximum Shelf Life:\033[1m 12 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void rice() {
		price = 296;
		discount = 0;

		System.out.println("Model:\033[1m Basmati Rice\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m INDIA GATE\033[0m" + "\nType:\033[1m Mini Mogra\033[0m"
				+ "\nQuantity:\033[1m 5Kg\033[0m" + "\nMaximum Shelf Life:\033[1m 24 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Staples
	void biscuit() {
		price = 417;
		discount = 0;

		System.out.println("Model:\033[1m BRITANNIA Good Day Chocochips Cookies \033[0m\n" + "Price:\033[1m" + price
				+ "\033[0m" + "\nBrand:\033[1m BRITANNIA \033[0m" + "\nType:\033[1m Cookies\033[0m"
				+ "\nQuantity:\033[1m 400g\033[0m" + "\nMaximum Shelf Life:\033[1m 8 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void chips() {
		price = 107;
		discount = 0;

		System.out.println("Model:\033[1m Pringles Potato Chips \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Pringles \033[0m" + "\nType:\033[1m Chips\033[0m" + "\nQuantity:\033[1m 120g\033[0m"
				+ "\nMaximum Shelf Life:\033[1m12 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void tea() {
		price = 516;
		discount = 0;

		System.out.println("Model:\033[1m Red Label\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Red Label \033[0m" + "\nType:\033[1m Flavored Tea\033[0m"
				+ "\nQuantity:\033[1m 1Kg\033[0m" + "\nMaximum Shelf Life:\033[1m8 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void juice() {
		price = 137;
		discount = 0;

		System.out.println("Model:\033[1m B Natural Guava Juice\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m B Natural \033[0m" + "\nType:\033[1m Fruit\033[0m" + "\nQuantity:\033[1m 2L\033[0m"
				+ "\nMaximum Shelf Life:\033[1m12 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void squash() {
		price = 107;
		discount = 0;

		System.out.println("Model:\033[1mRooh Afza\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Rooh Afza\033[0m" + "\nType:\033[1m Sharbat\033[0m" + "\nQuantity:\033[1m 1L\033[0m"
				+ "\nMaximum Shelf Life:\033[1m18 Months\033[0m");

		dis(price, discount);

		buy();

	}

	
	// Dairy
	void milk() {
		price = 68;
		discount = 0;

		System.out.println("Model:\033[1mAmul Taaza Homogenised Toned Milk\033[0m\n" + "Price:\033[1m" + price
				+ "\033[0m" + "\nBrand:\033[1m Amul \033[0m" + "\nType:\033[1m Toned\033[0m"
				+ "\nQuantity:\033[1m 1L\033[0m" + "\nMaximum Shelf Life:\033[1m6 Months\033[0m");

		dis(price, discount);

		buy();

	

	}

	void cheese() {
		price = 80;
		discount = 0;

		System.out.println("Model:\033[1mCheese Slice \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Nandini \033[0m" + "\nType:\033[1m Plain\033[0m" + "\nQuantity:\033[1m 100g\033[0m"
				+ "\nMaximum Shelf Life:\033[1m6 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void butter() {
		price = 80;
		discount = 0;

		System.out.println("Model:\033[1mAmul Pasteurised Butter \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Amul \033[0m" + "\nType:\033[1m Butter\033[0m" + "\nQuantity:\033[1m 500g\033[0m"
				+ "\nMaximum Shelf Life:\033[1m6 Months\033[0m");

		dis(price, discount);

		buy();

	
	}

	void panner() {
		price = 120;
		discount = 0;

		System.out.println("Model:\033[1mAmul Panner\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Amul \033[0m" + "\nType:\033[1m Panner\033[0m" + "\nQuantity:\033[1m 250g\033[0m"
				+ "\nMaximum Shelf Life:\033[1m6 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	void egg() {
		price = 120;
		discount = 0;

		System.out.println("Model:\033[1mEgg\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Farm Egg \033[0m" + "\nType:\033[1m Fresho Farm Eggs\033[0m"
				+ "\nQuantity:\033[1m 6pcs\033[0m" + "\nMaximum Shelf Life:\033[1m6 Months\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Sports
	void bat() {
		price = 2199;
		discount = 0;

		System.out.println("Model:\033[1m SG Kashmir Willow Cricket Bat\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m SG\033[0m" + "\nMaterial:\033[1m Willow Wood\033[0m"
				+ "\nSport:\033[1m Cricket\033[0m");

		dis(price, discount);

		buy();

	}

	

	void ball() {
		price = 299;
		discount = 0;

		System.out.println("Model:\033[1m SG Leather Cricket Ball\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m SG\033[0m" + "\nMaterial:\033[1m Leather\033[0m" + "\nSport:\033[1m Cricket\033[0m");

		dis(price, discount);

		buy();

	}

	

	void stumps() {
		price = 799;
		discount = 0;

		System.out.println("Model:\033[1mBoldfit Cricket Stumps \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1mBoldfit \033[0m" + "\nMaterial:\033[1mPlastics \033[0m"
				+ "\nSport:\033[1m Cricket\033[0m");

		dis(price, discount);

		buy();

	}

	

	void kit() {
		price = 2199;
		discount = 0;

		System.out.println("Model:\033[1mSG Kashmir Eco Cricket Kit \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m SG\033[0m"
				+ "\nCricket Kit Includes : \033[1m Cricket Bat (with cover) + Legguard + Batting Gloves + Kitbag + Thigh Guard + Arm Guard + Abdo Guard\033[0m"
				+ "\nSport:\033[1m Cricket\033[0m");

		dis(price, discount);

		buy();

	}

	
	void gloves() {
		price = 899;
		discount = 0;

		System.out.println("Model:\033[1mSG Ecolite RH Batting Gloves \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m SG \033[0m" + "\nMaterial:\033[1m Cotton\033[0m" + "\nSport:\033[1m Cricket\033[0m");

		dis(price, discount);

		buy();

	}

	

	// football

	void fball() {
		price = 439;
		discount = 0;

		System.out.println(
				"Model:\033[1mNivia\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "\nBrand:\033[1m Nivia \033[0m"
						+ "\nMaterial:\033[1m rubber\033[0m" + "\nSport:\033[1m Football\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Basketball

	void basketball() {
		price = 759;
		discount = 0;

		System.out.println(
				"Model:\033[1mNivia\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "\nBrand:\033[1m Nivia \033[0m"
						+ "\nMaterial:\033[1m rubber\033[0m" + "\nSport:\033[1m Basketball\033[0m");

		dis(price, discount);

		buy();

	}


	// kit
	void airpump() {
		price = 899;
		discount = 0;

		System.out.println("Model:\033[1m Nivia Double Action Ball Pump\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Nivia \033[0m" + "\nMaterial:\033[1m Plastic\033[0m"
				+ "\nSport:\033[1m Football\033[0m");

		dis(price, discount);

		buy();

	}



	// stumps

	void bnet() {
		price = 499;
		discount = 0;

		System.out.println("Model:\033[1m Elk Power Nylon Basketball Ring\033[0m\n" + "Price:\033[1m" + price
				+ "\033[0m" + "\nBrand:\033[1m Elk Power \033[0m" + "\nMaterial:\033[1m Nylon\033[0m"
				+ "\nSport:\033[1m Basketball\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Football net
	void fnet() {
		price = 1449;
		discount = 0;

		System.out.println("Model:\033[1mSoccer Goal Post\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Synco \033[0m" + "\nMaterial:\033[1m Polyvinyl Chloride\033[0m"
				+ "\nSport:\033[1m Football\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Badminton
	void racket() {
		price = 4249;
		discount = 0;

		System.out.println("Model:\033[1mBadminton Racket\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Victor \033[0m" + "\nMaterial:\033[1m Graphite\033[0m"
				+ "\nSport:\033[1m Badminton\033[0m");

		dis(price, discount);

		buy();

	}

	

	// shuttlecock
	void shuttlecock() {
		price = 1300;
		discount = 0;

		System.out.println("Model:\033[1mFZ FORZA S-5000 SHUTTLES\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m FZ \033[0m" + "\nMaterial:\033[1m SHUTTLES\033[0m"
				+ "\nSport:\033[1m Badminton\033[0m");

		dis(price, discount);

		buy();

	}

	
	// net

	void net() {
		price = 6229;
		discount = 0;

		System.out.println("Model:\033[1mTennis Net\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Sportiva \033[0m" + "\nMaterial:\033[1m Polyvinyl Chloride\033[0m"
				+ "\nSport:\033[1m Tennis\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Tennis Bat
	void tbat() {
		price = 1299;
		discount = 0;

		System.out.println("Model:\033[1mTennis Racquet\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m Cosco \033[0m" + "\nMaterial:\033[1m Aluminium\033[0m"
				+ "\nSport:\033[1m Tennis\033[0m");

		dis(price, discount);

		buy();

	}


	// tennis ball
	void tball() {
		price = 449;
		discount = 0;

		System.out.println("Model:\033[1mTennis Ball\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nBrand:\033[1m HEAD \033[0m" + "\nMaterial:\033[1m Felt\033[0m" + "\nSport:\033[1m Cricket\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Home Suppliance
	//
	// purifier
	void purifier() {
		price = 14449;
		discount = 40;

		System.out.println("Model:\033[1m KENT Supreme RO Water (11111)\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m 8L Storage | 20 L/hr Output | White\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Refrigerator
	void refrigerator() {
		price = 33990;
		discount = 31;
		System.out.println("Model:\033[1mSamsung 236 L\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1mDouble Door Refrigerator (RT28C3452S8/HL, Silver, Elegant Inox, 2023)\033[0m");

		dis(price, discount);

		buy();

	

	}

	// Microwave
	void microwave() {
		price = 5490;
		discount = 25;
		System.out.println("Model:\033[1m Panasonic 20L\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m 20L capacity |Stainless Steel | Silver |‎800 Watts\n\033[0m");

		dis(price, discount);

		buy();

	}

	

	// fan
	void fan() {
		price = 2999;
		discount = 25;
		System.out.println("Model:\033[1m USHA Energia\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m 1200mm High Speed 32 Watt Energy Saving BLDC Ceiling Fan with Remote Control (White)\n\033[0m");

		dis(price, discount);

		buy();

	}

	

	// vent
	void vent() {
		price = 2999;
		discount = 25;
		System.out.println("Model:\033[1m USHA Aeroclean \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m Dust Metal Exhaust Fan for Kitchen(Metallic Grey)\n\033[0m");

		dis(price, discount);

		buy();

	}

	

// GArden
	// postlamp
	void postlamp() {
		price = 1599;
		discount = 0;
		System.out.println("Product :\033[1m Post Lamp \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m hardoll 10W Solar Lights for Outdoor Home Garden 20 LED Waterproof \n"
				+ "\n\033[0m");

		dis(price, discount);

		buy();

	}

	
	// potstand
	void potstand() {
		price = 1599;
		discount = 0;
		System.out.println("Product :\033[1m Plant Stand/Pot Stand \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m TrustBasket Rectangular Indigo Galvanized Metal Plant Stand/Pot Stand - 24 inches (Set of 4) for Indoor & Outdoor Use\n"
				+ "\n\033[0m");

		dis(price, discount);

		buy();

	}


	// gloves
	void handglove() {
		price = 159;
		discount = 0;
		System.out.println("Product :\033[1m Garden Hand Gloves \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m TrustBasket Reusable,Heavy Duty Garden Hand Gloves 2 Count (Pack Of 1) Parrot Green\n\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Scossirs
	void scossirs() {
		price = 499;
		discount = 0;
		System.out.println("Product :\033[1m Gardening Scissors \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "TrustBasket Garden Watering Can (Green 5L) Indoor and Outdoor Garden Usage " + "\n\033[0m");

		dis(price, discount);

		buy();

	}

	

	// watering can
	void can() {
		price = 209;
		discount = 0;
		System.out.println("Product :\033[1mWatering Can \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "TrustBasket Garden Watering Can (Green 5L) Indoor and Outdoor Garden Usage " + "\033[0m");

		dis(price, discount);

		buy();

	}

	

	// Office
	//
	void printer() {
		price = 14999;
		discount = 0;
		System.out.println("Product :\033[1mHP Smart Tank 589 AIO WiFi Color Printer\033[0m\n" + "Price:\033[1m" + price
				+ "\033[0m" + "\nDescription:\033[1m "
				+ "Print, Scan & Copy for Office/Home Get Free Smartwatch on Redemption" + "\033[0m"
				+ "\033[1mConnectivity Technology:\033[0m	Bluetooth, Wi-Fi, USB, Ethernet");

		dis(price, discount);

		buy();

	}

	

	void projector() {
		price = 20999;
		discount = 0;
		System.out.println("Product :\033[1mZEBRONICS Zeb-PIXAPLAY 15\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Android Smart LED Projector with WiFi/BT v5.1, FHD 1080p, Apps, Miracast DLNA/Airplay Support"
				+ "\033[0m"
				+ "\033[1m Technology:\033[0m	Smart Android, App download for OTT, Wireless cast, Screen mirroring, Built-In Wi-Fi, Built-In Speaker,");

		dis(price, discount);

		buy();

	}



	void cctv() {
		price = 2499;
		discount = 0;
		System.out.println("Product :\033[1mTP-Link Tapo 360° \033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "2MP 1080p Full HD Pan/Tilt Home Security Wi-Fi Smart Camera| Alexa Enabled| 2-Way Audio| Night Vision|"
				+ "\033[0m");

		dis(price, discount);

		buy();

	}


	void chair() {
		price = 15999;
		discount = 0;
		System.out.println("Product :\033[1mOffice Chair\033[0m\n" + "Price:\033[1m" + price + "\033[0m"
				+ "\nDescription:\033[1m "
				+ "Patented SmartGRID Technology | SpinePro Adjustable Cushioned Ergonomic Lumbar Support for Desk Chair"
				+ "\033[0m");

		dis(price, discount);

		buy();

	}

	void cm() {
		price = 30999;
		discount = 0;
		System.out.println(
				"Product :\033[1mDeLonghi\033[0m\n" + "Price:\033[1m" + price + "\033[0m" + "\nDescription:\033[1m "
						+ "ECOV311.BK Icona Vintage Pump Espresso Coffee Machine, Black " + "\033[0m");

		dis(price, discount);

		buy();

	}
}


