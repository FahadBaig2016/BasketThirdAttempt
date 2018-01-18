package com.fdmgroup.basket;

import java.util.ArrayList;
import java.util.List;

public class FruitEntity {

	private double price;
	private String name;
	List<FruitEntity> fruitlist = new ArrayList<FruitEntity>();
	public FruitEntity() {

	}

	public FruitEntity(String name, double price) {
		this.name = name;
		this.price = price;
		fruitlist.add(this);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
