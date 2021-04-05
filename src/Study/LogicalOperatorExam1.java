package Study;

public class LogicalOperatorExam1 {
	public boolean isAgeDiscountable(int age) {	//매개변수로 정수값을 가지고 반환을 논리형으로 받는 메서드를 선언
		boolean isDiscount = false; //논리형 변수를 선언하고 false로 초기화 한다
		
		if(age<=19 || age>=60) {	//조건문 if의 조건식에 연산자를 이용하여 조건 작성
			isDiscount = true;		//조건이 true이면 변수를 true로 변경
		}
		else {
			isDiscount = false;		//else문으로 if조건이 false일때 변수를 false로 변경
		}
		
		return isDiscount;			//논리형 타입의 변수를 반환한다
	}
	
	public static void main(String [] args) {
		LogicalOperatorExam1 exam = new LogicalOperatorExam1();
		//LogicalOperatorExam1 타입의 참조변수 exam을 선언하고
		//LogicalOperatorExam1 클래스로부터 인스턴스를 생성하여 이 주소값을 참조변수에 저장한다
		
		exam.isAgeDiscountable(15);	//참조변수가 가리키는 주소의 LogicalOperatorExam1 인스턴스에 있는
		exam.isAgeDiscountable(62); //isAgeDiscountable 메서드를 호출하고 정수값을 매개변수로 넣는다
	}
}
