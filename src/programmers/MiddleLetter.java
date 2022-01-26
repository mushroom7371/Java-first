package programmers;

class MiddleLetter {
	private String solution(String s) {
		String answer = "";
		int num = s.length();
		
		if(num % 2 == 0 ) {
			answer += Character.toString(s.charAt(num/2 - 1)) + Character.toString(s.charAt(num/2));
		}else {
			answer += Character.toString(s.charAt(num/2));
		}
		
		return answer;
    }
}
