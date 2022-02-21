package ch07;

interface MyInterface{
	//default 메서드 작성 추상메서드와는 다르게 몸통{}을 같이 선언해 준다.
	//접근제한자는 public이나 생략 가능하다.
	//default 메서드 작성이유는 완성된 인터페이스에서 추상메서드를 추가할 시 이를 구현한 모든 클래스에서 추상메서드를 구현해야 되기 때문에
	//이를 방지하고자 만들어 졌다. 추상메서드가 아니므로 인터페이스를 구현한 클래스를 변경하지 않아도 된다.
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	//static 메서드 또한 접근제한자는 public 이나 생략가능하다.
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Parent1{
	//method2() 메서드는 위의 인터페이스와 무관한 부모클래스의 메서드이다.
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

class Child1 extends Parent1 implements MyInterface, MyInterface2{
	//Parent1 클래스를 상속받고 두개의 인터페이스를 구현하였다.
	//method1() 메서드는 인터페이스에 정의되어 있지만, 오버라이드 한 것이므로 객체 생성후 메서드 호출시 아래와 같은 출력 메시지가 출력된다.
	public void method1() {
		System.out.println("method1() in Child");
	}
}

public class DefaultMethodTest {
	public static void main(String [] args) {
		Child1 c = new Child1();
		c.method1();
		//c 가 가리키는 객체에서 인터페이스를 구현하였고 추상메서드인 method1() 메서드를 오버라이딩 하여 해당 내용이 출력된다.
		c.method2();
		//c 가 가리키는 객체에서 부모 클래스로 부터 상속받은 메서드를 호출하게 된다.
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		//인터페이스를 구현을 하지 않았음에도 불구하고(객체생성이 안되었다.) static으로 선언된 메서드가 호출되어 해당 내용이 출력된다.
	}
}
