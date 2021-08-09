package ch07;

class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner ii = new InstanceInner();
	static StaticInner cv = new StaticInner();
	//�ν��Ͻ� ��� ������ ���� ���� ������ ����
	//static ��� ������ ���� ���� ������ ����
	
	static void staticMethod() {
		//InstanceInner obj1 = new InstanceInner();
		//static ��������� �ν��Ͻ� ����� ������ �Ұ����ϴ�. static���� ����� ����� Ŭ������ �޸𸮿� ����ɶ� ����������
		//�ν��Ͻ� ����� �ν��Ͻ��� ������ �ǰ� ������ ��밡���ϱ� �����̴�.
		StaticInner obj2 = new StaticInner();
		
		//���� �����ϰ� �ʹٸ� �ν��Ͻ� ����� ����ϱ� ���� ��ü�� ������ ���� �����ؾߵȴ�.
		InnerEx2 ie = new InnerEx2();
		InstanceInner obj3 = ie.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//�ν��Ͻ� �޼��忡���� �ν��Ͻ����, static ��� �Ѵ� ��밡���ϴ�.
		//�ν��Ͻ� �޼��带 ����� �� �ִٴ� ���� �̹� ��ü�� ��������ֱ� ������ �ش� ��ü�� �����ϹǷ� �ν��Ͻ������ ���� �� �� �ִ� ���̴�.
		//LocalInner obj3 = new LocalInner(); �翬�ϰԵ� Ÿ �޼��忡�� ����� ���� Ŭ������ ������ �Ұ����ϴ�.
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner obj1 = new LocalInner();
	}
	
}
