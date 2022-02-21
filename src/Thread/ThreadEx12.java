package Thread;

class ThreadEx12 {
	public static void main(String args[]) {
		ThreadEx12_1 th1 = new ThreadEx12_1();	//각각의 클래스로 부터 객체를 생성하여 타입에 맞는 참조변수에 주소값을 저장한다.
		ThreadEx12_2 th2 = new ThreadEx12_2();

		th1.start();	//th1의 start()메서드 호출 run()메서드가 실행된다.
		th2.start();	//th2의 start()메서드 호출 run()메서드가 실행된다.

		try {	//예외가 발생할만한 부분에 try catch 문장으로 묶었다.
			th1.sleep(2000);	//일정시간 동안 쓰레드를 멈추게 하는 메서드를 호출한다. ()의 수는 1/1000초이며 2000의 값이 들어있으므로 2초가 된다.
		} catch(InterruptedException e) {}

		System.out.print("<<main 종료>>");	//마지막으로 main 메서드가 종료된다.
		//결과를 보면 th1.sleep()메서드로 인하여 쓰레드 th1이 가장 늦게 종료 되어야 하나 가장 먼저 종료된것을 확인 할 수있다.
		//sleep() 메서드는 항상 현재 실행중인 쓰레드에 대하여 작동하기 때문에 실제로 영향 받는 것은 main 메서드를 실행하는 main쓰레드이기 때문에 Thread.sleep() 과 같은 형식으로 사용하여야 한다.
	} // main
}

class ThreadEx12_1 extends Thread {	//Thread 클래스를 상속받은 ThreadEx12_1 클래스를 선언한다.
	public void run() {	//Thread 클래스의 메서드를 오버라이딩 하였다.
		for(int i=0; i < 300; i++) {	//단순 반복 출력을 통한 쓰레드 실행 확인용 메서드
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx12_2 extends Thread {	//Thread 클래스를 상속받은 ThreadEx12_2 클래스를 선언한다.
	public void run() {	//Thread 클래스의 메서드를 오버라이딩 하였다.
		for(int i=0; i < 300; i++) {	//단순 반복 출력을 통한 쓰레드 실행 확인용 메서드
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	} // run()
}
