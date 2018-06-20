package com.tektutorial.demo;

public class CompositionExample {

	public static void main(String[] args) {
		House house = new House();
		System.out.println(house.getKitchen());
		//once we set 
		house = null;
		//now we can not access Kitchen
	}
}

class House {
	public Kitchen kitchen = new Kitchen();

	public House() {
		System.out.println("House Created");
	}

	public Kitchen getKitchen() {
		return kitchen;
	}
}

class Kitchen {

	public Kitchen() {
		System.out.println("Kitchen Created");
	}

	private int numberOfCabin;

	@Override
	public String toString() {
		return "House Kitchen";
	}
	public int getNumberOfCabin() {
		return numberOfCabin;
	}

	public void setNumberOfCabin(int numberOfCabin) {
		this.numberOfCabin = numberOfCabin;
	}

}