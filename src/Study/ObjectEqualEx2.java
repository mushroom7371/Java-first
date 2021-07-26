package Study;

public class ObjectEqualEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(9111191111111L);
		Person p2 = new Person(9111191111111L);
		//�� ���������� ����Ű�� ��ü�� �ٸ��� ��ü�� ������ id�� ���� �����ϴ�.

		if(p1 == p2) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		//p1�� p2�� �ٸ� �ּҰ��� ���� �ٸ� ��ü�̹Ƿ� �ٸ� ������� �Ǵ�.
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		//Object Ŭ������ equals()�޼��带 �������̵� �Ͽ��� �̸� ���� ��ü�� ���� ������ ���� �������� Ȯ���ϵ��� �Ͽ���.

	}
}

class Person{
	long id;
	
	public boolean equals(Object obj) {	//�Ű������� ObjectŸ���� ���������� �������� �������̵���.(equals�޼���� �ֻ��� Ŭ������ ObjectŬ������ ���� �޼�����)
		if(obj instanceof Person) {
			//instanceof �����ڸ� ���Ͽ� �θ� ��ü, �ڽ� ��ü ���踦 Ȯ�� �� �� �ִ�
			//���� ��� �Ű������� ���� Object Ÿ���� �������� obj�� Person Ŭ������ ���谡 �ִٸ�(Person Ÿ������ ����ȯ�� �����ϸ�)
			return id == ((Person)obj).id;	//return this.id �� ����
			//�ش� ��ü�� id��� ������ ������ �������̰� �̸� ����ϱ� ���� Person Ÿ������ ����ȯ ���� �ڱ��ڽ��� id�� �����ؼ� ��ȯ�Ѵ�.
		}else {
			return false;
		}
	}
	
	Person(long id){
		this.id = id;
	}
}