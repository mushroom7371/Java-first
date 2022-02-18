package programmers;

//JadenCase 문자열 만들기
class JadenCase {
	static String solution(String s) {
		String answer = "";
		String str = s.trim();
		String [] strArr = str.split("\\s+");
		
		for(int i = 0; i < strArr.length; i++) {
			String tmp = "";
			char isNum = strArr[i].charAt(0);
			
			if(isNum >= '0' && isNum <= '9') {
				tmp += isNum;
				for(int j = 1; j < strArr[i].length(); j++) {
					tmp += Character.toLowerCase(strArr[i].charAt(j));
				}			
			}else {
				tmp += Character.toUpperCase(isNum);
				for(int j = 1; j < strArr[i].length(); j++) {
					tmp += Character.toLowerCase(strArr[i].charAt(j));
				}
			}
			
			if(i != strArr.length -1) {
				answer += tmp + " ";
			}else {
				answer += tmp;
			}
			
		}

		return answer;
	}
	
	public static void main(String[] args) {
		String s = "  for   the    last week   ";
//		String s = "a a a a a a a a a a ";
//		String s = "tomato";
		solution(s);
	}
}
