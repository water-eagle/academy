package com.watereagle.studyclass;

public class Dice {

	int n; // 멤버 변수를 추가 못하거나 하진 않음.

	/*
	 * 주사위 굴리는 함수
	 * 
	 * static 키워드 위치는 static public 또는 public static 둘다 됨.
	 */
	static public int roll(int n) {
		int r = (int) (Math.random() * n + 1);
		return r;
	}

	/*
	 * static 함수를 만들면 해당 클래스..
	 * 
	 * 여기서는 Dice 클래스를 new 해서 객체 생성하지 않아도
	 * 
	 * 예: Dice.roll(100) 이런식으로 함수 실행이 가능해짐.
	 */
	public static void main(String[] args) {
		System.out.println(Dice.roll(100));
	}
}
