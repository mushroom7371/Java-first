package Study;

public class OperatorExam {
	public boolean[] calculate(int a, int b) {	
		//범위가 넓은 접근제어자 public을 사용하여 논리형 타입의 배열을 반환값으로 가지는
		//메서드 calculate를 선언 calculate는 정수형 타입의 매개변수 두개를 가진다.
		
		boolean c = a > b;	//논리형 타입 변수 c를 선언하고 비교연산자로 매개변수를 비교
		
		boolean d = a == b;
		
		boolean e = a != b;
		
		boolean ret[] = {c, d, e};	//논리형 타입의 배열 참조변수 ret을 선언하고 c,d,e의 주소값을 저장함
		
		return ret;	//메서드의 반환값이 참조변수 ret임
	}
	
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10);	//정수형 타입 변수a를 선언하고 0~1의 실수값을 반환하는 메서드
											//10을 곱하여 1~9로 범위를 설정하며 이를 정수형으로 형변환한다.
		int b = (int)(Math.random() * 10);
		
		new OperatorExam().calculate(a, b);	//클래스로 부터 인스턴스를 생성하고 인스턴의의 메서드를 호출한다.

	}

}
