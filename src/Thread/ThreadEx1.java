package Thread;

public class ThreadEx1 {
	//������ �������2������ ���� ����. ThreadŬ���� ��� or Runnable �������̽� ����

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		//Thread�� �ڼ�Ŭ������ ThreadEx1_1 Ÿ���� �������� t1�� �����ϰ� ���� ThreadEx1_1 ��ü�� �����Ͽ� �ּҰ��� ����.
		
		Runnable r = new ThreadEx1_2();
		//Runnable Ÿ���� �������� r�� �����ϰ� Runnable �������̽��� ������ ThreadEx1_2 Ŭ������ ���� �ν��Ͻ��� �����Ͽ� �� �ּҰ��� ������.
		Thread t2 = new Thread(r);
		//ThreadŸ���� �������� t2�� �����ϰ� ThreadŬ������ ���� �Ű������� r�� �޴� �ν��Ͻ��� �����Ͽ� �ּҰ��� �����Ѵ�.
		
		t1.start();	//�����带 �������� �����ϴ� start() ȣ��
		t2.start();
		
		t1 = new ThreadEx1_1();
		t1.start();	//�ѹ� ����� ������� �ٽ� ���� �� �� ���⶧���� �ٷ� ���ٿ��� �������� t1�� ���� ��ü�� �����Ͽ� �����Ͽ���.

	}

}

class ThreadEx1_1 extends Thread{ //Thread Ŭ������ ��ӹ��� ThreadEx1_1 Ŭ���� ����
	public void run() {	//��ȯ Ÿ���� ���� run �޼��带 ����
		for(int i = 0; i < 5; i++) {	//0~4���� 1�� ������Ű�� �ݺ�
			System.out.println(getName());	//����Ŭ������ ���ǵǾ� �ִ� getName()�޼��带 ȣ���Ѵ�.
		}
	}
}

class ThreadEx1_2 implements Runnable{	//�������̽� Runnable(�߻�Ŭ����)�� ������ ThreadEx1_2 Ŭ���� ����
	public void run() {	//Runnable���� run()�޼��常 ���ǵǾ� ������ �̸� �������̵� �Ͽ� �����ؾ� �ȴ�.
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			//ThreadŬ������ ��ӹ޴°Ͱ� �ٸ��� �������̽� Runnable���� run()�޼��常 �����Ƿ� ���������� �Ұ����ϴ�.
			//���� �������� Thread�� ��ȯ�ϴ� Thread.currentThread()�޼��带 ���ؼ� getName()�޼��带 ȣ���ؾߵȴ�.
		}
	}
}
