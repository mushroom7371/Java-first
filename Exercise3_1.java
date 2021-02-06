package ch03;

public class Exercise3_1 {

	/*
	출제일 : 20210204
	내용 : 연습문제 풀이
	제출자 : 박준화
	*/
	
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';	// "A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >=5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println(!('A' <= c && c <='Z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		

	}

}
