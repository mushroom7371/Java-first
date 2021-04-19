package CollectionsFramework;

import java.util.ArrayList;	//java.util �� �ִ� Ŭ������ �� Ŭ�������� ����ϰڴٴ� �ǹ�
import java.util.Iterator;	//��������, ������ �ϴܿ� ����

public class ArrayListEx {
	public static void main(String [] args) {
		ArrayList<String> al = new ArrayList<>();
		//ArrayList Ÿ���� �������� al�� �����ϴµ�, <String>���� ���Ͽ� ���ڿ� ���� �޵��� �ϰڴٴ� �ǹ�. �÷��� ��ü�� �����Ҷ� ����Ǵ� �������� ���� �̸� �����ϴ°�.
		//new�� ���Ͽ� ArrayList�� �����ϰ� al�� �� �ּҰ��� ����. ArrayList�� �迭�� �����̴� ������ �ְ�, �ݺ��� �����
		
		al.add("hello");	//ArrayList�� List �������̽��� ��ӹ޾Ƽ� ������ ���̰�, List �������̽��� Collection �������̽��� ��ӹ޴´�.
		al.add("java");		//Collection �������̽����� �������� �޼��尡 �ִµ� Collection �������̽��� ��ӹ��� List �������̽��� ������ ArrayList���� ��밡���ϴ�.
		al.add("world");	//add()��� �޼���� ArrayList �ν��Ͻ��� �޼��� ������ ���� �Ű������� �߰��ϰڴٴ� �ǹ�

		
		//al.remove(2);	//���������� �����ϴ� ����� remove() �޼��带 ����Ҽ��ִ� �Ű��������� �ε����� ��ȣ, �������� ����.
		
		System.out.println(al.get(1));	//get() �޼���� �ش� �������� ���� �ҷ����ڴٴ� �ǹ�.
		
		Iterator<String> it = al.iterator();
		//Iterator�� �������̽� �̸� �÷��� �����ӿ�ũ���� ����� ��ҵ��� �о���� ����� ǥ��ȭ �ϱ����� ������ �Ѵ�.
		//iterator�� �迭�� ���� ��ȸ�ϸ鼭 �ݺ��ϴ� ��
		//Iterator �������̽����� hasNext(), next(), remove() �޼��尡 �����Ǿ������� List �Ǵ� Set �������̽���
		//�����ϴ� �÷��ǵ��� iterator()�� ������ Ư¡�� �°� ���谡 �Ǿ��ִ�.
		
		while(it.hasNext()) {	//hasNext()�� �о�� ��Ұ� �����ִ��� Ȯ���ϴ� �޼��� boolean Ÿ������ true, false�� ��ȯ��
			System.out.println(it.next());	//next()�� ���� ��Ҹ� �������� ������ �Ѵ�.
		}
	}
}
