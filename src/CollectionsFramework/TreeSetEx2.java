package CollectionsFramework;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int [] score = {80, 95, 50, 35, 45, 65, 10, 100};	//int Ÿ���� ���� �����ϴ� �迭�� �����԰� ���ÿ� �ʱ�ȭ
		
		for(int i = 0; i < score.length; i++) {	//�������� ���̺��� ������ ���� �ݺ�
			set.add(new Integer(score[i]));	//score[i]�� �Ű������� ���� ������ �������� ���ڸ� ��ä�� ���� set�� �����ϱ� ������
		}
			
			System.out.println("50 ���� ������ : " + set.headSet(new Integer(50)));
			System.out.println("50 ���� ū�� : " + set.tailSet(new Integer(50)));
			//set�� ��� ������ ��ü���� headSet(),tailSet() �޼���� ���Ͽ� ���غ��� �۰ų� ū ������ ����Ҽ��ִ�.
	}

}
