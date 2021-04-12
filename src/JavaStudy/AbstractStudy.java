package JavaStudy;

public class AbstractStudy {
	public static void main(String [] args) {
		attackSomething(new Knife());
		attackSomething(new Gun());
	}
	
	static void attackSomething(Weapon weapon) {
		//attackSomething �޼����� �Ű������� Weapon Ÿ���� ���������ν� Weapon Ŭ������ ����
		//�Ļ��� ��� Ŭ������ ��ü�� ����� �� �ְ� ��. Weapon Ŭ������ ��� �޾Ҵٴ� ���� �ν��Ͻ�ȭ �ɽ�
		//Weapon�� �ν��Ͻ� ���� ��������� ������ �ִٴ� ���̹Ƿ� ������ �ִ� ���� �����ϴ� ���� ������ ����.
		//���� ���⸦ �߰��� �� Weapon�� ��ӹް� �ϴ� Ŭ������ ����� �ָ� �Ǳ⿡ ������.
		weapon.attack();
	}
}

abstract class Weapon{
	//�������� ���� Ŭ�����̱� ������ �߻� Ŭ������ �ۼ���.
	abstract void attack();
	//attack() �޼���� ���⿡ ���� ����� �޶��� ���̹Ƿ� �߻�޼���� ���ܵ� �����δ� �� ��ӹ޴� Ŭ�������� ������
}

class Knife extends Weapon {	//Į�� ������ �����̹Ƿ� Weapon Ŭ������ ��ӹ޴´�.
	void attack() {
		//��ӹ��� �߻�޼����� �����θ� �ϼ���. Į�̱� ������ ��ٸ� ������.
		System.out.println("Į�� ��ϴ�.");
	}
}

class Gun extends Weapon{	//���� ������ �����̹Ƿ� Weapon Ŭ������ ��ӹ޴´�.
	void attack() {
		//��ӹ��� �߻�޼����� �����θ� �ϼ���. ���̱� ������ ��°��� ������.
		System.out.println("������ ���ϴ�.");
	}
}
