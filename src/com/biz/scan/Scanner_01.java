package com.biz.scan;

import java.util.Scanner;

public class Scanner_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 2개의 숫자를 키보드로부터 입력받아서 
		// 덧셈, 곱셈, 뺄셈, 나눗셈 4칙연산을 수행한다.
		
		int num1 = 0;   // 변수선언
		int num2 = 0;	// 변수선언
		
		// prompt라고 하며
		// 사용자에게 키보드로 무언가 시행하라는 메시지를 보여주는것.
		System.out.print("숫자1입력>");
		num1 = scan.nextInt();   // nextint숫자 nextline문자
		
		System.out.print("숫자2입력>");
		num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d", num1,num2,num1+num2);
		
		
	}

}
