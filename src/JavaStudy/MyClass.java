package JavaStudy;

public class MyClass {
	
	public void method1() {
		System.out.println("method1�� �����");
		//�Ű������� ���ϰ��� ���� �޼���
	}
	
	public void method2(int x) {
		System.out.println( x + "�� �̿��ϴ� method2");
		//�Ű������� int Ÿ������ ������ ���ϰ��� ���� �޼���� �޼��� �տ� void �� ��
	}
	
	public int method3() {
		System.out.println("method3�� �����");
		//�Ű������� ������ ���ϰ��� �������� �޼���� �޼��� �̸� �տ� int �� ��
		
		return 10;
	}
	
	public int method4(int x, int y) {
		System.out.println(x +"�� " + y +"�� �̿��� method4");
		//�Ű������� int Ÿ������ 2�� ������ �����ο��� ���ϴ� ����� ������� �����ϴ� �޼���
		
		return x + y;
		
	}
}
