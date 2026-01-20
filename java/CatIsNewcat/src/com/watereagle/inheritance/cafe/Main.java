package com.watereagle.inheritance.cafe;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		Product coffee = ((Product) new Drink("아아", 1000));
		Product macaron = new Dessert("마카롱", 3000);

		products.add(coffee);
		products.add(macaron);

		for (int i = 0; i < products.size(); i++) {
			products.get(i).dispPrice();
			products.get(i).packaging();

			if (products.get(i) instanceof Drink) {
				((Drink) products.get(i)).rangedAttack();
			}
			if (products.get(i) instanceof Dessert) {
				((Dessert) products.get(i)).meleeAttack();
			}
		}
	}

}
