package com.biz.exec;

import java.util.Scanner;

public class Exec_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 >1");
		String strNum1 = scan.nextLine();
		int intNum1 = Integer.valueOf(strNum1);
		
		System.out.println("숫자 >2");
		String strNum2 = scan.nextLine();
		int intNum2 = Integer.valueOf(strNum2);
		
		int intSum = intNum1 + intNum2;
		System.out.printf("%d + %d = %d\n",intNum1,intNum2,intNum1+intNum2);
	
		int intMinus = intNum1 - intNum2;
		System.out.printf("%d - %d = %d\n",intNum1,intNum2,intNum1-intNum2);
		
		int intTimes = intNum1 * intNum2;
		System.out.printf("%d * %d = %d\n",intNum1,intNum2,intNum1*intNum2);
		
		int intDivide = intNum1 / intNum2;
		System.out.printf("%d / %d = %d\n",intNum1,intNum2,intNum1/intNum2);
	}

}
