package Thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();	//t1.run()�޼��� ȣ��
		//�����尡 ���� �������� �ʾ����� ���� main�����尡 ȣ��ǰ� �� ���� run()�޼��带 ȣ���Ͽ���. run()�޼��尡 ȣ��Ǹ鼭 �ٽ� throwException()�޼��带 ȣ����
	}

}

class ThreadEx3_1 extends Thread{	//Thread Ŭ������ ��ӹ޴� ThreadEx3_1 Ŭ���� ����
	public void run() {	//�θ�Ŭ���� Thread�� ���� ��ȯ���� ���� run()�޼��带 �������̵� �Ͽ� ��������
		throwException();	//throwException()�޼��带 ȣ��
	}
	
	public void throwException() {	//��ȯ���� ���� throwException() �޼��� ����
		try {	//����ó���� ���� try���� �ۼ���
			throw new Exception();	//Exception��ü�� ���� �����Ͽ� throw�Ͽ���.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
