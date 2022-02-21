package JavaStudy;

public class DuckExam {
	
	public static void main(String [] args) {
		Duck duck = new Duck();
		//앞서 만든 추상클래스인 Bird를 상속받는 Duck 클래스를 인스턴스화 시켜 객채를 만든다.
		duck.sing();
		//Duck 클래스에는 추상메서드를 완성한 sing 메서드가 있으므로 이를 구현 할 수있다.
		duck.fly();
		//또한 부모클래스인 Bird에서 선언한 fly는 당연히 구현 할 수 있다.
		
	}	
}
