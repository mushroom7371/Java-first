package Study;

import java.util.Calendar;	//자바 유틸의 캘린더 클래스를 쓸수있게 받아옴?

public class TernaryExam {
	public static void main(String [] args) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		//정수형 변수를 선언하고 Calendar 인스턴스?의 getIntance()메서드를 호출하고,
		//get()메서드에 매개변수로 Calendar인스턴스의 HOUR_OF_DAY를 대입한다?
		
		String ampm;	//문자열 타입의 변수를 선언
		
		ampm = hour < 12 ? "오전" : "오후";	//문자열 타입변수에 삼항연산자를 이용하여 값을 저장
		
		System.out.println("현재 시각은 "+ hour + " 시 이며 " + ampm +" 입니다.");	//출력
	}
}
