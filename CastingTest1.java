package ch07;

public class CastingTest1 {
	public static void main(String [] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = fe;		// CarŸ���� ���������� �ڼ� Ÿ���� ���������� ����ų ������. (����ȯ ��������)
		// car.water(); ����!! �ڼ�Ÿ���� ���������� ����Ű�� Car Ÿ�Կ��� water �޼��尡 ��� ���Ұ�.
		fe2 = (FireEngine)car; //FireEngine Ÿ���� fe2�� car�� ����Ű�� ���� fe�� ����.
		fe2.water(); // fe2 �� ����Ű�� ���� �ν��Ͻ��� water �޼��尡 �����Ƿ� ��� ����.
	}
}
	class Car{
		String color;
		int door;
		
		void dive() {
			System.out.println("���� ���");
		}
		
		void stop() {
			System.out.println("���ߴ� ���");
		}
	}

	class FireEngine extends Car{
		void water() {
			System.out.println("�� �Ѹ��� ���");
		}
	}
