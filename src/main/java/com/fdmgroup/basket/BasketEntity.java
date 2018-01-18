package com.fdmgroup.basket;

public class BasketEntity {

	private String itemSelection;
	private boolean selection = false;
	private String firstLetterOfFruit;
	private FruitEntity newFruit;
	
	public String getItemSelection() {
		return itemSelection;
	}

	public void setItemSelection(String itemSelection) {
		this.itemSelection = itemSelection;
	}

	public boolean isSelection() {
		return selection;
	}

	public void setSelection(boolean selection) {
		this.selection = selection;
	}
	
	public String getFirstLetterOfFruit(){
		return firstLetterOfFruit;
	}
	
	public void setFirstLetterOfFruit(String firstLetterOfFruit){
		this.firstLetterOfFruit = firstLetterOfFruit;
	}

	public FruitEntity getNewFruit() {
		return newFruit;
	}

	public void setNewFruit(FruitEntity newFruit) {
		this.newFruit = newFruit;
	}

	
}
