package programmers;

class StringToNum {
	private int solution(String s) {
		int answer = 0;
		String [] str = new String [] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		//바꿀 문자들을 String 배열에 담아둔다. 사실 상 내부는 String 타입의 참조변수 str이 String 배열의 주소를 가리키고 그 배열의 각가의 번지가 String을 가리킨다.
		
		for(int i = 0; i < str.length; i++) {	//str의 길이만큼 1씩 증가하면서 반복한다.
			s = s.replaceAll(str[i], String.valueOf(i));	//s가 가리키는 문자열 중 str[i]번지에 해당하는 문자를 i로 대체한다.
		}
		
		answer = Integer.parseInt(s);	//s는 Strgin 타입이므로 int 타입으로 변환 시켜 준다.
		
		return answer;
	 }
}
