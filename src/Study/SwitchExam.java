package Study;

import java.util.Calendar;

public class SwitchExam {
	public static void main(String[] args) {
		// month에는 오늘이 몇 월인지 들어 있습니다.
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1; //월을 나타내는 기능 잘모름
		String season = "";	//문자열 타입의 참조변수 season을 선언하고 ""의 주소값을 저장함
		// switch문을 이용해서 season이 오늘은 어떤 계절인지 나타내게 만들어보세요.
		switch (month){	//스위치 문장에 위에서 받아온 정수형 변수를 매개변수로 입력하여 조건 비교
		case 1: case 2: case 12:	//1,2,12 일때
			season = "겨울";			//참조변수가 가리키는 곳에 문자 "겨울"을 입력
			break;					//조건이 만족하면 스위치 문을 빠져나간다 만족하는 조건이 없을시 아래로 내려감
			
		case 3: case 4: case 5:		//위와 같음
			season = "봄";
			break;
			
		case 6: case 7: case 8:		//위와 같음
			season = "여름";
			break;
			
		case 9: case 10: case 11:	//위와같음
			season = "가을";
			break;
			
		}

		System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
	}
}

