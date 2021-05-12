package Thread;

class ThreadEx8 {
	public static void main(String args[]) {
		ThreadEx8_1 th1 = new ThreadEx8_1();	//ThreadEx8_1Ŭ������ ���� ��ü�� ������ �� ThreadEx8_1 Ÿ���� �������� th1�� �ּҰ��� ������
		ThreadEx8_2 th2 = new ThreadEx8_2();	//ThreadEx8_2Ŭ������ ���� ��ü�� ������ �� ThreadEx8_2 Ÿ���� �������� th1�� �ּҰ��� ������

		th2.setPriority(7);	//th2�� ����Ű�� �ν��Ͻ��� �켱������ 1~10���� �� 7�� �����Ѵ�.

		System.out.println("Priority of th1(-) : " + th1.getPriority() );	//setPriority() �޼��带 �������� ������ �⺻������ 5�� ������.
		System.out.println("Priority of th2(|) : " + th2.getPriority() );
		th1.start();
		th2.start();	//�켱 ������ ���⶧���� th2.start()�� �� ���� �۾��ð��� ������ �ȴ�.
	}
}

class ThreadEx8_1 extends Thread {	//Thread Ŭ������ ��ӹ޴� ThreadEx8_1�� ����
	public void run() {	//Thread Ŭ������ run()�޼��带 �������̵� �Ͽ���
		for(int i=0; i < 300; i++) {
			System.out.print("-");	//�ݺ� ��¹�
			for(int x=0; x < 10000000; x++);	//�۾��ð��� ������Ű������ for��
		}
	}
}

class ThreadEx8_2 extends Thread {	//Thread Ŭ������ ��ӹ޴� ThreadEx8_2�� ����
	public void run() {	//Thread Ŭ������ run()�޼��带 �������̵� �Ͽ���
		for(int i=0; i < 300; i++) {
			System.out.print("|");	//�ݺ� ��¹�
			for(int x=0; x < 10000000; x++);	//�۾��ð��� ������Ű������ for��
		}
	}
}