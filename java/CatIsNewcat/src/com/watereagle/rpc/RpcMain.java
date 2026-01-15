package com.watereagle.rpc;

import java.util.Scanner;

public class RpcMain {

	public static void main(String[] args) {
		System.out.println("어떤거 실행?[1:rpc01|2:rpc02|3:rpc03]");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		
		switch (i) {
		case "1":
			Rpc01 one = new Rpc01();
			one.run();
			break;
		case "2":
			Rpc02 two = new Rpc02();
			two.run();
			break;
		case "3":
			Rpc03 three = new Rpc03();
			three.run();
			break;

		default:
			break;
		}
	}
}
