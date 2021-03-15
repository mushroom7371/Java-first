package ch07;

public class CastingTest1 {
	public static void main(String [] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		car = fe;		// Car타입의 참조변수가 자손 타입의 참조변수를 가리킬 수있음. (형변환 생략가능)
		// car.water(); 오류!! 자손타입의 참조변수를 가리키나 Car 타입에는 water 메서드가 없어서 사용불가.
		fe2 = (FireEngine)car; //FireEngine 타입의 fe2가 car가 가리키는 곳에 fe가 있음.
		fe2.water(); // fe2 가 가리키는 곳의 인스턴스에 water 메서드가 있으므로 사용 가능.
	}
}
	class Car{
		String color;
		int door;
		
		void dive() {
			System.out.println("운전 기능");
		}
		
		void stop() {
			System.out.println("멈추는 기능");
		}
	}

	class FireEngine extends Car{
		void water() {
			System.out.println("물 뿌리는 기능");
		}
	}
