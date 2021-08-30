package CollectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

class HashSetEx5 {
	public static void main(String[] args) {
		HashSet setA	= new HashSet();
		HashSet setB	= new HashSet();
		HashSet setHab	= new HashSet();
		HashSet setKyo	= new HashSet();
		HashSet setCha	= new HashSet();
		//HashSet�� Ư���� �����ϱ� ���� ���� ����
		
//		setA.add("1");	setA.add("2");	setA.add("3");
//		setA.add("4");	setA.add("5");
		
		for(int i = 1; i < 6; i++) {	//������ �ݺ��̶� �׳� for������ ������ �Է���
			setA.add(i);
		}
		
		System.out.println("setA = " + setA);
		
//		setB.add("4");	setB.add("5");	setB.add("6");
//		setB.add("7");	setB.add("8");
		
		for(int i = 4; i < 9; i++) {
			setB.add(i);
		}
		
		System.out.println("setB = " + setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))	//�������� �˱����� setB�� setA�� ���Ͽ� tmp�� ����(setb)�� setA�� contain(����)�ϰ� �ִٸ� �� ���� setKyo�� �����Ѵ�.
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))	//�����հ��� �ݴ�� !�����ڸ� �̿��Ͽ� ���� ���̶�� �� ���� setCha�� �����Ͽ���.
				setCha.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) {	//�������� �ߺ� ���� �� ������ ������ ��� �����Ƿ� HashSet�� �̿��Ͽ� ���� �����͸� ������ �� �ִ�.
			setHab.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		System.out.println("A �� B = " + setKyo);
		System.out.println("A �� B = " + setHab);
		System.out.println("A - B = " + setCha);
		
	}
}
