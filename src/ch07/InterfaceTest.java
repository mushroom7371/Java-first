package ch07;

public class InterfaceTest {
	public static void main(String [] args) {
		A a = new A();
		a.autoPlay(new B());	//B�� �޼��带 ����ϱ����� ��ü�� �������־�ߵ�
		a.autoPlay(new C());	//������ �����ϰ� �޼��带 �̿��� �� ������ �� �� ���� ������ �÷��ͷ� ���Ͽ� �����
								//�� �޼���� �Ű������� �������̽��� ������ Ŭ������ �ν��Ͻ��� �������ν� �޼��尡 ����ȴ�.
	}
}

class A {
	void autoPlay(I i) {	//�������̽� I Ÿ���� �������� i�� �Ű������� ������
							//�Ű������� ���ؼ� �������̽��� ������ Ŭ������ �ν��Ͻ��� �������� ���� �޾ƾ� ��
		i.play();
	}
}

interface I{	//�������̽� ����
	public abstract void play(); //�������� ����� �߻�޼���
}

class B implements I{
	public void play() {
		System.out.println("Play in B class"); //�������̽� I�� ������ BŬ�������� ����� play �޼���, �������̵� �Ͽ���.
	}
}

class C implements I{
	public void play() {
		System.out.println("Play in C class"); //�������̽� I�� ������ CŬ�������� ����� play �޼���, �������̵� �Ͽ���.
	}
}
