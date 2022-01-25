package Thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();	//t1.run()메서드 호출
		//쓰레드가 새로 생성되지 않았으며 단지 main쓰레드가 호출되고 그 위에 run()메서드를 호출하였다. run()메서드가 호출되면서 다시 throwException()메서드를 호출함
	}

}

class ThreadEx3_1 extends Thread{	//Thread 클래스를 상속받는 ThreadEx3_1 클래스 선언
	public void run() {	//부모클래스 Thread의 안의 반환값이 없는 run()메서드를 오버라이딩 하여 재정의함
		throwException();	//throwException()메서드를 호출
	}
	
	public void throwException() {	//반환값이 없는 throwException() 메서드 선언
		try {	//예외처리를 위해 try문을 작성함
			throw new Exception();	//Exception객체를 새로 생성하여 throw하였다.
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
