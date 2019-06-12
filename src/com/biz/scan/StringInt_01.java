package com.biz.scan;

public class StringInt_01 {

	public static void main(String[] args) {

		System.out.println(30+40);  // 70이라는 값이 나온다. 
		System.out.println("30 + 40"); // 30+40 이라는 값이 나온다(결과값x)
		
		// "30" 과 "40"은 문자열형 숫자라고 하며
		// 숫자 30과 숫자 40으로 변환시켜서
		// 4칙연산을 수행할 수도 있다.
		System.out.println("30" + "40"); // 3040 이라는 값이 나온다. "30" 문자열형숫자
		
		// 문자열을 정수로 변환하여 덧셀 수행
		System.out.println(Integer.valueOf("30")+  // 문자열형30과 40을를 숫자열형으로 변환. 70
				Integer.valueOf("40") );
		
		// 정수를 문자열로 변환하여 연결을 수행
		System.out.println(Integer.toString(30)+  // 숫자열형30과 40을 문자열형 숫자로 변환. 3040
				Integer.toString(40));
		
		System.out.println(Float.valueOf("30.0f")); // Float형은 white space 가 상관없다.
		
		// 30문자열 뒤에 white space가 있어서
		// 숫자(정수)로 변환할수 없다.
		// NunmerFormat Exception이 발생한다
		System.out.println(Integer.valueOf("30 ")); // 숫자열형30을 나타내라. 하지만 30뒤에 white space가 있어
													// 오류발생.
		
		
	}

}
