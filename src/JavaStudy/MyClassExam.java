package JavaStudy;

public class MyClassExam {
	public static void main(String args []) {
		MyClass mc = new MyClass();
		//MyClass 클래스로 부터 인스턴스를 새로 생성하고 MyClass 타입의 참조변수 mc에 인스턴스의 주소값을 저장한다
		
		mc.method1();
		//mc가 가리키는 인스턴스의 메서드 method1()를 호출하여 실행 하지만 리턴값이 없다
		
		mc.method2(10);
		//method2()를 실행하되 메서드의 선언시 매개변수에 int 타입의 값을 넣어주기로 하였기에 값을 입력함
		
		int value = mc.method3();
		System.out.println(value);
		//method3()을 실행하되 매겨변수 값은 없으나 리턴값이 존재 하기에 이를 담아줄 변수가 필요함
		//int 타입 변수 value를 선언하고 메서드의 리턴값을 저장하여 출력함
		
		int value2 = mc.method4(5, 10);
		System.out.println(value2);
		//mothod4()를 실행하되 매겨변수가 2개 이고 매개변수의 합을 리턴하는 기능이 있으므로
		// 정수 타입의 변수를 선언하고 여기에 리턴값을 저장함
		
	}
}
