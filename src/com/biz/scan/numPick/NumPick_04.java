package com.biz.scan.numPick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum; // 자동으로 0 초기화
	private Random rnd; // 초기화코드(= new Random();)를 생성자로...
	private Scanner scan;
	private int intRnd;
	private int intCount = 0;
	private int intKey;
	
	
	public void resetcount() {
		intCount = 0;
	}
	
	public int getcount() {
		return intCount;
	}

	// 생성자 method
	public NumPick_04() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void makeRandom() {
		intRnd = rnd.nextInt(10) + 1;
	}

	public boolean keyInput() {
		System.out.print("숫자(1~10)입력>>, 종료(--END) >>");
		String strKey = scan.nextLine();

		++intCount;

		if (strKey.equals("--END")) {
			return true;
		}
		intKey = Integer.valueOf(strKey);
		return false;
	}

	public int pickup() {

		int ret = intKey - intRnd;
		if (ret == 0) {
			intRnd = rnd.nextInt(10) + 1;
			// intCount = 0;
		}
		return ret;
	}
}
