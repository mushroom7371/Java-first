package ch09;

class Card1{
	String kind;
	int number;
	
	Card1(){	//�Ű������� ���� �����ڸ� ���� ��ü ������ ������ ���� ������ �ʱ�ȭ �ϴµ� �⺻���� �����Ͽ���.
		this("SPADE", 1);
	}
	
	Card1(String kind, int number){	//�Ű������� ������ �� �����ڸ� ȣ���Ͽ� ���ڰ��� �ڱ��ڽ��� �����鿡 �������ش�.
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : " + kind + " number : " + number;
	}
}

class CardToString2 {
	public static void main(String[] args) {
		
		Card1 c1 = new Card1();
		//�Ű������� �ѱ� ���ڰ��� �־����� ���� �� �����ڸ� ���� �⺻ ��ü�� ����
		Card1 c2 = new Card1("HEART", 9);
		//���ڰ��� �־����Ƿ� ��ü�� ��������� �ش� �����Ͱ� �����
		
		System.out.println("toString c1 : " + c1.toString());
		System.out.println("toString c2 : " + c2.toString());
		//Ŀ���� Ŭ�������� toString() �޼��带 �������̵� �Ͽ� �ش� �޼��� ȣ��� �������̵� �� ������ ��µȴ�.
	}
}
