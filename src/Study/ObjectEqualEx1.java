package Study;

public class ObjectEqualEx1 {
	public static void main(String [] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// �Ʒ��� ������ Ŭ������ ���� ��ü�� �����Ѵ�. �̶� ��ü ���� ������ ���� �Ű������� 10���� �����ȴ�.
		
		if(v1.equals(v2)) {	//��� Ŭ������ �ְ� ������ Object Ŭ������ equals �ż��带 ���� ���Ѵ�.
			System.out.println("v1�� v2�� �����ϴ�.");
		}else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		//�� ��� v1�� v2�� ���� �ٸ� ��ü�̸� �ٸ� �ּҰ��� ������ ������ ���ǹ��� ����� �ٸ� ���� ��µȴ�.
		//�̷� ���Ͽ� equals�޼���� ������� ��ü�� �ּҰ��� ���ϴ� ���� �� �� �ִ�.
		
		v2 = v1;
		//�������� v2�� ����Ű�� �ּҸ� v1�� ����Ű�� �ּҷ� �ٲ�� ������ ���� ���� ��ü�� ����Ų��.
		
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		}else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		
	}
	
}

class Value{
	int value;	//��������� ����
	
	Value(int value){	//�����ڸ� ���Ͽ� ��ü ������ ���� value�� ���� �Ű������� ������ �����Ѵ�.
		this.value = value;
	}
}
