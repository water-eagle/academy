package com.watereagle.catisnewcat;

import java.util.Scanner;
import java.util.function.Function;

public class rpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("가위바위보 중에 하나 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();

		System.out.println(cmd + "를 입력함");

		int r = (int) (Math.random() * 3 + 1); // 1~3까지 랜덤하게 뽑음

		if (r == 1) {
			cmd = "가위";
		} else if (r == 2) {
			cmd = "바위";
		} else if (r == 3) {
			cmd = "보";
		}

	}

}
