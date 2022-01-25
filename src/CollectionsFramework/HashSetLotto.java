package CollectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();	//Set 타입의 참조변수를 선언하고 HashSet클래스로 인스턴스를 생성한 후 주소값을 저장한다.
		
		for(int i = 0; set.size() < 6; i++) {	//set.size()가 6미만일때 까지 반복을한다.
			int num = (int)(Math.random()*45) + 1;	//반복마다 범위 1~45까지의 임의의 수를 num에 저장한다.
			set.add(new Integer(num));	//그 저장한 값을 set이 가리키는 HashSet 인스턴스에 저장한다.	중복값은 저장하지 않는다.
		}
		
		List list = new LinkedList(set);	//set의 데이터 값을 List 타입의 인스턴스 LinkedList에 담는다.
		Collections.sort(list);	//Collections클래스의 sort()메서드를 이용해서 list의 데이터값을 정렬한다. Collection은 인터페이스이다.
		System.out.println(list);
	}

}
