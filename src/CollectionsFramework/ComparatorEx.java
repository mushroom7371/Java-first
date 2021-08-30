package CollectionsFramework;

import java.util.Arrays;
import java.util.Comparator;

class ComparatorEx {
	public static void main(String[] args) {
		String [] strArr = {"cat", "Dog", "lion", "tiger"};	//정렬테스트를 위해 선언한 String 타입 배열을 담는 참조변수 선언 및 초기화
		
		Arrays.sort(strArr);	//Arrays 클래스에서 제공하는 정렬메서드 사용, String 의 Comparable구현에 의한 정렬(따로 Comparator를 지정하지 않았기에 Comparable를 구현한 Stirng 클래스에 구현된 내용에 따라 정렬하였다.)
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);	//대소문자의 구분 없이 정렬. 지정한 Comparator에 의한 정렬이지만 String 클래스에서 구현한 내용을 지정하여 정렬하였다.
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());	//아래의 Comparator 인터페이스를 구현한 Descending 클래스를 사용하여 역순으로 정렬한다.
		System.out.println("strArr = " + Arrays.toString(strArr));

	}
}

class Descending implements Comparator	{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			//Comparable은 기본 정렬기준을 구현하는데 사용
			//Comparator는 기본 정렬기준 외에 다른 기준으로 정렬하고자 할때 사용
			
			return c1.compareTo(c2) * -1;	//역순으로 정렬하기 위해 단순히 반환값에 -1을 곱하는 작업을 하였다.
		}
		
		return -1;
	}
}
