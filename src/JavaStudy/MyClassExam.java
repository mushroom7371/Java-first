package JavaStudy;

public class MyClassExam {
	public static void main(String args []) {
		MyClass mc = new MyClass();
		//MyClass Ŭ������ ���� �ν��Ͻ��� ���� �����ϰ� MyClass Ÿ���� �������� mc�� �ν��Ͻ��� �ּҰ��� �����Ѵ�
		
		mc.method1();
		//mc�� ����Ű�� �ν��Ͻ��� �޼��� method1()�� ȣ���Ͽ� ���� ������ ���ϰ��� ����
		
		mc.method2(10);
		//method2()�� �����ϵ� �޼����� ����� �Ű������� int Ÿ���� ���� �־��ֱ�� �Ͽ��⿡ ���� �Է���
		
		int value = mc.method3();
		System.out.println(value);
		//method3()�� �����ϵ� �Űܺ��� ���� ������ ���ϰ��� ���� �ϱ⿡ �̸� ����� ������ �ʿ���
		//int Ÿ�� ���� value�� �����ϰ� �޼����� ���ϰ��� �����Ͽ� �����
		
		int value2 = mc.method4(5, 10);
		System.out.println(value2);
		//mothod4()�� �����ϵ� �Űܺ����� 2�� �̰� �Ű������� ���� �����ϴ� ����� �����Ƿ�
		// ���� Ÿ���� ������ �����ϰ� ���⿡ ���ϰ��� ������
		
	}
}
