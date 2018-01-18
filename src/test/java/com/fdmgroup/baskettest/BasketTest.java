package com.fdmgroup.baskettest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.basket.FruitEntity;

import java.util.ArrayList;
import java.util.List;

public class BasketTest {

	private FruitEntity fruit;
	
	@Before
	public void setup(){
		fruit = new FruitEntity();
	}

	@Test
	public void Test_AddOneAppleToBasket() {

		// Arrange
		List<FruitEntity> fruits = new ArrayList<FruitEntity>();
		double sum = 0;

		// Act
		FruitEntity apple = new FruitEntity("Apple", 0.25);

		fruits.add(apple);

		for (FruitEntity fruit : fruits) {
			sum += fruit.getPrice();
		}
		// Assert

		assertEquals(0.25, sum, 0.0);
	}

	@Test
	public void Test_AddOneAppleAndOneBananaToBasket() {

		// Arrange
		List<FruitEntity> fruits = new ArrayList<FruitEntity>();
		double sum = 0;

		// Act
		FruitEntity apple = new FruitEntity("Apple", 0.25);
		FruitEntity banana = new FruitEntity("Banana", 0.15);

		fruits.add(apple);
		fruits.add(banana);

		for (FruitEntity fruit : fruits) {
			sum += fruit.getPrice();
		}
		// Assert
		assertEquals(0.40, sum, 0.0);
	}

	@Test
	public void Test_AddAppleAndBananaAndOrangeToBasket() {

		// Arrange
		List<FruitEntity> fruits = new ArrayList<FruitEntity>();
		double sum = 0;

		// Act
		FruitEntity apple = new FruitEntity("Apple", 0.25);
		FruitEntity banana = new FruitEntity("Banana", 0.15);
		FruitEntity orange = new FruitEntity("Orange", 0.30);

		fruits.add(apple);
		fruits.add(banana);
		fruits.add(orange);

		for (FruitEntity fruit : fruits) {
			sum += fruit.getPrice();
		}

		// Assert
		assertEquals(0.70, sum, 0.0);
	}

	@Test
	public void Test_AddTwoLemonsToBasket() {

		// Arrange
		List<FruitEntity> fruits = new ArrayList<FruitEntity>();
		double sum = 0;

		// Act
		FruitEntity lemon = new FruitEntity("Lemon", 0.40);

		fruits.add(lemon);
		fruits.add(lemon);

		for (FruitEntity fruit : fruits) {
			sum += fruit.getPrice();
		}

		// Assert
		assertEquals(0.80, sum, 0.0);
	}
	
	
	@Test
	public void Test_RetrieveMangoPrice(){
		
		FruitEntity mango = new FruitEntity("Mango", 0.55);
		
		
		assertEquals(0.55, mango.getPrice(), 0);
	}

	@Test
	public void Test_RetrieveFruitName(){
		
		
		String fruitName = "Berry";
		fruit.setName(fruitName);
		
		assertEquals("Berry", fruit.getName());
	}
	@Test
	public void Test_NumberOfItemsInBasket(){
		List<FruitEntity> fruits = new ArrayList<FruitEntity>();
		
		FruitEntity pear = new FruitEntity();
		FruitEntity kiwi = new FruitEntity("Kiwi", 0.30);
		FruitEntity mango = new FruitEntity("Mango", 0.55);
		FruitEntity lemon = new FruitEntity("Lemon", 0.40);
		
		fruits.add(pear);
		fruits.add(kiwi);
		fruits.add(mango);
		fruits.add(lemon);
		
		assertEquals(4, fruits.size());
	}

}