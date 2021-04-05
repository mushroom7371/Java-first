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

interface Repairable {}	//유닛 수리를 위한 인터페이스 정의

class Unit{	// 모든 유닛의 공통 된 변수를 가지고 있는 클래스
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
}

class GroundUnit extends Unit{	//그라운드 유닛을 위한 클래스 유닛을 상속받는다
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{	//에어 유닛을 위한 클래스
	AirUnit(int hp){
		super(hp);	//여기서의 super 는 Uint 클래스를 의미함
	}
}

class Tank extends GroundUnit implements Repairable{	//Tank 클래스는 Unit을 상속받은 GroundUint 을 상속 받으며 수리를 위한 인터페이스를 가짐
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
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

class DropShip extends AirUnit implements Repairable{
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
	
	void repair(Repairable r) { //수리를 위한 repair 메서드
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}

