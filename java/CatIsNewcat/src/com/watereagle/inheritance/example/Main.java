package com.watereagle.inheritance.example;

public class Main {

	public static void main(String[] args) {
		Character elf = new Character();
		elf.name = "엘프";
		elf.hp = 100;

		Item book = new Item();
		book.name = "플라잉 기초";
		book.weight = 100;
		book.info();

		Sword shortSword = new Sword();
		shortSword.name = "단검";
		shortSword.lifetime = 250;
		shortSword.attack = 100;

		// 응용
		Bow basicBow = new Bow();
		basicBow.name = "일반 활";
		basicBow.weight = 100;
		basicBow.lifetime = 250;
		basicBow.attack = 80;
		basicBow.firing_range = 300;

	}

}
