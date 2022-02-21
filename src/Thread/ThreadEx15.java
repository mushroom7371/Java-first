package Thread;

class ThreadEx15 {
	public static void main(String args[]) {
		RunImplEx15 r = new RunImplEx15();
		//아래에 정의한 클래스 타입의 참조변수를 선언하고 여기에 클래스로부터 새로운 객체를 생성한 다음 주소값을 저장한다.
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		//Thread 타입의 참조변수를 각각 선언하고 여기에 객체를 생성하여 주소값을 저장하는데,
		//run()메서드를 호출할 객체(target)를 r로 지정한 다음 지정된 이름(문자열)로 저장한다.
		

		th1.start();
		th2.start();
		th3.start();
		//Thread 시작

		try {
			Thread.sleep(2000);
			th1.suspend();	// 쓰레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();	// 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop();		// 쓰레드 th1을 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	} // main
}

class RunImplEx15 implements Runnable {	//Runnable 인터페이스를 구현하는 클래스 작성
	public void run() {	//추상메서드를 정의하여 완성한다.
		while(true) {	//항상 실행되도록 함
			System.out.println(Thread.currentThread().getName());
			//현재 쓰래드의 이름을 리턴받고 이를 출력한다.
			try {
				Thread.sleep(1000);	//쓰레드를 지연시킨다.
			} catch(InterruptedException e) {}
		}
	} // run()
}
