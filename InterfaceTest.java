package ch07;

public class InterfaceTest {
	public static void main(String [] args) {
		A a = new A();
		a.autoPlay(new B());	//B의 메서드를 사용하기위해 객체를 생성해주어야됨
		a.autoPlay(new C());
	}
}

class A {
	void autoPlay(I i) {	//인터페이스 I 타입의 i를 매개변수로 가진다
		i.play();
	}
}

interface I{	//인터페이스 정의
	public abstract void play(); //공통으로 사용할 추상메서드
}

class B implements I{
	public void play() {
		System.out.println("Play in B class"); //인터페이스 I를 구현한 B클래스에서 사용할 play 메서드
	}
}

class C implements I{
	public void play() {
		System.out.println("Play in C class"); //인터페이스 I를 구현한 C클래스에서 사용할 play 메서드
	}
}
