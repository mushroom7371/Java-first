package ch02;

/*
 * 변수 선언과 초기화 관련 연습
 */
class VarEx1 {
	public static void main(String[] args)	{
		int year = 0;	//year 변수 선언 및 초기화
		int age	= 14;	//age 변수 선언 및 초기화
		
		System.out.println(year);   
		System.out.println(age);	
		
		year = age + 2000;  //변수 age에 2000을 더해서 변수 year에 저장
		age = age + 1;	//변수 age에 저장된 값에 1 더하기
		
		System.out.println(year);
		System.out.println(age);
		
	}	
	}