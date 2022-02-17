package programmers;

class JadenCase {
	static String solution(String s) {
		String answer = "";
		String [] str = s.split(" ");
		
		for(int i = 0; i < str.length; i++) {
			String tmp = "";
			char isNum = str[i].charAt(0);
			
			if(isNum >= '0' && isNum <= '9') {
				tmp += isNum;
				for(int j = 1; j < str[i].length(); j++) {
					tmp += Character.toLowerCase(str[i].charAt(j));
				}			
			}else {
				tmp += Character.toUpperCase(isNum);
				for(int j = 1; j < str[i].length(); j++) {
					tmp += Character.toLowerCase(str[i].charAt(j));
				}
			}
			
			if(i != str.length -1) {
				answer += tmp + " ";
			}else {
				answer += tmp;
			}
			
		}
		
		System.out.println(answer);

		return answer;
	}
	
	public static void main(String[] args) {
		String s = "for the last week";
//		String s = "a a a a a a a a a a ";
//		String s = "tomato";
		solution(s);
	}
}
