package ch11;

import java.util.*;

public class HashSetEx1 {
	public static void main(String [] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		// Object Ÿ�� �迭�� �����ϰ� ������ �Է��� �� �������� objArr�� �ּҰ��� ���� 
		Set set = new HashSet();
		// Set Ÿ���� �������� set�� HashSet �� �����ϰ� �ּҰ��� ������
		
		for(int i  = 0; i < objArr.length; i++) { //objArr�� ���̸�ŭ �ݺ�
			set.add(objArr[i]); //set �ν��Ͻ��� add�޼��带 ���Ͽ� set�� objArr�� ������ ���������� ����
		}
		
		System.out.println(set); // set�� �ߺ��� ������� ������ 1,1 �� ��µȰ��� ���� String ,Integer Ÿ������ �ٸ��⶧��
	}
}
