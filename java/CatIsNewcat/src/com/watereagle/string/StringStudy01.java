package com.watereagle.string;

public class StringStudy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cat = "고양이"; // 힙동네 << "고양이" > 100번지
		// 박스 = 100번지라는 주소를 담음. 단, String 형만 담을수 있음.

		String cat2 = "고양이"; // 재활용. 위 고양이를 다시 써요. << 100
		if (cat == cat2) {
			System.out.println("같음");
			System.out.println(System.identityHashCode(cat));
			System.out.println(System.identityHashCode(cat2));
			// << System.identityHashCode>> : 주소값 리턴
		}

//		String dog = "개"; // 힙동네 옆에 개 집이 지어짐 : 300번지
//		String dog2 = "개"; // 힙동네 옆에 개 집이 또 지어짐 : 400번지
		String dog = new String("개"); // 힙동네 옆에 개 집이 지어짐 : 300번지
		String dog2 = new String("개"); // 힙동네 옆에 개 집이 또 지어짐 : 400번지

		
		if (dog == dog2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		System.out.println(System.identityHashCode(dog));
		System.out.println(System.identityHashCode(dog2));
		// [!] 자바에서는 String 클래스 맴버함수 equals 함수로 동일유무를 비교해야함
		if (dog.equals(dog2)) {
			System.out.println("문자열 같음");
		} else {
			System.out.println("문자열 다름");
		}
	}

}
