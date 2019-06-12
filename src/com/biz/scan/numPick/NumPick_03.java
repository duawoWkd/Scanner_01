package com.biz.scan.numPick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum; // 자동으로 0 초기화
	private Random rnd; // 초기화코드(= new Random();)를 생성자로...
	private Scanner scan;

	// 생성자 method (클래스 이름이 같고 리턴값이 없다) 리턴타입이 생길경우 생성자가 안된다.
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void pickup() {

		int intRnd = rnd.nextInt(10) + 1; // 1부터 ~10까지 랜덤
		int intCount = 0;
		while (true) {
			System.out.print("숫자(1~10)입력>>, 종료(--END) >>");
			String strKey = scan.nextLine();

			if (strKey.equals("--END"))
				break;

			int intKey = Integer.valueOf(strKey.trim());
			++intCount;

			if (intKey == intRnd) {
				System.out.println("참 잘했어요");
				System.out.println(intCount + "번만에 맞추었네요");
				intRnd = rnd.nextInt(10) + 1;
				intCount = 0;
			} else {
				if (intKey > intRnd) {
					System.out.println("큰수를 입력 했군요");
				} else if (intKey < intRnd) {
					System.out.println("작은수를 입력 했군요");

				}
				
			}
		}
	}

}
