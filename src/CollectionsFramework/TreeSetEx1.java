package CollectionsFramework;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //TreeSet ��ü ���� �� TreeSet Ÿ���� ���������� �ּҰ��� ����
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set.subSet(from, to));	//�ڹٿ��� from to�� ��� to�� �������� �ʴ´�. ���⼭�� d���������� ���� ���
		System.out.println("result2 : " + set.subSet(from, to + "zzz")); //d�� �����ϴ� �ܾ���� �����ϱ� ���� "zzz"�� ���� �־��� ���ڿ��� �����ڵ�� ����Ǿ� ��ҹ���,���� ���� ������ ������ ��ģ��.
	}

}
