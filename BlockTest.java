package Practice;

class BlockTest{
	static {
		System.out.println("static { } Ŭ���� �ʱ�ȭ ��, ���α׷� ���۽� �ѹ� �����");
	}

	{
		System.out.println("{ } �ν��Ͻ� �ʱ�ȭ ��, �ν��Ͻ� ������ �����.");
	}
	
	public BlockTest() {
		System.out.println("������");
	}

	public static void main(String [] args) {
		// Ŭ���� �ʱ�ȭ ���� �ѹ� ����ȴ�.
		BlockTest bt1 = new BlockTest();	// �ν��Ͻ��� �����ǹǷ� �ν��Ͻ� �ʱ�ȭ ���� ����ȴ�.
		BlockTest bt2 = new BlockTest();
	}
}
