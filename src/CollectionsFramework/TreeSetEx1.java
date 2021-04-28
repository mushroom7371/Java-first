package CollectionsFramework;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //TreeSet 객체 생성 후 TreeSet 타입의 참조변수에 주소값을 저장
		
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
		System.out.println("result1 : " + set.subSet(from, to));	//자바에서 from to의 경우 to는 포함하지 않는다. 여기서는 d이전까지의 값을 출력
		System.out.println("result2 : " + set.subSet(from, to + "zzz")); //d로 시작하는 단어까지 포함하기 위해 "zzz"를 더해 주었다 문자열은 유니코드로 저장되어 대소문자,공백 등이 순서에 영향을 미친다.
	}

}
