﻿package ch04;

class Ex020402PJH	{
	public static void main(String[] args)	{
		
		/*
		내용 : 자바의 정석 p98 표3-6 구현
		비고 : printf에 x%y 입력시 오류로 출력을 못함
		*/
		
		double f1 = 10.0d;   //유한수
		double f2 = 0.0d;    //유한수 

		System.out.printf("x=%.1f y=%.1f x/y=%f x(나머지 연산자)y=%f%n", f1, f2, f1/f2, f1%f2);
		
		double a1 = 10.0d;  // 유한수
		double a2 = 1/0d;   // infinity
		
		System.out.printf("x=%.1f y=%f x/y=%.1f x(나머지 연산자)y=%.1f%n", a1, a2, a1/a2, a1%a2);
		
		double b1 = 1/0d;   // infiniy
		double b2 = 10.0d;  // 유한수
		
		System.out.printf("x=%f y=%.1f x/y=%f x(나머지 연산자)y=%f%n", b1, b2, b1/b2, b1%b2);
		
		double c1 = 1/0d;   //infinity
		double c2 = 1/0d;   //infinity
		System.out.printf("x=%f y=%f x/y=%f x(나머지 연산자)y=%f%n", c1, c2, c1/c2, c1%c2);
		
	}
}