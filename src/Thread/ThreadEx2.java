package Thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		ThreadEx2_1 t1 = new ThreadEx2_1();	//�ؿ��� ������ ThreadEx2_1Ŭ������ ���� ��ü�� �����Ͽ� ThreadEx2_1Ÿ���� �������� t1�� �ּҰ��� �����Ѵ�.
		t1.start();	//ThreadŬ������ ��ӹ޾ұ⿡ Thread�� start()�޼��带 ���Ͽ� ���Ƿ� �߻���Ų ������ ȣ�⽺���� ����Ѵ�.
					//ȣ�⽺���� �� ù ���� �޼��尡 main�޼��尡 �ƴ� run()�޼����̰� �� ���� throwException()�޼��尡 ȣ��ȴ�.
	}

}

class ThreadEx2_1 extends Thread{	//Thread Ŭ������ ��ӹ��� ThreadEx2_1 Ŭ������ �����Ѵ�.
	public void run() {	//Thread Ŭ������ run()�޼��带 �������̵��Ͽ� ������ �Ѵ�.
		throwException();	//throwException()�޼��带 ȣ��
	}
	
	public void throwException() {	//��ȯ���� ���� throwException()�޼��带 �����Ѵ�.
		try {	//����ó���� �� try���� 
			throw new Exception();	//Exception() ��ü�� �����Ͽ� throw�Ѵ�. ���Ƿ� ���� �߻�
		}catch(Exception e){	//���ܰ� �߻��Ѵٸ� catch() �޼��忡 Exception Ÿ���� �Ű����� e�� �����ϰ�
			e.printStackTrace();	//�Ű������� �������� e�� ����Ű�� ��ü�� printStackTrace()�޼��带 ���Ͽ� ���������� ����Ѵ�.
		}
	}
}
