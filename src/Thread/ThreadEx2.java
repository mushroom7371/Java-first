package Thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		ThreadEx2_1 t1 = new ThreadEx2_1();	//밑에서 정의한 ThreadEx2_1클래스로 부터 객체를 생성하여 ThreadEx2_1타입의 참조변수 t1에 주소값을 저장한다.
		t1.start();	//Thread클래스를 상속받았기에 Thread의 start()메서드를 통하여 고의로 발생시킨 예외의 호출스택을 출력한다.
					//호출스택의 맨 첫 번재 메서드가 main메서드가 아닌 run()메서드이고 그 위로 throwException()메서드가 호출된다.
	}

}

class ThreadEx2_1 extends Thread{	//Thread 클래스를 상속받은 ThreadEx2_1 클래스를 선언한다.
	public void run() {	//Thread 클래스의 run()메서드를 오버라이딩하여 재정의 한다.
		throwException();	//throwException()메서드를 호출
	}
	
	public void throwException() {	//반환값이 없는 throwException()메서드를 선언한다.
		try {	//예외처리를 한 try문장 
			throw new Exception();	//Exception() 객체를 생성하여 throw한다. 고의로 예외 발생
		}catch(Exception e){	//예외가 발생한다면 catch() 메서드에 Exception 타입의 매개변수 e를 대입하고
			e.printStackTrace();	//매개변수인 참조변수 e가 가리키는 객체의 printStackTrace()메서드를 통하여 오류내용을 출력한다.
		}
	}
}
