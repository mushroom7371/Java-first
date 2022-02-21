package ch07;

class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner ii = new InstanceInner();
	static StaticInner cv = new StaticInner();
	//인스턴스 멤버 간에는 서로 직접 접근이 가능
	//static 멤버 간에는 서로 직접 접근이 가능
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner();
		//static 멤버에서는 인스턴스 멤버에 접근이 불가능하다. static으로 선언된 멤버는 클래스가 메모리에 적재될때 생성되지만
		//인스턴스 멤버는 인스턴스가 생성이 되고 나서야 사용가능하기 때문이다.
		StaticInner obj2 = new StaticInner();
		
		//만약 접근하고 싶다면 인스턴스 멤버를 사용하기 위해 객체를 생성한 다음 접근해야된다.
		InnerEx2 ie = new InnerEx2();
		InstanceInner obj3 = ie.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//인스턴스 메서드에서는 인스턴스멤버, static 멤버 둘다 사용가능하다.
		//인스턴스 메서드를 사용할 수 있다는 것은 이미 객체가 만들어져있기 때문에 해당 객체가 존재하므로 인스턴스멤버에 접근 할 수 있는 것이다.
		//LocalInner obj3 = new LocalInner(); 당연하게도 타 메서드에서 선언된 내부 클래스는 선언이 불가능하다.
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner obj1 = new LocalInner();
	}
	
}
