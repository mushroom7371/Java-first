package JavaStudy;

public class Car {
	
	//�ż����� �����ε��� �����Ͽ� �����ε��� �޼����� �̸��� �ߺ��ǰ� �ϴ� ������
	//���� ����� �ϴ� �޼����� ���� �ϳ��ϳ� �ٸ��� �����ϰ� �ȴٸ� ����ϴµ� ������� �ֱ⶧����
	//������ �̸����� ���� �� �� �ִ�. �� ������ ���� �ϸ� �ߺ����� �ν��ϱ⿡
	//�޼����� �Ű������� �� �Ǵ� Ÿ���� ���¸� �ٲ��ִ� ������ �ٸ� �޼����� ���� �˷��־�� �Ѵ�.
	//�����ε� �� ���ϰ��� ������ ��ġ�� �ʴ´� ���� ��ȯ���� ���� �����δ� �Ǵ����� �ʴ´�.
	
	String name;	//String Ÿ���� ���� ���� �ʱⰪ�� null
	int number;		//int Ÿ���� ���� ���� �ʱⰪ�� 0

	Car(String name, int number){
		//�Ű������� String Ÿ�԰� int Ÿ���� �Է� �޾� �ʵ��� name�� number�� �ʱ�ȭ ���ִ� ������
		this.name = name;		//�Ű� ������ �ʵ��� �������� ��ġ�� ������ �����ϱ� �����.
		this.number = number;	//���⼭ ���̴� this�� �ʵ��� ������ �ǹ��Ѵ�.
	}
	
	Car(){	//�������� �Ű������� �ƹ��͵� ���� ���� ������
		this("�̸�����", 0000);
		// �Ű������� �ƹ��͵� ���� �ʾ����� �ʱ��� ���¸� "�̸�����", 0000���� �ϱ� ���� �ڽ��� �����ڸ� �޾ƿ�
		//this.name = "�̸�����", this.number = 0000; ���� �ϰ� �Ǹ� ���� �ڵ�� �ߺ��� �ǹǷ� ���ϴ°� ����.
	}
	
	Car(String name){
		this(name, 0000);
		//�Ű������� String Ÿ�� �ϳ��� �޴� ������
	}
	
}