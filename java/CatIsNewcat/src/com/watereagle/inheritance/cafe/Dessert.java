package com.watereagle.inheritance.cafe;

public class Dessert extends Product {

	String name;

	public Dessert(String name, int price) {
		this.price = price;
		this.name = name;
	}

	@Override
	void packaging() {
		System.out.println("종이팩에 포장함");
	}

	void meleeAttack() {

	}
}
