package com.watereagle.rpc;

import java.util.Scanner;

public class Rpc01 {

	// public static void main(String[] args) {
	void run() {
		// TODO Auto-generated method stub
		System.out.println("[가위, 바위, 보 중 하나를 입력하세요]");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();

		int r = (int) ((Math.random() * 2) + 1); // 1~3 까지 랜덤하게 뽑음
		// 1가위 2바위 3보
		String com = "오류";
		switch (cmd) {
		case "가위": // 가위
			switch (r) {
			case 1:
				System.out.println("비겼어요");
				break;
			case 2:
				System.out.println("졌어요");
				break;
			case 3:
				System.out.println("이겼어요");
				break;
			default:
				break;
			}
			break;
		case "바위":
			switch (r) {
			case 1:
				System.out.println("이겼어요");
				break;
			case 2:
				System.out.println("비겼어요");
				break;
			case 3:
				System.out.println("졌어요");
				break;
			default:
				break;
			}
		case "보":
			switch (r) {
			case 1:
				System.out.println("졌어요");
				break;
			case 2:
				System.out.println("이겼어요");
				break;
			case 3:
				System.out.println("비겼어요");
				break;
			default:
				break;
			}
		case "x":
			break;
		default:
			System.out.println("랜덤 값이 전송되지 않았습니다.");
			break;
		}
	}

}
