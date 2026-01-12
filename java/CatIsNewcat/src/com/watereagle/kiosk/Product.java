package com.watereagle.kiosk;

public class Product {

	String name;
	int price;

	Product(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}

	// 2.함수들 (메인 말고)
	void info() {
		System.out.println("상품명: " + name + " 가격: " + price);
	}

}
