package Thread;

class ThreadEx15 {
	public static void main(String args[]) {
		RunImplEx15 r = new RunImplEx15();
		//�Ʒ��� ������ Ŭ���� Ÿ���� ���������� �����ϰ� ���⿡ Ŭ�����κ��� ���ο� ��ü�� ������ ���� �ּҰ��� �����Ѵ�.
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		//Thread Ÿ���� ���������� ���� �����ϰ� ���⿡ ��ü�� �����Ͽ� �ּҰ��� �����ϴµ�,
		//run()�޼��带 ȣ���� ��ü(target)�� r�� ������ ���� ������ �̸�(���ڿ�)�� �����Ѵ�.
		

		th1.start();
		th2.start();
		th3.start();
		//Thread ����

		try {
			Thread.sleep(2000);
			th1.suspend();	// ������ th1�� ��� �ߴܽ�Ų��.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();	// ������ th1�� �ٽ� �����ϵ��� �Ѵ�.
			Thread.sleep(3000);
			th1.stop();		// ������ th1�� ���������Ų��.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	} // main
}

class RunImplEx15 implements Runnable {	//Runnable �������̽��� �����ϴ� Ŭ���� �ۼ�
	public void run() {	//�߻�޼��带 �����Ͽ� �ϼ��Ѵ�.
		while(true) {	//�׻� ����ǵ��� ��
			System.out.println(Thread.currentThread().getName());
			//���� �������� �̸��� ���Ϲް� �̸� ����Ѵ�.
			try {
				Thread.sleep(1000);	//�����带 ������Ų��.
			} catch(InterruptedException e) {}
		}
	} // run()
}
