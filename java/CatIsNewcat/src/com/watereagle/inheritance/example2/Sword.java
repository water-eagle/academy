package com.watereagle.inheritance.example2;

public class Sword extends Item {

	int attack;

	// source탭 단축키 윈도우: alt+shift+s 맥: opt+cmd+s

	void slash() {
		System.out.println(name + "으로 " + attack + "데미지로 공격함" + weight);
	}

	/**
	 * @param name
	 * @param grade
	 * @param weight
	 * @param lifetime
	 * @param attack
	 */
	public Sword(String name, int grade, int weight, int lifetime, int attack) {
		super(name, grade, weight, lifetime);
		this.attack = attack;
	}

}
