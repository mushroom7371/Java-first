package Study;

public class ObjectEqualEx1 {
	public static void main(String [] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// 아래에 정의한 클래스로 부터 객체를 생성한다. 이때 객체 안의 변수는 각각 매개변수인 10으로 설정된다.
		
		if(v1.equals(v2)) {	//모든 클래스의 최고 조상인 Object 클래스의 equals 매서드를 통해 비교한다.
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		//비교 결과 v1과 v2는 서로 다른 객체이며 다른 주소값을 가지기 때문에 조건문의 결과로 다른 값이 출력된다.
		//이로 인하여 equals메서드는 디폴드로 객체의 주소값을 비교하는 것을 알 수 있다.
		
		v2 = v1;
		//참조변수 v2가 가리키는 주소를 v1이 가리키는 주소로 바꿨기 때문에 둘은 같은 객체를 가리킨다.
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
	}
	
}

class Value{
	int value;	//멤버변수로 선언
	
	Value(int value){	//생성자를 통하여 객체 생성시 변수 value의 값을 매개변수의 값으로 설정한다.
		this.value = value;
	}
}
