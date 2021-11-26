package programmers;

//문자열s를 숫자로 변환한 결과를 반환하는 함수, solution 완성
/*제한 조건
s의 길이는 1 이상 5이하입니다.
s의 맨앞에는 부호(+, -)가 올 수 있습니다.
s는 부호와 숫자로만 이루어져있습니다.
s는 "0"으로 시작하지 않습니다.*/

class StringToInt {
	private int solution(String s) {
		//solution() 메서드를 호출 할 때 String 타입의 참조변수 s를 인자로 받는다.
		return Integer.parseInt(s);
		
		//Integer 클래스의 static 메서드인 parseInt()를 사용한다.
		//해당 메서드는 숫자형의 문자열을 인자값으로 받으면 해당 값을 10진수의 Integer형으로 반환한다.
	}
}
