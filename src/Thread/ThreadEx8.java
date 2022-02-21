package Thread;

class ThreadEx8 {
	public static void main(String args[]) {
		ThreadEx8_1 th1 = new ThreadEx8_1();	//ThreadEx8_1클래스로 부터 객체를 생성한 후 ThreadEx8_1 타입의 참조변수 th1에 주소값을 저장함
		ThreadEx8_2 th2 = new ThreadEx8_2();	//ThreadEx8_2클래스로 부터 객체를 생성한 후 ThreadEx8_2 타입의 참조변수 th1에 주소값을 저장함

		th2.setPriority(7);	//th2가 가리키는 인스턴스의 우선순위를 1~10까지 중 7로 설정한다.

		System.out.println("Priority of th1(-) : " + th1.getPriority() );	//setPriority() 메서드를 설정하지 않을시 기본값으로 5를 가진다.
		System.out.println("Priority of th2(|) : " + th2.getPriority() );
		th1.start();
		th2.start();	//우선 순위가 낮기때문에 th2.start()가 더 많은 작업시간을 가지게 된다.
	}
}

class ThreadEx8_1 extends Thread {	//Thread 클래스를 상속받는 ThreadEx8_1을 생성
	public void run() {	//Thread 클래스의 run()메서드를 오버라이딩 하였다
		for(int i=0; i < 300; i++) {
			System.out.print("-");	//반복 출력문
			for(int x=0; x < 10000000; x++);	//작업시간을 지연시키기위한 for문
		}
	}
}

class ThreadEx8_2 extends Thread {	//Thread 클래스를 상속받는 ThreadEx8_2을 생성
	public void run() {	//Thread 클래스의 run()메서드를 오버라이딩 하였다
		for(int i=0; i < 300; i++) {
			System.out.print("|");	//반복 출력문
			for(int x=0; x < 10000000; x++);	//작업시간을 지연시키기위한 for문
		}
	}
}