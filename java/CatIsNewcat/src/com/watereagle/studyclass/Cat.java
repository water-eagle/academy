package com.watereagle.studyclass;

public class Cat {
	int age; // 나이
	String name; // 이름
	String hobby; // 취미

	void x() {
		System.out.println("void는...");
	}

	int y() { // int 형식을 뱉는 함수
		return 100;
	}

	int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// js
	// 생성자 함수 오버로딩

	public Cat() { // 기본 생성자

	}

	public Cat(int age, String name, String hobby) { // 전체 초기화
		this.age = age;
		this.name = name;
		this.hobby = hobby;
	}

	public Cat(int age, String name) { // 이름, 나이만 주는 생성자
		this.age = age;
		this.name = name;
	}

}
