package com.biz.exec;

import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_02 {

	public static void main(String[] args) {

		/*
		 * ScoreVO 배열을 5개 생성하고 키보드로터 5명 학생의 학번, 국어, 영어, 수학 점수를 입력받고 각 배열에 저장한 후 리스트를
		 * toString()으로 보이시오.
		 * 
		 */
		ScoreVO[] sVO = new ScoreVO[5];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < sVO.length; i++) {
			sVO[i] = new ScoreVO();
		}
		for (int i = 0; i < sVO.length; i++) {
			System.out.println("학번 >> ");
			String numBer = scan.nextLine();
			sVO[i].setNumber(numBer);

			System.out.println("국어점수 >>");
			String koR = scan.nextLine();
			int intKor = Integer.valueOf(koR);
			sVO[i].setKor(intKor);

			System.out.println("영어점수 >>");
			String Eng = scan.nextLine();
			int intEng = Integer.valueOf(Eng);
			sVO[i].setEng(intEng);

			System.out.println("수학점수 >>");
			String Math = scan.nextLine();
			int intMath = Integer.valueOf(Math);
			sVO[i].setMath(intMath);

		}
		for (int i = 0; i < sVO.length; i++) {
			System.out.println(sVO[i].toString());
		}

	}

}
