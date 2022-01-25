package ch09;

import java.util.Date;

class ToStringTest {
	public static void main(String[] args) {
		String str = new String("KOREA");
		Date today = new Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		//String 클래스에서의 toString() 메서드는 Object 클래스의 toString() 메서드를 오버라이딩(재정의) 하였다.
		System.out.println(today);
		System.out.println(today.toString());
		//마찬가지로 Date 클래스 또한 toString() 메서드를 재정의 하였다.
	}
}
