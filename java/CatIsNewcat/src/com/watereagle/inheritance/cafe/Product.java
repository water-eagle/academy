package com.watereagle.inheritance.cafe;

public abstract class Product extends Main {

	int price;

	void dispPrice() {
		System.out.println("가격은" + price + "입니다.");
	}

	abstract void packaging(); // 추상화 메서드(함수)
}
