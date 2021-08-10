package ch09;

class Person{
	long id;
	
	//ObjectŬ������ equals �޼��带 �������̵� �Ͽ���.
	public boolean equals(Object obj) {	//���ڰ����� ������ ���������� Object Ÿ���̰�
		if(obj instanceof Person)	//���������� ����Ű�� ��ü�� Person Ÿ���� ��ü�� ����� �� ���̶��
									//�Ѹ���� Person Ŭ������ ���� ������� ��ü�̸� ��� Ŭ������ ObjectŬ������ ��ӹޱ⿡
									//������ ���̶�� �ش� ��ü�� Person Ŭ������ ���� ������� ��ü�̴�.
			return id == ((Person)obj).id; //Person Ŭ������ ���� id ����(this) ���������� ����Ű�� ���������� �����Ѵ�.
											//�ٸ� �ش� ���������� Person Ŭ������ ���� ������� ��ü�� ����Ű���� Object Ÿ���̹Ƿ�
											//���빰�� ����ϱ� ���ؼ��� ����ȯ �۾��� ���Ͽ� �����ؾ� ��밡���ϴ�.
		else
			return false;
	}
	
	Person(long id){	//��ü�� �����Ҷ� ���ڰ����� �޴� ���ڸ� ������� id ������ �����Ѵ�.
		this.id = id;
	}
}


public class EqualsEx2 {
	public static void main(String arg[]) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1==p2) //p1,p2�� ���� id�� ���� ������ p1�� Person Ŭ������ ���� ������ �ν��Ͻ��� �ּҰ��� �����ϴ� �����̰� p2���� �ּҰ��� �����ϴ� �����̿��� ���� �ٸ���.
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");		
		
		if(p1.equals(p2))  //equals�� ���� ���ÿ� �ٸ��� ���ڿ� ���� ���ϱ⿡(�� ��쿡�� ���������� ����Ű�� ��ü�� �ּҰ��� �ȴ�.)
							//p1�� p2�� ���ڿ� ���� �����Ƿ�(���� ��ü�� ����Ű�Ƿ�) ���� ����̶�� ��µȴ�
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		else
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");	
	}
}
