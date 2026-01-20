package com.watereagle.enumstudy;

enum Day {
	MONDAY(1), /* 예: 상수는 MONDAY, 값은 정수 1 */
	TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	private int value;

	private Day(int value) { // 예시 치킨나이트상시{상수}({int-정수}11{이라는 값})
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
