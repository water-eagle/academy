package com.watereagle.inheritance.example2;

public class Item extends GameObj {

	// String name;
	int weight; // 무게
	int lifetime; // 아이템 수명

	/**
	 * @param name
	 * @param grade
	 * @param waeight
	 * @param lifetime
	 */
	public Item(String name, int grade, int weight, int lifetime) {
		super(name, grade);
		this.weight = weight;
		this.lifetime = lifetime;
	}

}
