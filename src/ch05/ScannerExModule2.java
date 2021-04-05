package ch05;

import java.util.*;    // Scanner를 사용하기 위해 추가
//String 파라메터 제어방법
class ScannerExModule2 { 
	public static void main(String[] args) { 
		String[] input= new String[1];//객체배열
		input[0]= new String();//객체배열에 인스턴스 주소 대입
		int num=0;	
		num = inputMethod(input,num);
		System.out.println("input="+input[0]+" num="+(num+1));
		outputMethod(input[0], num);
	
	} 
	
	static int inputMethod(String[] input, int num) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		input[0] = scanner.nextLine();
		num = Integer.parseInt(input[0]);
		return num;
		//outputMethod();
	}
	
	static void outputMethod(String input, int num) {
		
		System.out.println("입력내용 :"+ input);
		System.out.printf("num=%d%n", num);
		
	}
}
