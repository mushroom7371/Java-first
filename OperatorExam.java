package JavaStudy;

public class OperatorExam {
	public int [] calculate() {	//int타입의 배열 calculate를 선언하고 초기화블럭으로 초기화
		int a = 7; //정수형 int 타입의 변수 a를 선언하고 이에 값7을 입력함.
		int b = 3;
		
		int c = a + b;	//연산자를 이용한 사칙연산
		int d = a - b;
		int e = a * b;
		int f = a % b;	//%는 나머지 연산자로 a를 b로 나눈 나머지를 반환함
		
		System.out.println(c); //출력
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		int [] rat = {c,d,e,f};	//int 타입의 배열에 c,d,e,f를 저장하고 참조변수 rat에 이 배열의 주소값을 저장
		
		return rat;	//	rat을 반환한다.
		
	}
	
	public static void main(String [] args) {
		new OperatorExam().calculate();	//new를 통하여 인스턴스를 생성하고 인스턴스 속의 메서드를 호출한다.
	}
}
