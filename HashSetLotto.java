package ch11;

import java.util.*;

public class HashSetLotto {
	public static void main(String [] args) {
		Set set = new HashSet();	//Set 타입의 참조변수 set에 HashSet을 생성하여 주소값을 저장
		
		for(int i = 0; set.size() < 6; i++) {	//Set의 크기가 6미만으로 순차적으로 반복문을 돌림
			int num = (int)(Math.random() * 45) + 1; //int 타입의 변수num에 1~45의 값을 랜덤으로 저장
			set.add(new Integer(num));	// 참조변수set에 num의 값을 추가한다 이때 중복은 허용하지 않으며 6개의 값이 저장됨
		}
		
		List list = new LinkedList(set);	//List 타입의 참조변수 list에 set을 참조하는 LinkedList를 생성하고 그 주소값을 저장
		Collections.sort(list);	//Collections의 정렬 메서드인 sort()를 이용하여 list가 가리키는 곳의 숫자를 정렬함.
		System.out.println(list); //출력, 중복되지 않는 무작위의 숫자가 순차적으로 출력됨
	}
}
