package CollectionsFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();	//ArrayList Ÿ���� ���������� ���θ��� ArrayList ��ü�� �ּҰ��� ������
		
		list.add("1");	//ArrayList �ν��Ͻ��� �����͸� �߰���.
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator();	//ListIterator Ÿ���� �������� it�� �����ϰ� ArrayList��ü�� ������ �ִ� listIterator()�޼��带 ȣ���Ͽ� ���ϰ��� ������
												//�̶� ���������� Ÿ���� ListIterator�� ����� ������ listIterator()�޼��� ó������� ��ȯ�� ���� ListIteratorŸ���̱� �����̴�.
		while(it.hasNext()) {	//it�� ����Ű�� �ν��Ͻ��� ���� �����Ͱ� �ִ� ���, �ݺ��� ������ ���������� �ʱ⿡ false���� �� ��� ������� �ʴ´�.
			System.out.println(it.next());	//�� �����͸� �ҷ��ͼ� ����Ѵ�.
		}
		
		System.out.println("--------------");
		
		while(it.hasPrevious()) {	//Iterator�ʹ� �ٸ��� ListIterator ���� ��������� ���� �о�� ���ִ� hasPrevious()�� ���� ���� �ִ��� ������ ������ �Ǵ���.
			System.out.println(it.previous());	//������ �о�� �����Ͱ� �ִٸ� �� �����͸� �ҷ����� �̸� ����Ѵ�.
		}
	}

}
