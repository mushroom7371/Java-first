package ch07;

public class InterfaceTest {
	public static void main(String [] args) {
		A a = new A();
		a.autoPlay(new B());	//B의 메서드를 사용하기위해 객체를 생성해주어야됨
		a.autoPlay(new C());	//하지만 생성하고 메서드를 이용한 후 참조를 할 수 없어 가비지 컬렉터로 인하여 사라짐
								//두 메서드는 매개변수로 인터페이스를 구현한 클래스의 인스턴스를 받음으로써 메서드가 실행된다.
	}
}

class A {
	void autoPlay(I i) {	//인터페이스 I 타입의 참조변수 i를 매개변수로 가진다
							//매개변수를 통해서 인터페이스를 구현한 클래스의 인스턴스를 동적으로 제공 받아야 함
		i.play();
	}
}

interface I{	//인터페이스 정의
	public abstract void play(); //공통으로 사용할 추상메서드
}

class B implements I{
	public void play() {
		System.out.println("Play in B class"); //인터페이스 I를 구현한 B클래스에서 사용할 play 메서드, 오버라이딩 하였다.
	}
}

class C implements I{
	public void play() {
		System.out.println("Play in C class"); //인터페이스 I를 구현한 C클래스에서 사용할 play 메서드, 오버라이딩 하였다.
	}
}
