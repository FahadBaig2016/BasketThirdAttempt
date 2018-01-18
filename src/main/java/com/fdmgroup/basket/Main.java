package com.fdmgroup.basket;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	static String answer; // Answer 'yes or no' for prompted question after item
							// selection.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("#0.00"); //This is to ensure total is given to 2dp.
		FruitsArrayList fruitsArrayList = new FruitsArrayList();
		ListOfFruits listOfFruits = new ListOfFruits();
		AddToBasket atb = new AddToBasket();

		double sum = 0;

		fruitsArrayList.setFruitsArrayList(listOfFruits.listOfFruits());
		System.out.println("Please select from the following:");
		for (FruitEntity fruit : fruitsArrayList.getFruitsArrayList()) {
			System.out.println(fruit.getName() + " £" + f.format(fruit.getPrice()));
		}
		System.out.println();
		System.out.println("Enter: ");
		System.out.println();
		for (FruitEntity fruit : fruitsArrayList.getFruitsArrayList()) {
			System.out.print(fruit.getName().charAt(0) + ",");
		}

		System.out.println();

		do {
			atb.addToBasket(scanner.next());

		} while (atb.chosenFruit != true);

		if (atb.chosenFruit == true) {
			System.out.println();
			System.out.println("Have you finished. Enter Y/N");
			answer = scanner.next();

			if (answer.equalsIgnoreCase("y")) {
				for (FruitEntity fruit : atb.customerBasket) {
					System.out.println("Item: " + fruit.getName() + " £" + f.format(fruit.getPrice()));
					sum += fruit.getPrice();

				}
				System.out.println("Number of items in basket: " + atb.customerBasket.size());
				System.out.println("Your total is : £" + f.format(sum));

			}
			if (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer)) {
				do {
					System.out.println();
					System.out.println("Please Enter Y/N");
					answer = scanner.next();
				} while (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer));
			}

			if (answer.equalsIgnoreCase("n")) {
				do {
					System.out.println("Select next item please.");
					do {
						atb.addToBasket(scanner.next());

					} while (atb.chosenFruit != true);

					System.out.println();
					System.out.println("Have you finished. Enter Y/N");
					answer = scanner.next();

					if (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer)) {
						do {
							System.out.println(" ");
							System.out.println("Have you finished. Enter Y/N");
							answer = scanner.next();
						} while (!"y".equalsIgnoreCase(answer) && !"n".equalsIgnoreCase(answer));
					}
				} while (answer.equalsIgnoreCase("n"));
			}

			if (answer.equalsIgnoreCase("y")) {
				for (FruitEntity fruit : atb.customerBasket) {
					System.out.println("Item: " + fruit.getName() + " £" + f.format(fruit.getPrice()));
					sum += fruit.getPrice();

				}
				System.out.println("Number of items in basket: " + atb.customerBasket.size());
				System.out.println("Your total is : £" + f.format(sum));

			} else
				System.out.println("You must Y or N.");
		}

	}
}
