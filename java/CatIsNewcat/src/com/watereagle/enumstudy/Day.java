package com.watereagle.enumstudy;

enum Day {
	MONDAY(1), /* 예: 상수는 MONDAY, 값은 정수 1 */
	TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	private int value;

	private Day(int value) { // Day라는 enum은 키(int값)
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
