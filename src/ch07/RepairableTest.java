package ch07;

public class RepairableTest {
	public static void main(String [] agrs) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		
		Marine marine = new Marine();
		Scv scv = new Scv();
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine); 마린은 repairable 인터페이스를 구현하고 있지 않기에 불가능
		
	}
}

interface Repairable {}	//유닛 수리 기능을 추가하기 위한 인터페이스 정의 아무 내용없다.

class Unit{	// 모든 유닛의 공통 된 변수를 가지고 있는 클래스
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){	//생성자를 통하여 매개변수 전달시 상수로 선언한 MAX_HP 변수의 값을 지정한다.
		MAX_HP = hp;
	}
	
}

class GroundUnit extends Unit{	//그라운드 유닛을 위한 클래스 유닛을 상속받는다
	GroundUnit(int hp){	//마찬가지로 생성자를 통하여 매개변수를 전달해 주면,
		super(hp);	//부모클래스의 생성자에 이 매개변수를 전달하여 MAX_HP를 설정한다.
	}
}

class AirUnit extends Unit{	//에어 유닛을 위한 클래스
	AirUnit(int hp){
		super(hp);	//여기서의 super 는 Uint 클래스를 의미함
	}
}

class Tank extends GroundUnit implements Repairable{	//Tank 클래스는 Unit을 상속받은 GroundUint 을 상속 받으며 수리를 위한 인터페이스를 구현한다.
	Tank(){	//매개변수가 없는 생성자를 통하여
		super(150);	//부모클래스의 생성자에 매개변수 값을 전달하고, 이를 통해 MAX_HP가 설정되고 hitPoint 변수 또한 같은 값이 저장된다.
		hitPoint = MAX_HP;
	}
	public String toString() {	//Object 클래스의 toString()메서드를 오버라이딩하여 출력에 사용한다.
		return "Tank";
	}
}

class Marine extends GroundUnit{	//Marine 클래스는 Tank 클래스와 같으나 인터페이스를 가지지 않으므로 수리가 불가능하다
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}

class DropShip extends AirUnit implements Repairable{	//Tank 클래스와 마찬가지로 인터페이스를 구현한 클래스
	DropShip(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
}

class Scv extends GroundUnit implements Repairable{
	Scv(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { //수리를 하기위한 메서드를 정의하였으며 매개변수로는 인터페이스 타입을 받는다.
		if(r instanceof Unit) {	//매개변수로 받은 참조변수가 가리키는 인스턴스가 Unit클래스와 자식-부모관계라면
			Unit u = (Unit)r;	//참조변수의 형변환을 통하여 Unit 타입의 참조변수 u가 Repairable 인터페이스를 구현한 인스턴스를 가리키게 된다.
			while(u.hitPoint != u.MAX_HP) {	//반복 횟수를 모를때 주로 사용하는 while문을 통하여 조건이 만족할때까지 체력을 증가시킨다.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}

