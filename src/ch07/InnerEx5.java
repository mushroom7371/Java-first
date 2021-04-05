package ch07;

class Outer{
	
	int value = 10;	// Outer.this.value Outer 클래스의 멤버변수
	
	class Inner{
		int value = 20; //	this.value 내부 클래스인 Inner 클래스의 멤버변수
		
		void method1() {	//내부 클래스의 메서드
			int value = 30;
			System.out.println("value = " + value);
			System.out.println("this.value = " + this.value);
			System.out.println("Outer.this.value = " + Outer.this.value);
		}
	}
}

public class InnerEx5 {
	public static void main(String [] agrs) {
		Outer outer = new Outer();	//Outer 클래스로부터 인스턴스 생성
		Outer.Inner inner = outer.new Inner();	//Outer 클래스의 내부 클래스를 통한 인스턴스 생성
		
		inner.method1();	//내부 클래스의 메서드 호출
	}
}
