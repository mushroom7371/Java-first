package Practice;

class Car{
	String color;
	String geartype;
	int door;
	
	Car() {}
	Car(String c, String g, int d){
		color = c;
		geartype = g;
		door = d;
	}
}


public class ConstructorCarTest {
	public static void main(String[] args) {
		Car c1 = new Car();		// 인스턴스 생성 후에 인스턴스 변수를 따로 초기화가 필요함
		c1.color = "white";
		c1.geartype = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);	// 인스턴스 생성 시 원하는 값으로 초기화
		
		System.out.println("c1의 색상은 " + c1.color + " 기어타입은 " +
							c1.geartype + " 문의 개수는 " + c1.door);
		System.out.println("c2의 색상은 " + c2.color + " 기어타입은 " + 
							c2.geartype + " 문의 개수는 " + c2.door);

	}

}
