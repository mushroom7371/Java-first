package AlgorithmStudy;

class Id {
	private static int counter = 0;		// ���̵� �� �� �ο��ߴ��� ����, static ������ Ŭ������ �޸𸮿� ����ɶ� ���� �ѹ� �����Ǹ� �ν��Ͻ��� ������� ȣ�� �����ϴ�.
	private int id;						// ���̵�

	// �����ڸ� ���� ������ Ŭ���� ������ �ν��Ͻ� ������ �����Ѵ�.
	public Id(){
		id = ++counter;
	}

	// ���̵� ��ȯ�ϴ� �ν���Ʈ �޼���
	public int getId() {
		return id; 
	}

	// counter�� ��ȯ�ϴ� Ŭ���� �޼���, ���������� ��ü�� �������� ��밡���ϴ�.
	public static int getCounter() {
		return counter;
	}
}

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id();		// ���̵� 1
		Id b = new Id();		// ���̵� 2
		//�������� a, b�� ���� IdŬ������ ���� ������ �ν��Ͻ��� �ּҸ� �������, ���̵� ������ ���� ������ �ʱ�ȭ ���� �ʰ� �þ��

		System.out.println("a�� ���̵�" + a.getId());
		System.out.println("b�� ���̵�" + b.getId());

		System.out.println("�ο��� ���̵��� ���� : " + Id.getCounter());
	}
}
