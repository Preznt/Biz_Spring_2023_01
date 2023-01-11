package com.bjw.contact.exec;

public class ExecV3 {
	public static void main(String[] args) {
		
		// 정수값을 저장하는 변수 선언 그리고 값 할당
		int num1 = 100; // 32bit 저장공간
		long num2 = 1_000_000_000_000_000L; // 64bit 저장공간
		
		num1 = 200;
		System.out.println(num1);
		
		// 실수값을 저장하는 변수 선언 그리고 값 할당
		float num3 = 10.0F;
		double num4 = 10.0;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	
		// 뒤에 L이나 F 를 꼭 붙여줘야한다 저장하는 공간이 달라서
		
		num3 = 10.0F / 3.0F; // 소수점 이하 7자리 , 단정도
		num4 = 10.0 / 3.0; // 배정도 : 정밀도가 2배정도 높다
		
		// 밑에 소수자릿수를 잘라버림
		num3 = 10 / 3;
		num4 = 10 / 3; 
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// 큰 저장장소에 작은 저장장소에 저장할때는 오류가 뜨지 않지만 반대는 뜸
		// 실수형 값을 정수형으로 강제로 변환하기
		// "강제형변환"
		num1 = (int)(10.0 /3.0);
		num2 = (int)(10.0 /3.0);
	}
}
