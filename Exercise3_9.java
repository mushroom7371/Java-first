package ch03;

/*
출제일 : 20210204
내용 : 연습문제
제출자 : 박준화
*/

public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a' <= ch && ch <='z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
		
		System.out.println(b);

	}

}
