package com.watereagle.inheritance.example2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Character c = new Character("고양이", 3, 100);
		Sword s = new Sword("장검", 3, 150, 100, 70);
		Sword l = new Sword("단검", 2, 100, 50, 70);
		Bow b = new Bow("일반 활", 2, 1, 150, 80, 200); // 응용
		// 할아버지형 리스트에 손자, 아들, 본인 다 넣을 수 있음.(상속의 중요 특성)

		ArrayList<GameObj> gs = new ArrayList<GameObj>();
		gs.add(c);
		gs.add(s);
		gs.add(l);
		gs.add(b); // 응용
		for (GameObj o : gs) {
			System.out.println(o.name);
		}
	}

}
