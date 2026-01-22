package com.watereagle.inheritance.example2;

public class Bow extends Item {

	int attack;
	int firing_range;

	/**
	 * @param name
	 * @param grade
	 * @param weight
	 * @param lifetime
	 * @param attack
	 * @param firing_range
	 */
	public Bow(String name, int grade, int weight, int lifetime, int attack, int firing_range) {
		super(name, grade, weight, lifetime);
		this.attack = attack;
		this.firing_range = firing_range;
	}

}
