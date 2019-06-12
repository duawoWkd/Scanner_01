package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_04 {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고
		 * 키보드로부터 1부터 10까지 숫자를 입력 받아서
		 * 난수를 맞추는 게임
		 */
		
		Random rnd = new Random();       // 랜덤설정
		int intRnd = rnd.nextInt(10)+1;  // 1부터 ~10까지 랜덤
		
		Scanner scan = new Scanner(System.in);      // 스캐너 지정
		System.out.print("숫자(1~10)입력>>"); 
		String strKey = scan.nextLine();            
		int intKey = Integer.valueOf(strKey.trim()); // 문자형열을 숫자형열로
		
		if(intKey == intRnd) {							// intKey가 intRnd와 같으면
			System.out.println("참 잘했어요");
		}	
		if(intKey > intRnd) {
			System.out.println("큰수를 입력 했군요");
		} else if (intKey < intRnd) {
			System.out.println("작은수를 입력 했군요");
		}
		
		
	}

}
