package Thread;

public class ThreadEx5 {
	
	static long startTime = 0;	//static ���� ���Ͽ� �޸𸮿� Ŭ������ ����ɶ� �����Ǵ� long Ÿ�� ������ �����ϰ� 0���� �ʱ�ȭ

	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		//ThreadEx5_1 Ÿ���� �������� th1�� �����ϰ� ThreadEx5_1 Ŭ������ ���� ��ü�� �����Ͽ� �� �ּҰ��� ���������� ������
		th1.start();
		//th1 �����带 ������.
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("�ҿ�ð� : " + (System.currentTimeMillis() - ThreadEx5.startTime));
		//th1 �����尡 ����Ǹ鼭 ���� main �޼����� for���� �ݺ��� �� �ΰ��� �����尡 �۾��� ������ ����
	}

}

class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("�ҿ�ð�2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
	}
}
