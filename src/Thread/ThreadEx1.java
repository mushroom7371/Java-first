package Thread;

public class ThreadEx1 {
	//쓰레드 구현방법2가지에 대한 차이. Thread클래스 상속 or Runnable 인터페이스 구현

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		//Thread의 자손클래스인 ThreadEx1_1 타입의 참조변수 t1을 선언하고 새로 ThreadEx1_1 객체를 생성하여 주소값을 저장.
		
		Runnable r = new ThreadEx1_2();
		//Runnable 타입의 참조변수 r을 선언하고 Runnable 인터페이스를 구현한 ThreadEx1_2 클래스로 부터 인스턴스를 생성하여 그 주소값을 저장함.
		Thread t2 = new Thread(r);
		//Thread타입의 참조변수 t2를 선언하고 Thread클래스로 부터 매개변수로 r을 받는 인스턴스를 생성하여 주소값을 저장한다.
		
		t1.start();	//쓰레드를 생성한후 실행하는 start() 호출
		t2.start();
		
		t1 = new ThreadEx1_1();
		t1.start();	//한번 실행된 쓰레드는 다시 실행 할 수 없기때문에 바로 윗줄에서 참조변수 t1에 새로 객체를 생성하여 저장하였다.

	}

}

class ThreadEx1_1 extends Thread{ //Thread 클래스를 상속받은 ThreadEx1_1 클래스 선언
	public void run() {	//반환 타입이 없는 run 메서드를 정의
		for(int i = 0; i < 5; i++) {	//0~4까지 1씩 증가시키며 반복
			System.out.println(getName());	//조상클래스에 정의되어 있는 getName()메서드를 호출한다.
		}
	}
}

class ThreadEx1_2 implements Runnable{	//인터페이스 Runnable(추상클래스)를 구현한 ThreadEx1_2 클래스 선언
	public void run() {	//Runnable에는 run()메서드만 정의되어 있으며 이를 오버라이딩 하여 구현해야 된다.
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			//Thread클래스를 상속받는것과 다르게 인터페이스 Runnable에는 run()메서드만 있으므로 직접접근이 불가능하다.
			//현재 실행중인 Thread를 반환하는 Thread.currentThread()메서드를 통해서 getName()메서드를 호출해야된다.
		}
	}
}
