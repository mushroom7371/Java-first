package ch11;

import java.util.*;

public class HashSetEx1 {
	public static void main(String [] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		// Object 타입 배열을 생성하고 내용을 입력한 후 참조변수 objArr에 주소값을 저장 
		Set set = new HashSet();
		// Set 타입의 참조변수 set에 HashSet 을 생성하고 주소값을 저장함
		
		for(int i  = 0; i < objArr.length; i++) { //objArr의 길이만큼 반복
			set.add(objArr[i]); //set 인스턴스의 add메서드를 통하여 set에 objArr의 값들을 순차적으로 더함
		}
		
		System.out.println(set); // set은 중복을 허용하지 않지만 1,1 이 출력된것은 각각 String ,Integer 타입으로 다르기때문
	}
}
