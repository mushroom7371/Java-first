package programmers;

//문자열 다루기 기본
class ChkOnlyNum {
	 private boolean solution(String s) {
	        boolean answer = true;
	        //String 타입의 변수 s는 사실 참조변수이며 String 객체의 주소를 가리킨다. 그 객체에 char 문자가 배열로 저장되어있다.
	        
	        if(s.length() != 4 && s.length() != 6) {	//문자열 s의 길이가 4 그리고 6이 아니라면
	        	return false;
	        }
	        
	        for(int i = 0; i < s.length(); i++) {	//문자열의 길이만큼 1씩 증가 하면서 반복한다.
	        	if(s.charAt(i) < '0' || s.charAt(i) > '9') {
	        		//String 객체는 char의 묶음이므로 charAt() 메서드를 통하여 해당 번지수(인덱스)의 값으로 문자를 확인한다.
	        		//해당 인덱스의 값이 '0' 미만 또는 '9' 초과라는 말은 숫자가 아니라는 의미이다.
	        		return false;
	        	}
	        }
	        
	        return answer;
	    }
}
