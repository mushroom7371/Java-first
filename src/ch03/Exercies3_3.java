package ch03;

public class Exercies3_3 {

	/*
	출제일 : 20210204
	내용 : 연습문제 num 을 양수 음수 0 중 하나로 표현하기
	제출자 : 박준화
	*/

	public static void main(String[] args) {
		int num = 10;
		System.out.println( num > 0 ? "양수" : (num < 0 ? "음수" : 0) );

	}

}
