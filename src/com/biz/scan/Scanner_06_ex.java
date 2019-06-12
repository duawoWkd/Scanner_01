package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_06_ex {

	public static void main(String[] args) {

		/*
		 * 1부터 10까지 임의 난수를 하나 만들고 키보드로부터 1부터 10까지 숫자를 입력 받아서 난수를 맞추는 게임 작성하시오
		 * 
		 * 단, 임의로 종료를 선택할때까지 계속해서 새로운 난수를 만들고 게임을 계속할 수 있도록 하시오
		 */
		Random rnd = new Random(); // 랜덤설정
		int intRnd = rnd.nextInt(10) + 1; // 1부터 ~10까지 랜덤

		Scanner scan = new Scanner(System.in); // 스캐너 지정

		int intCount = 0;
		while (true) {
			System.out.print("숫자(1~10)입력>>, 종료(--END) >>");
			String strKey = scan.nextLine();

			if (strKey.equals("--END"))
				break;

			int intKey = Integer.valueOf(strKey.trim());
			++intCount;

			// 1번코드
			// 일반적인 pattern에서는
			// 중요한코드(정답을 검사하는 코드)
			// 가급적 윗쪽에 있도록 작성한다

			// 이 코드는 정답을 맞추었을 경우
			// 오답인 경우를 건너 뛰어서
			// Scanner_07(2번코드)보다는 다소 효율이 높다
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
