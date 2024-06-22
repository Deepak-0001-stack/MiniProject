package Project1;

import java.util.*;

public class Atm {
	public static void main(String[] args) {

		int balance = 100000;
		int pin = 2468;
		int addAmount = 0;
		int withdrawAmount = 0;
		String name;

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your pin");
		int password = in.nextInt();
		if (password == pin) {

			while (true) {

				System.out.println("Press 1 to see the Balance");
				System.out.println("Press 2 to add Amount");
				System.out.println("Press 3 to withdraw Amount");
				System.out.println("Press 4 to receipt Generation");
				System.out.println("Press 5 to EXIT");

				int option = in.nextInt();

				switch (option) {

				case 1:
					System.out.println("Your current balance: " + balance);
					break;
				case 2:
					System.out.println("Please enter the Amount you want to add");
					addAmount = in.nextInt();
					balance = addAmount + balance;
					break;
				case 3:
					System.out.println("Please enter the Amount you want to withdraw");
					withdrawAmount = in.nextInt();
					if (withdrawAmount > balance) {
						System.out.println("Insufficient balance");
						System.out.println("Please check your Balance");

					} else {
						balance = balance - withdrawAmount;
					}
					break;
				case 4:
					System.out.println("Your Trasaction's | ");
					System.out.println(" " + balance + "- > your current balance");
					System.out.println("Amount added : " + addAmount);
					System.out.println("Amount WithDrawn :" + withdrawAmount);
					System.out.println("Thank you for coming please visit Again!");
					break;
				}

				if (option == 5) {
					System.out.println("Thank you ");
					break;

				}

			}
		} else {
			System.out.println("Wrong pin , please enter correct pin");
		}

	}

}
