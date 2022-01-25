package Thread;

public class ThreadEx5 {
	
	static long startTime = 0;	//static 으로 인하여 메모리에 클래스에 적재될때 생성되는 long 타입 변수를 선언하고 0으로 초기화

	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		//ThreadEx5_1 타입의 참조변수 th1을 선언하고 ThreadEx5_1 클래스로 부터 객체를 생성하여 그 주소값을 참조변수에 저장함
		th1.start();
		//th1 쓰레드를 실행함.
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.print("소요시간 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
		//th1 쓰레드가 실행되면서 같이 main 메서드의 for문을 반복함 즉 두개의 쓰레드가 작업을 나누어 실행
	}

}

class ThreadEx5_1 extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
	}
}
