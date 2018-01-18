package com.fdmgroup.basket;

import java.util.List;

public class ListOfFruits {

	//This class is where the fruit objects are created and stored in a list. 
	FruitsArrayList fa = new FruitsArrayList();
	
	public  List<FruitEntity> listOfFruits() {
		fa.fruitsArrayList.add(new FruitEntity("Apple", 0.25));
		fa.fruitsArrayList.add(new FruitEntity("Banana", 0.15));
		fa.fruitsArrayList.add(new FruitEntity("Orange", 0.30));
		fa.fruitsArrayList.add(new FruitEntity("Lemon", 0.40));
		fa.fruitsArrayList.add(new FruitEntity("Peach", 0.35));
		return(fa.fruitsArrayList);
	}

}
