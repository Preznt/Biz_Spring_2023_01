package com.bjw.contact.exec;


public class ExecV2 {
	
	public static void main(String[] args) {
		
		// java 에서는 변수를 선언할때
		// type 키워드가 먼저 온다
		// 명령문 끝에는 반드시 세미콜론(;)이 온다
		int num1 = 100;
		int num2 = 200;
		int sum = 0;
		sum = num1 + num2;
		
		// 옆으로 누워있는건 따로 import 안해줘도 된다
		// form 에 맞도록 출력하기
		System.out.printf("%d + %d = %d", num1, num2, sum);
		
		// 출력하고 enter 를 안누른다
		System.out.print("대한민국");
		System.out.print("우리나라");
	}
}
