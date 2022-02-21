package Study;

import java.util.Scanner;

public class ReplaceAll {
	public static void main(String[] args) {
		//입력받은 문자에서 숫자만 출력하는 방법
		String str;
		
		System.out.print("문자를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		str = str.replaceAll("[^0-9]", "");
		//String 클래스에서 제공하는 replaceAll() 메서드로 정규식을 이용하여 숫자이외의 문자를 제거한다.
		
		System.out.println(str);
		
	}
}
