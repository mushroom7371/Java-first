package programmers;

import java.util.ArrayList;
import java.util.List;

//최댓값과 최솟값
class MaxMin {
	static String solution(String s) {
		String answer = "";
		int max = 0;
		int min = 0;
		List<String> al = new ArrayList<String>();
		
		for(int i = 0; i < s.length(); i++) {
			//공백을 제외하고 문자열을 뽑아내는데, 십의자리 또는 백의자리 수와 같은 문자는?
		}
		
		System.out.println(al.toString());
		
		return answer;
	}
	
	public static void main(String[] args) {
		String s = "1 4 2 6 8 15";
		solution(s);
	}
}
