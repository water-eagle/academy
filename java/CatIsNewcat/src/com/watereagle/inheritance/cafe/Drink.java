package com.watereagle.inheritance.cafe;

public class Drink extends Product {

	String name;

	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}

	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	void packaging() {
		// super.packaging();
		System.out.println("캐리어에 포장함");
	}

	void rangedAttack() {

	}
}
