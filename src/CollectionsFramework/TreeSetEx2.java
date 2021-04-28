package CollectionsFramework;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int [] score = {80, 95, 50, 35, 45, 65, 10, 100};	//int 타입의 값을 저장하는 배열을 선언함과 동시에 초기화
		
		for(int i = 0; i < score.length; i++) {	//번지수가 길이보다 작을때 까지 반복
			set.add(new Integer(score[i]));	//score[i]가 매개변수로 담기는 이유는 번지수의 숫자를 객채로 만들어서 set에 저장하기 위함임
		}
			
			System.out.println("50 보다 작은값 : " + set.headSet(new Integer(50)));
			System.out.println("50 보다 큰값 : " + set.tailSet(new Integer(50)));
			//set에 담긴 각각의 객체들을 headSet(),tailSet() 메서드로 비교하여 기준보다 작거나 큰 값들을 출력할수있다.
	}

}
