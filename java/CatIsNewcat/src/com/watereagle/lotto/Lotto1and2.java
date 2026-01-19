package com.watereagle.lotto;

public class Lotto1and2 {
	public static void main(String[] args) {
		// .유저 로또, 컴 로또 를 각각 배열로 처리

		int user[] = new int[6];
		int com[] = new int[6];
		int l = 0;

		System.out.println(" --- 당첨 결과 --- ");
		System.out.println("[사람][컴퓨터]");
		
		// .맞춘 갯수 처리 부분을 for 반복문 중첩으로 바꿔 처리하기
		for (int i = 0; i < com.length; i++) {
			user[i] = (int) (Math.random() * 6 + 1);
			com[i] = (int) (Math.random() * 6 + 1);
			
			// 당첨 횟수 부여
			if (user[i] == com[i]) {
				++l;
			}
			System.out.printf("[%d][%d]\n", user[i], com[i]);
		}
		System.out.println("당첨 결과: " + l);
	}
}
