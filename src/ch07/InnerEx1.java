package ch07;

class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; ���� Ŭ�������� static ������ ������ �� ����.
		final static int CONST = 200;	//static������ ����̹Ƿ� ��� �����ϴ�.
	}
	
	static class StaticInner{
		int iv = 100;
		static int cv = 200;	//staticŬ������ static ������ ���� �� �� �ִ�.
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 100;
			//static int cv = 200;	//���������� static Ŭ������ �ƴϹǷ� static ���� ����� �Ұ��� �ϴ�.
			final static int CONST = 200; //����̹Ƿ� static ����� �����ϴ�.
		}
	}
}
