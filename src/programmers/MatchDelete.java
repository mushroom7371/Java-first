package programmers;

import java.util.Stack;

//¦���� �����ϱ�
class MatchDelete {
	private int solution(String s) {
		int answer = -1;
		Stack<String> st = new Stack<String>();	//���ڸ� ��� �Ǵ��ϱ� ���� ������ Stack ��ü
		
		for(int i = 0; i < s.length(); i++) {	//�Ű������� �־��� ���ڿ��� ���̸�ŭ 1�� �ݺ�
			if(st.isEmpty()) {	//������ ����ִٸ�
				st.push(s.substring(i, i+1));	//i���� ���� i+1���� �������� ���ڿ��� ���ÿ� �ִ´�.
			}else if(st.peek().equals(s.substring(i, i+1))) {	//������ ������ ���ڰ� �� ���� ���ڿ� �����ϴٸ�
				st.pop();	//������ ������ ���ڸ� �����Ѵ�.
			}else {	//�ƴ϶�� ���ڸ� ���ÿ� �ִ´�.
				st.push(s.substring(i, i+1));
			}
		}
		
		if(st.isEmpty()) {	//������ ����ִٸ� �ƹ� �͵� ���� ���·�
			answer = 1;	//1 ��ȯ
		}else {	//�ƴ϶��
			answer = 0;	//0 ��ȯ
		}
		
        System.out.println("Hello Java");

        return answer;
	}
}
