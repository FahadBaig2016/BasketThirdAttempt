package com.fdmgroup.basket;

import java.util.ArrayList;
import java.util.List;

public class FruitsArrayList {
	//This class is for the creating the list for available fruits.

	List<FruitEntity> fruitsArrayList = new ArrayList<FruitEntity>();
	
	public List<FruitEntity> getFruitsArrayList() {
		return fruitsArrayList;
	}

	public void setFruitsArrayList(List<FruitEntity> fruitsArrayList) {
		this.fruitsArrayList = fruitsArrayList;
	}

}
