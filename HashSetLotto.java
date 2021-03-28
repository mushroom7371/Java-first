package ch11;

import java.util.*;

public class HashSetLotto {
	public static void main(String [] args) {
		Set set = new HashSet();	//Set Ÿ���� �������� set�� HashSet�� �����Ͽ� �ּҰ��� ����
		
		for(int i = 0; set.size() < 6; i++) {	//Set�� ũ�Ⱑ 6�̸����� ���������� �ݺ����� ����
			int num = (int)(Math.random() * 45) + 1; //int Ÿ���� ����num�� 1~45�� ���� �������� ����
			set.add(new Integer(num));	// ��������set�� num�� ���� �߰��Ѵ� �̶� �ߺ��� ������� ������ 6���� ���� �����
		}
		
		List list = new LinkedList(set);	//List Ÿ���� �������� list�� set�� �����ϴ� LinkedList�� �����ϰ� �� �ּҰ��� ����
		Collections.sort(list);	//Collections�� ���� �޼����� sort()�� �̿��Ͽ� list�� ����Ű�� ���� ���ڸ� ������.
		System.out.println(list); //���, �ߺ����� �ʴ� �������� ���ڰ� ���������� ��µ�
	}
}
