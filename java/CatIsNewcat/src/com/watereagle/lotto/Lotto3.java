package com.watereagle.lotto;

public class Lotto3 {
	public static void main(String[] args) {
		// .유저 로또, 컴 로또 를 각각 배열로 처리

		int user[] = { 1, 2, 3, 4, 5, 6 }; // new int[6];
		int com[] = new int[6];
		int l = 0;

		System.out.println(" --- 당첨 결과 --- ");
		System.out.println("[사람][컴퓨터]");

		// .맞춘 갯수 처리 부분을 for 반복문 중첩으로 바꿔 처리하기
		for (int i = 0; i < com.length; i++) {
			while (true) {
//				user[i] = (int) (Math.random() * 45 + 1);
				com[i] = (int) (Math.random() * 6 + 1); // 1~6 중 정수 하나 뽑기

				boolean duplicate = false;
				// .당첨번호 중복 안나오게 처리
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j] /* || user[i] == user[j] */) {
						duplicate = true;
						break;
//						--i; 이걸 넣으면 맞춘 갯수 처리 for문에 무한 루프 걸림
					}

				}
				if (!duplicate) {
					break;
				}
			}
			if (user[i] == com[i]) {
				++l;
			}
			System.out.printf("[%d][%d]\n", user[i], com[i]);
		}
		System.out.println("당첨 결과: " + l);
	}
}
