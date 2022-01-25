package JavaStudy;

import java.util.Scanner;	//java.util 에 있는 Scanner를 import 하겠다

public class DoWhileExam {
	public static void main(String [] args) {
		
		int value = 0;	//정수 타입의 변수를 선언하고 초기화
		Scanner scan = new Scanner(System.in);
		// Scanner 타입의 참조변수 scan을 선언하고 여기에는 주소값이 저장된다.
		// 그 주소값은 new로 인하여 Scanner 클래스로 부터 생성된 인스턴스의 주소값이다.
		// 새로 생긴 인스턴스에는 키보드로 부터 값을 입력받는 기능이 있다.
		
		do { //한번은 실행되는 부분
			value = scan.nextInt();	// 변수 value 에 scan이 가리키는 인스턴스의 nextInt() 메서드를 호출하고 저장한다
			System.out.println(value);	//출력
		}while(value != 10);
		//while은 조건이 true 일때 계속 반복하므로 'value가 10이 아니다' 가 참인경우
		//즉 10이 아니면 계속 do로 올라가고, 'value가 10이 아니다'가 거짓인 경우
		//즉 10이면 중단하게 된다.
		
		System.out.println("반복문 종료");
	}
}
