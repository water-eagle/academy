package com.watereagle.inheritance.example2;

public class GameObj {

	int grade;
	String name;

	void info() {
		System.out.println("이름: " + name + "등급: " + grade);
	}

	GameObj() {
		System.out.println("게임 오브젝트 생성되었음. 생성자 함수 호출됨.");
	}

	/**
	 * @param grade
	 * @param name
	 */
	public GameObj(String name, int grad) {
		this.grade = grade;
		this.name = name;
	}

	/**
	 * @param name
	 */
	public GameObj(String name) {
		this.name = name;
	}

}