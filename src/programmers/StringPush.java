package programmers;

class StringPush {
	private String solution(String s, int n) {
		String answer = "";
		 
        for(int i = 0; i < s.length(); i++){	//s의 길이만큼 1씩 증가하며 반복
        	char ch = s.charAt(i);
            
        	if(Character.isLowerCase(ch)){		//소문자의 경우
        		ch = (char)((ch-'a'+n)%26 + 'a');
        	}
        	else if(Character.isUpperCase(ch)){ //대문자의 경우
        		ch = (char)((ch-'A'+n)%26 + 'A');
        	
        	} answer += ch;
        }
        
        return answer;
    }
	
}
