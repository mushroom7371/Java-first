package programmers;

//이상한 문자 만들기
class WeirdMessage {
	static String solution(String s) {
		String answer = "";
		String [] str = s.split(" ");
		
		for(int i = 0; i < str.length; i++) {
			String temp = "";

			for(int j = 0; j < str[i].length(); j++) {
				
				if(j % 2 == 0) {
					temp += Character.toUpperCase(str[i].charAt(j));
				}else {
					temp += str[i].charAt(j);
				}
			}
			
			str[i] = temp;
			
			if(i != str.length-1) {
				answer += str[i] + " ";
			}else {
				answer += str[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "try hello world";
		
		solution(s);
	}
}
