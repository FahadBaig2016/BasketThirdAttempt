package com.fdmgroup.basket;

import java.util.ArrayList;
import java.util.List;

public class AddToBasket {

	// This class has the method which goes through the available fruit list and
	// adds the selected fruit to the customer basket.

	BasketEntity be = new BasketEntity();
	ListOfFruits listOfFruits = new ListOfFruits();
	FruitsArrayList fal = new FruitsArrayList();
	List<FruitEntity> customerBasket = new ArrayList<FruitEntity>();
	boolean chosenFruit;

	public void addToBasket(String fruitSelection) { 
		fal.setFruitsArrayList(listOfFruits.listOfFruits());
		for (FruitEntity fruit : fal.getFruitsArrayList()) {
			be.setFirstLetterOfFruit(Character.toString(fruit.getName().charAt(0)));

			if (fruitSelection.equalsIgnoreCase(be.getFirstLetterOfFruit())) {
				be.setSelection(true);
				be.setNewFruit(fruit);
			}
		}
		System.out.println(be.getNewFruit().getName() + " selected");
		customerBasket.add(be.getNewFruit());
		chosenFruit = be.isSelection();

	}
}
