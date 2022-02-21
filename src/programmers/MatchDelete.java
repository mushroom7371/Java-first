package programmers;

import java.util.Stack;

//짝지어 제거하기
class MatchDelete {
	private int solution(String s) {
		int answer = -1;
		Stack<String> st = new Stack<String>();	//문자를 담고 판단하기 위해 생성한 Stack 객체
		
		for(int i = 0; i < s.length(); i++) {	//매개변수로 주어진 문자열의 길이만큼 1씩 반복
			if(st.isEmpty()) {	//스택이 비어있다면
				st.push(s.substring(i, i+1));	//i번지 부터 i+1번지 전까지의 문자열을 스택에 넣는다.
			}else if(st.peek().equals(s.substring(i, i+1))) {	//스택의 마지막 문자가 그 다음 문자와 동일하다면
				st.pop();	//스택의 마지막 문자를 제거한다.
			}else {	//아니라면 문자를 스택에 넣는다.
				st.push(s.substring(i, i+1));
			}
		}
		
		if(st.isEmpty()) {	//스택이 비어있다면 아무 것도 없는 상태로
			answer = 1;	//1 반환
		}else {	//아니라면
			answer = 0;	//0 반환
		}
		
        System.out.println("Hello Java");

        return answer;
	}
}
