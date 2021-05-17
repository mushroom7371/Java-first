package Thread;

class ThreadEx12 {
	public static void main(String args[]) {
		ThreadEx12_1 th1 = new ThreadEx12_1();	//������ Ŭ������ ���� ��ü�� �����Ͽ� Ÿ�Կ� �´� ���������� �ּҰ��� �����Ѵ�.
		ThreadEx12_2 th2 = new ThreadEx12_2();

		th1.start();	//th1�� start()�޼��� ȣ�� run()�޼��尡 ����ȴ�.
		th2.start();	//th2�� start()�޼��� ȣ�� run()�޼��尡 ����ȴ�.

		try {	//���ܰ� �߻��Ҹ��� �κп� try catch �������� ������.
			th1.sleep(2000);	//�����ð� ���� �����带 ���߰� �ϴ� �޼��带 ȣ���Ѵ�. ()�� ���� 1/1000���̸� 2000�� ���� ��������Ƿ� 2�ʰ� �ȴ�.
		} catch(InterruptedException e) {}

		System.out.print("<<main ����>>");	//���������� main �޼��尡 ����ȴ�.
		//����� ���� th1.sleep()�޼���� ���Ͽ� ������ th1�� ���� �ʰ� ���� �Ǿ�� �ϳ� ���� ���� ����Ȱ��� Ȯ�� �� ���ִ�.
		//sleep() �޼���� �׻� ���� �������� �����忡 ���Ͽ� �۵��ϱ� ������ ������ ���� �޴� ���� main �޼��带 �����ϴ� main�������̱� ������ Thread.sleep() �� ���� �������� ����Ͽ��� �Ѵ�.
	} // main
}

class ThreadEx12_1 extends Thread {	//Thread Ŭ������ ��ӹ��� ThreadEx12_1 Ŭ������ �����Ѵ�.
	public void run() {	//Thread Ŭ������ �޼��带 �������̵� �Ͽ���.
		for(int i=0; i < 300; i++) {	//�ܼ� �ݺ� ����� ���� ������ ���� Ȯ�ο� �޼���
			System.out.print("-");
		}
		System.out.print("<<th1 ����>>");
	} // run()
}

class ThreadEx12_2 extends Thread {	//Thread Ŭ������ ��ӹ��� ThreadEx12_2 Ŭ������ �����Ѵ�.
	public void run() {	//Thread Ŭ������ �޼��带 �������̵� �Ͽ���.
		for(int i=0; i < 300; i++) {	//�ܼ� �ݺ� ����� ���� ������ ���� Ȯ�ο� �޼���
			System.out.print("|");
		}
		System.out.print("<<th2 ����>>");
	} // run()
}
