package AlgorithmStudy;

import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		String str = "sdfh398hsdg0";
		
		char [] array = str.toCharArray();
		//정렬을 위해 char 배열에 String 타입의 문자열을 한글자씩 쪼개서 입력하여준다.
		Arrays.sort(array);
		//Arrays 클래스에서 제공하는 sort()메서드에 위의 char 배열의 참조변수를 매개변수로 입력하면
		//내부 로직을 통해(어떤 식으로 변환되는지는 잘모름... 공부해야됨) 결과값을 반환하여 기존의 char 타입의 참조변수에 담아준다.
		String result = new String(array);
		//해당 내용을 확인하기 위해 Stirng 객체애 담아둔다.
		
		System.out.println(result);

	}
}
