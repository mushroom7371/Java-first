package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String [] args) {
		Object [] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		//Object Ÿ���� �迭�� ����� ���ÿ� {}���� ������ �ʱ�ȭ �ϰ� �������� objArr�� �ּҰ��� �����Ѵ�. 
		Set set = new HashSet();
		//Set Ÿ���� ���������� �����ϰ� HashSet�� ������ ���� �ּҰ��� �����Ѵ�.
		
		for(int i = 0; i < objArr.length; i++) {	//objArr�� ����Ű�� �迭�� ���̸�ŭ �ݺ�
			set.add(objArr[i]);	//setŸ���� ������ �ִ� add �޼��带 ���ؼ� objArr�� �迭���� ���������� �����Ѵ�.
		}
		
		System.out.println(set);	//set�� �ߺ��� ������� �����Ƿ� 1,1,2,3,4 �� ��µǳ� 1�� �ߺ��Ȱ��� String�ν��Ͻ��� Integer�ν��Ͻ��� �ٸ��⶧��
	}
}
