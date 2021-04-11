package JavaStudy;

public class CastingTest {
	public static void action(Robot r) {	//Robot Ÿ���� �������� r�� �Ű������� ������.
		if(r instanceof DanceRobot ) {	// �Ű������� �Է¹��� �������� r(Robot Ÿ���̴�)�� ����Ű�� �ν��Ͻ��� DanceRobot �ν��Ͻ� �̸�
			DanceRobot dr = (DanceRobot)r;	//DanceRobot Ÿ���� �������� dr�� �����ϰ�, Robot Ÿ���� �ν��Ͻ��� DanceTobot Ÿ������ ����ȯ �Ͽ� �� �ּҰ��� �����ϰڴٴ� �ǹ�.
			dr.dance();	// DanceRobot�� �ν��Ͻ��� ���� dance() �޼��带 ����.
		}else if(r instanceof SingRobot) {	//��� ����� ����.
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {	//��� ����� ����.
			DrawRobot drr = (DrawRobot)r;
			drr.draw();
		}
	}
	
	public static void main(String args []) {	//	���� ����
		Robot [] arr = {new DanceRobot(), new SingRobot(), new DrawRobot() };
		//Robot Ÿ���� �迭�� �����ϰ� �������� arr�� ������ �迭�� �ּҰ��� �����Ѵ�.
		//�ʱ�ȭ �κ��� ������ Ŭ������ ���� �ν��Ͻ��� �����ϰ�, �� �ּҰ��� ���������� �迭�� �����Ѵ�.
		for(int i = 0; i < arr.length; i++) {	//arr�� �����ϴ� �迭�� ���̸�ŭ 1�� �����Ͽ� �ݺ��Ѵ�.
			action(arr[i]);	//action() �޼��带 ȣ���ϰ� �Ű������� �������� arr[i]�� ����Ű�� �ν��Ͻ��� �����Ѵ�.
		}
	}//	���� ��
}

class Robot {}	//Robot Ŭ������ ����. �� Ŭ������ �ܼ� �θ� Ŭ���� ������ �Ѵ�.

class DanceRobot extends Robot{	//Robot Ŭ������ ��ӹ��� Ŭ����
	void dance() {
		System.out.println("���� ��ϴ�.");	//DanceRobot�� ���� ��� �޼���
	}
}

class SingRobot extends Robot{	//Robot Ŭ������ ��ӹ��� Ŭ����
	void sing() {
		System.out.println("�뷡�� �θ��ϴ�.");	//SingRobot�� ���� ��� �޼���
	}
}

class DrawRobot extends Robot{	//Robot Ŭ������ ��ӹ��� Ŭ����
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");	//DrawRobot�� ���� ��� �޼���
	}
}
