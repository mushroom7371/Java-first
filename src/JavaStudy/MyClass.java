package JavaStudy;

public class MyClass {
	
	public void method1() {
		System.out.println("method1이 실행됨");
		//매개변수와 리턴값이 없는 메서드
	}
	
	public void method2(int x) {
		System.out.println( x + "를 이용하는 method2");
		//매개변수는 int 타입으로 있으나 리턴값이 없는 메서드로 메서드 앞에 void 가 됨
	}
	
	public int method3() {
		System.out.println("method3이 실행됨");
		//매개변수가 없으나 리턴값이 정수형인 메서드로 메서드 이름 앞에 int 가 됨
		
		return 10;
	}
	
	public int method4(int x, int y) {
		System.out.println(x +"와 " + y +"를 이용한 method4");
		//매개변수가 int 타입으로 2개 있으며 구현부에서 더하는 기능의 결과값을 리턴하는 메서드
		
		return x + y;
		
	}
}
