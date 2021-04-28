package CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet();	//Set 타입의 참조변수를 선언하고 TreeSet으로 부터 인스턴스를 생성한 후 주소값을 참조변수에 저장한다.
		
		for(int i = 0; set.size() < 6; i++) {	//i=0으로 초기화 하고, set이 가리키는 배열의 길이가 6미만일때까지 반복
			int num = (int)(Math.random()*45) + 1;	//0~1까지의 난수값을 구하는 메서드를 호출 하고 45를 곱한 값을 int타입으로 형변환 한 후 1을 더해 값을 저장한다.
			set.add(num);	//set이 가리키는 TreeSet 인스턴스에 반복될때마다의 값을 저장한다.
		}
		
		System.out.print(set);
		//set은 중복을 허용하지 않기때문에 중복값이 저장되지 않으며 TreeSet의 특성상 저장할때 이미 정렬을 하기에 정렬또한 필요 없다.
	}

}
