package com.watereagle.enumstudy;

public class Main { // 접근제한자 public . 클래스임을 표시하는 키워드 class. 클래스이름인 Xxx (첫 대문자 주의. 해당 파일이름도 Xxx.java
					// 로 똑같아야 함 주의)

	public static void main(String[] args) {
		System.out.println(Day.MONDAY);
		System.out.println(Day.FRIDAY.getValue());
		System.out.println(Day.FRIDAY.toString());

		Integer i = 10;
	}

}
