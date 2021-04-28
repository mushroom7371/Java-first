package CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();	//Set Ÿ���� ���������� �����ϰ� TreeSet���� ���� �ν��Ͻ��� ������ �� �ּҰ��� ���������� �����Ѵ�.
		
		for(int i = 0; set.size() < 6; i++) {	//i=0���� �ʱ�ȭ �ϰ�, set�� ����Ű�� �迭�� ���̰� 6�̸��϶����� �ݺ�
			int num = (int)(Math.random()*45) + 1;	//0~1������ �������� ���ϴ� �޼��带 ȣ�� �ϰ� 45�� ���� ���� intŸ������ ����ȯ �� �� 1�� ���� ���� �����Ѵ�.
			set.add(num);	//set�� ����Ű�� TreeSet �ν��Ͻ��� �ݺ��ɶ������� ���� �����Ѵ�.
		}
		
		System.out.print(set);
		//set�� �ߺ��� ������� �ʱ⶧���� �ߺ����� ������� ������ TreeSet�� Ư���� �����Ҷ� �̹� ������ �ϱ⿡ ���Ķ��� �ʿ� ����.
	}

}
