package programmers;

//°ýÈ£ º¯È¯
class ParenthesesChange {
	static String solution(String p) {
		String answer = "";
		
		int index = splitString(p);
		String u = p.substring(0, index);
		String v = p.substring(index);
		
		
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String p = ")()((()))(()()(";
		
		solution(p);
	}
	
	static int splitString(String p) {
		int balanceChk = 0;
		int index = 0;
		
		for(int i = 0; i < p.length(); i++){
			
			if(p.charAt(i) == "(".charAt(0)) {
				balanceChk++;
				index++;
			}else if(p.charAt(i) == ")".charAt(0)) {
				balanceChk--;
				index++;
			}
			
			if(balanceChk == 0) {
				break;
			}
		}
		
		return index;
	}
	
	static boolean validateString(String p) {
		
		if(p.charAt(0) != "(".charAt(0)) {
			return false;
		}
		
		return true;		
	}
}
