package ch07;

class InnerEx3 {
	private int iv = 100;
	static int cv = 200;
	
	class InstanceInner{
		int iiv1 = iv;
		int iiv2 = cv;
		//���� Ŭ���������� �ܺ�Ŭ������ ������ �ν��Ͻ� ������ static ���� �Ѵ� ������ �����ϴ�. ����Ŭ������ ����ϱ� ���ؼ��� �̹� �ܺ�Ŭ������ ��ü�� �����Ǳ� ����
	}
	
	static class StaticInner{
		//int iiv1 = iv; ���� static Ŭ���������� �ν��Ͻ� ������ ����� �� ����. static���� ����� �������� �ν��Ͻ��� �������� ���� ��찡 ���� �� �ֱ� ����
		static int iiv2 = cv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{	//���� Ŭ������ ������ ���� ������ ���� ��밡���ϳ� ���� �޼��忡�� ���ǵ� ���������� ����� ���� �����ϴ�.
			int liv = iv;
			int lcv = cv;
			int liv2 = LV;
		}
		
	}
}
