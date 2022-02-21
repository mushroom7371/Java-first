package Study;

public class LogicalOperatorExam {
	public boolean isAgeTwenties(int age) { //논리형 값을 반환받고 매개변수로 정수형 값을 가지는 메서드를 선언
		boolean isTwenties = false;			//논리형 변수를 선언하고 초기화한다 이때 변수는 지역변수
		
		if( age >= 20 && age < 30) {		//조건문의 조건식에 연산자를 이용하여 매개변수의 조건을 입력한다
			isTwenties = true;				//조건이 참일때 변수를 true로 변경
		}
		else {								//조건이 참이 아닐때
			isTwenties = false;				//변수를 false로 변경
		}
			
		return isTwenties;					//if문의 결과로 변수에 저장된 값을 메서드의 반환값으로 반환
	}
	
	public static void main(String [] args) {
		LogicalOperatorExam exam = new LogicalOperatorExam();	//클래스로 부터 인스턴스를 생성하고 주소값을 참조변수에 저장
		
		exam.isAgeTwenties(29);	//생성된 인스턴스의 메서드를 호출하고 매개변수에 값을 입력
		exam.isAgeTwenties(30);
		
	}
}
