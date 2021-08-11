package ch09;

class Card{
	String kind;
	int number;
	
	Card(){	//�Ű������� ���� �����ڸ� ���� ��ü ������ ������ ���� ������ �ʱ�ȭ �ϴµ� �⺻���� �����Ͽ���.
		this("SPADE", 1);
	}
	
	Card(String kind, int number){	//�Ű������� ������ �� �����ڸ� ȣ���Ͽ� ���ڰ��� �ڱ��ڽ��� �����鿡 �������ش�.
		this.kind = kind;
		this.number = number;
	}
}

class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println("toString c1 : " + c1.toString());
		System.out.println("toString c2 : " + c2.toString());
		//��ü ���� �� Object Ŭ������ toString() �޼��带 ȣ�� �� ����� ��Ű����.Ŭ������@�ؽ��ڵ尡 ��ȯ�ȴ�.
		//�ش� �޼���� �Ʒ��� ���� ��� ��ü�� �����̹Ƿ� public ���������ڸ� ����Ͽ���.
		//public String toString() {
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
		//}
	}
}
