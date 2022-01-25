package ch07;

class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; 내부 클스에서는 static 변수를 선언할 수 없다.
		final static int CONST = 200;	//static이지만 상수이므로 사용 가능하다.
	}
	
	static class StaticInner{
		int iv = 100;
		static int cv = 200;	//static클래스만 static 변수를 선언 할 수 있다.
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 100;
			//static int cv = 200;	//마찬가지로 static 클래스가 아니므로 static 변수 사용이 불가능 하다.
			final static int CONST = 200; //상수이므로 static 사용이 가능하다.
		}
	}
}
