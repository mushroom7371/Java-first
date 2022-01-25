package ch07;

class InnerEx3 {
	private int iv = 100;
	static int cv = 200;
	
	class InstanceInner{
		int iiv1 = iv;
		int iiv2 = cv;
		//내부 클래스에서는 외부클래스의 변수인 인스턴스 변수와 static 변수 둘다 참조가 가능하다. 내부클래스를 사용하기 위해서는 이미 외부클래스의 객체가 생성되기 때문
	}
	
	static class StaticInner{
		//int iiv1 = iv; 내부 static 클래스에서는 인스턴스 변수를 사용할 수 없다. static으로 선언된 시점에는 인스턴스가 생성되지 않은 경우가 있을 수 있기 때문
		static int iiv2 = cv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{	//지역 클래스는 변수에 대한 제한이 없이 사용가능하나 내부 메서드에서 정의된 지역변수는 상수만 접근 가능하다.
			int liv = iv;
			int lcv = cv;
			int liv2 = LV;
		}
		
	}
}
