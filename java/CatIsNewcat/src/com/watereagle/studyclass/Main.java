package com.watereagle.studyclass;

public class Main {
	public static void main(String[] args) {
		Cat kitty = new Cat(18, "키티	", "식빵굽기");
		Cat yaongi = new Cat();
		yaongi.age = 10;

		Cat norangi = new Cat(100, "노랑이");

		int sum = norangi.add(1, 2);
		System.out.println(sum);
	}
}
