package ch07;

public class BindingTest {
	public static void main(String [] args) {
		Parent p = new Parent();
		Child c = new Child();

		System.out.println("p.x : " + p.x); // 참조변수 p는 Parent 클래스로 만든 인스턴스를 가리키기에 변수 x 의 값이 100이다. 
		p.method();
		
		System.out.println("c.x : " + c.x); // 참조변수 c는 Parent의 변수 100과 중복된 x 값이 있지만 자식클래스의 변수를 가리킨다.
		c.method(); //마찬가지로 중복된 메서드가 있지만 더 넓은 개념의 자삭클래스의 메서드가 실행된다.
	}
}

class Parent{
	int x = 100;	// 상속 관계인 child 와 변수이름이 같다.

	void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("child method");
	}
}