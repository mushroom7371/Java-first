package programmers;

class ParenthesesChange {
	static String solution(String p) {
		String answer = "";
		String balance = "";
		String unbalance = "";
		int balanceChk = 0;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < p.length(); i++) {
			sb.append(p.charAt(i));
		}
		
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) == "(".charAt(0)) {
				balanceChk++;
			}else if(p.charAt(i) == ")".charAt(0)) {
				balanceChk--;
			}
			
			balance += p.charAt(i);
			sb.deleteCharAt(i);
			
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String p = ")()((()))(()()(";
		
		solution(p);
	}
}
