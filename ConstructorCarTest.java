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
		Car c1 = new Car();		// �ν��Ͻ� ���� �Ŀ� �ν��Ͻ� ������ ���� �ʱ�ȭ�� �ʿ���
		c1.color = "white";
		c1.geartype = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);	// �ν��Ͻ� ���� �� ���ϴ� ������ �ʱ�ȭ
		
		System.out.println("c1�� ������ " + c1.color + " ���Ÿ���� " +
							c1.geartype + " ���� ������ " + c1.door);
		System.out.println("c2�� ������ " + c2.color + " ���Ÿ���� " + 
							c2.geartype + " ���� ������ " + c2.door);

	}

}
