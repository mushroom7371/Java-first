package CollectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();	//Set Ÿ���� ���������� �����ϰ� HashSetŬ������ �ν��Ͻ��� ������ �� �ּҰ��� �����Ѵ�.
		
		for(int i = 0; set.size() < 6; i++) {	//set.size()�� 6�̸��϶� ���� �ݺ����Ѵ�.
			int num = (int)(Math.random()*45) + 1;	//�ݺ����� ���� 1~45������ ������ ���� num�� �����Ѵ�.
			set.add(new Integer(num));	//�� ������ ���� set�� ����Ű�� HashSet �ν��Ͻ��� �����Ѵ�.	�ߺ����� �������� �ʴ´�.
		}
		
		List list = new LinkedList(set);	//set�� ������ ���� List Ÿ���� �ν��Ͻ� LinkedList�� ��´�.
		Collections.sort(list);	//CollectionsŬ������ sort()�޼��带 �̿��ؼ� list�� �����Ͱ��� �����Ѵ�. Collection�� �������̽��̴�.
		System.out.println(list);
	}

}
