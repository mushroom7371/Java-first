package ch09;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id == ((Person)obj).id; //obj�� Object Ÿ���̹Ƿ� �̸� �����ϱ� ���� PersonŸ������ ����ȯ ��
		else
			return false;
	}
	
	Person(long id){
		this.id = id;
	}
}


public class EqualsEx2 {
	public static void main(String arg[]) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2) //p1,p2�� id ���� ������ p1�� Person Ŭ������ ���� ������ �ν��Ͻ��� �ּҰ��� �����ϴ� �����̰� p2���� �ּҰ��� �����ϴ� �����̿��� ���� �ٸ���.
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");		
		
		if(p1.equals(p2))  //equals�� ���� ���ÿ� �ٸ��� ���ڿ� ���� ���ϱ⿡ p1�� p2�� ���ڿ� ���� �����Ƿ� ���� ����̶�� ��µȴ�
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");	
	}
}
