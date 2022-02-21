package CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String [] args) {
		Object [] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		//Object 타입의 배열을 선언과 동시에 {}안의 값으로 초기화 하고 참조변수 objArr에 주소값을 저장한다. 
		Set set = new HashSet();
		//Set 타입의 참조변수를 선언하고 HashSet을 생성한 다음 주소값을 저장한다.
		
		for(int i = 0; i < objArr.length; i++) {	//objArr가 가리키는 배열의 길이만큼 반복
			set.add(objArr[i]);	//set타입이 가지고 있는 add 메서드를 통해서 objArr의 배열값을 순차적으로 저장한다.
		}
		
		System.out.println(set);	//set은 중복을 허용하지 않으므로 1,1,2,3,4 가 출력되나 1이 중복된것은 String인스턴스와 Integer인스턴스라 다르기때문
	}
}
