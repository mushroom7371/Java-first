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

interface Repairable {}	//���� ���� ����� �߰��ϱ� ���� �������̽� ���� �ƹ� �������.

class Unit{	// ��� ������ ���� �� ������ ������ �ִ� Ŭ����
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){	//�����ڸ� ���Ͽ� �Ű����� ���޽� ����� ������ MAX_HP ������ ���� �����Ѵ�.
		MAX_HP = hp;
	}
	
}

class GroundUnit extends Unit{	//�׶��� ������ ���� Ŭ���� ������ ��ӹ޴´�
	GroundUnit(int hp){	//���������� �����ڸ� ���Ͽ� �Ű������� ������ �ָ�,
		super(hp);	//�θ�Ŭ������ �����ڿ� �� �Ű������� �����Ͽ� MAX_HP�� �����Ѵ�.
	}
}

class AirUnit extends Unit{	//���� ������ ���� Ŭ����
	AirUnit(int hp){
		super(hp);	//���⼭�� super �� Uint Ŭ������ �ǹ���
	}
}

class Tank extends GroundUnit implements Repairable{	//Tank Ŭ������ Unit�� ��ӹ��� GroundUint �� ��� ������ ������ ���� �������̽��� �����Ѵ�.
	Tank(){	//�Ű������� ���� �����ڸ� ���Ͽ�
		super(150);	//�θ�Ŭ������ �����ڿ� �Ű����� ���� �����ϰ�, �̸� ���� MAX_HP�� �����ǰ� hitPoint ���� ���� ���� ���� ����ȴ�.
		hitPoint = MAX_HP;
	}
	public String toString() {	//Object Ŭ������ toString()�޼��带 �������̵��Ͽ� ��¿� ����Ѵ�.
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

class DropShip extends AirUnit implements Repairable{	//Tank Ŭ������ ���������� �������̽��� ������ Ŭ����
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
	
	void repair(Repairable r) { //������ �ϱ����� �޼��带 �����Ͽ����� �Ű������δ� �������̽� Ÿ���� �޴´�.
		if(r instanceof Unit) {	//�Ű������� ���� ���������� ����Ű�� �ν��Ͻ��� UnitŬ������ �ڽ�-�θ������
			Unit u = (Unit)r;	//���������� ����ȯ�� ���Ͽ� Unit Ÿ���� �������� u�� Repairable �������̽��� ������ �ν��Ͻ��� ����Ű�� �ȴ�.
			while(u.hitPoint != u.MAX_HP) {	//�ݺ� Ƚ���� �𸦶� �ַ� ����ϴ� while���� ���Ͽ� ������ �����Ҷ����� ü���� ������Ų��.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�.");
		}
	}
}

