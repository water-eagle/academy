package com.watereagle.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
	ArrayList<Product> basket = new ArrayList<Product>();

	// 자동 임포트 단축키: control+shift+o(영문자 O)
	Scanner sc = new Scanner(System.in);

	Product p1 = new Product("뜨아", 1700);
	Product p2 = new Product("아아", 2000);
	Product p3 = new Product("라떼", 2900);

	String cmd;

	void run() {
		xx:while (true) {

			System.out.print("명령 입력[1.음료선택/2.디저트선택/e.프로그램종료]:");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				yy:while (true) { // 음료 받기
					// 메뉴 출력
					p1.info();
					p2.info();
					p3.info();

					System.out.println("1. " + p1.name + "/ 2. " + p2.name + "/3. " + p3.name);
					System.out.println("");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println(p1.name + " 선택됨");
						basket.add(p1);
						break;
					case "2":
						System.out.println(p2.name + " 선택됨");
						basket.add(p2);
						break;
					case "3":
						System.out.println(p3.name + " 선택됨");
						basket.add(p3);
						break yy;
					case "x":
						System.out.println("프로그램 종료");
					default:
//						System.out.println("올바른 번호를 입력해주세요.");
						break yy;
					}
				}
			case "2":
				System.out.println("2번");
				break;
			case "e":
				System.out.println("프로그램 종료");

				int count = basket.size();
				System.out.println("장바구니에 담긴 상품 갯수" + count);

				int sum = 0;
//			for (int i = 0; i < basket.size(); i = i + 1) {
//				sum = sum + basket.get(i).price;
//			}
				System.out.println("계산하실 금액은:" + sum + "원 입니다.");

				break xx;
			}
		}
	}
}
