package ch07;

public class RepairableTest {
	public static void main(String [] agrs) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		
		Marine marine = new Marine();
		Scv scv = new Scv();
		
		scv.repair(tank);
		scv.repair(dropship);
		// scv.repair(marine); ������ repairable �������̽��� �����ϰ� ���� �ʱ⿡ �Ұ���
		
	}
}

interface Repairable {}	//���� ������ ���� �������̽� ����

class Unit{	// ��� ������ ���� �� ������ ������ �ִ� Ŭ����
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
}

class GroundUnit extends Unit{	//�׶��� ������ ���� Ŭ���� ������ ��ӹ޴´�
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{	//���� ������ ���� Ŭ����
	AirUnit(int hp){
		super(hp);	//���⼭�� super �� Uint Ŭ������ �ǹ���
	}
}

class Tank extends GroundUnit implements Repairable{	//Tank Ŭ������ Unit�� ��ӹ��� GroundUint �� ��� ������ ������ ���� �������̽��� ����
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class Marine extends GroundUnit{	//Marine Ŭ������ Tank Ŭ������ ������ �������̽��� ������ �����Ƿ� ������ �Ұ����ϴ�
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
	
	void repair(Repairable r) { //������ ���� repair �޼���
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
}

