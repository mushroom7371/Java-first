package CollectionsFramework;

import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack(); //main ���ο��� ������ ���� �ƴ϶� public ���� �������� ���� �����ϵ��� �ϰ�,
	public static Stack forward = new Stack();	//static ���� ���ؼ� Ŭ������ �޸𸮿� �ö󰥶� ������ �Ǵ� Stack Ŭ������ �ν��Ͻ�ȭ �Ѵ�.
	
	public static void main(String [] args) {
		goURL("1.����Ʈ");	//goURL �޼���� ���� �Ķ���� ���� back�� �������� ���̰� �ȴ�.
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");
		
		printStatus();	//���
		
		goBack();	//goBack �޼��尡 ȣ��Ǹ�, back�� ������ ��ü�� forward�� ����ȴ�.
		System.out.println(" = �ڷ� ��ư�� ���� �� = ");
		printStatus();	//�� ������ back�� ������ ������ 3.���̹� �� ǥ�õȴ�.
						//���� forward���� 4.���� �� ����Ǿ��ִ�.
		
		goBack();
		System.out.println(" = �ڷ� ��ư�� ���� �� = ");
		printStatus();	//back�� 3.���̹� �� forward�� �Ű�����
						//forward�� stack�� Ư���� 4.���� 3.���̹� �� ������ ����Ǿ� �ִ�.
		
		goForward();	//�� �޼���� ���ؼ� forward�� 3.���̹� �� back�� ������ ��ġ�� �̵��ϰ� �ȴ�.
		System.out.println(" = ������ ��ư�� ���� �� = ");
		printStatus();
		
		goURL("github.com/mushroom7371");	//���ο� �Ķ���Ͱ��� back  �� ����ǰ� forward���� clear �޼���� ���� 4.���� �� �����Ͱ� �����ȴ�.
		System.out.println(" = ���ο� �ּҸ� �Է� �� = ");
		printStatus();
		
	}
	
	public static void printStatus() {	//��� �޼���
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ���� " + back.peek() + " �Դϴ�.");	//���� ���� back�� ����� ������ ���� �о�´�.
		System.out.println();
	}
	
	public static void goURL(String url) {	//String Ÿ���� �Ű������� goURL()�� �����ϴµ� ���� �ν��Ͻ� ������ ���������� public ���� �������� ���ٰ����ϰ�, static���� ��ü ������ �ʿ���� ���� ������ �޼���
		back.push(url);	//�޼��带 ȣ���ϸ� ������ Stack Ÿ���� back�� �Ķ���͸� ��ä�� �����Ѵ�.
		if(!forward.empty())	//���� forward �ν��Ͻ��� �����Ͱ� ����Ǿ��ִٸ�
			forward.clear();	//forward�� ��� �����͸� �����Ѵ�.
	}
	
	public static void goForward() {	//��ȯ���� ���� �޼��弱��.
		if(!forward.empty())	//���� forward�� �����Ͱ� �ִٸ�,
			back.push(forward.pop());	//back���ٰ� forward�� ����Ǿ��ִ� ������ �����͸� �̾Ƴ��� �����Ѵ�.(stack�� ������ �������� �������̱⿡ ������ ���� �����Ͱ� �������� �Ǵ°��̴�.)
			
	}
	
	public static void goBack() {	//goForward �޼���� �������� ������� ����� �����ȴ�.
		if(!back.empty())
			forward.push(back.pop());
	}
}
