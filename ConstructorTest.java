package Practice;

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2(int x){
		value = x;
	}	//�̹� �����ڰ� ���� �Ǿ� ���� �׷��� �ν��Ͻ� ������ �Է� �ʿ�
	//Data2(){} �̿� ���� �߰��� �����ڸ� ���� �ص� ��
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		// Data2 d2 = new Data2(); Data2 Ŭ�������� �����ڰ� �̹� ���� �Ǿ��־ ��������
		Data2 d3 = new Data2(10); // �̿� ���� �ν��Ͻ� ���� �� �����ڸ� �Է��ؾߵ�
		
		System.out.println(d1.value);
		System.out.println(d3.value);

	}

}
