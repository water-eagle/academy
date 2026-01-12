package com.watereagle.rpc;

import java.util.Scanner;

public class rpc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[가위, 바위, 보 중 하나를 ");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();

		int r = (int) (Math.random() * 2 + 1); // 1~3 까지 랜덤하게 뽑음

		String com = "오류";
		switch (r) {
		case 1: // 가위
			com = "가위";
			break;
		case 2:
			com = "바위";
		case 3:
			com = "보";
		default:
			System.out.println("랜덤 값이 전송되지 않았습니다.");
			break;
			
		// 이제 r하고 com 비교해서 가위바위보 승패 비긴 결과 코드 작성하기
		}
	}

}
