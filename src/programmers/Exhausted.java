package programmers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//ÇÇ·Îµµ
class Exhausted {
	static int solution(int k, int [][] dungeons) {
		int answer = -1;
		Map<Integer, Integer> firo = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < dungeons.length; i++) {
			firo.put(dungeons[i][0], dungeons[i][1]);
		}
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int k = 80;
		int [][] dungeons = {{80,20}, {50,40}, {30,10}};
		
		solution(k, dungeons);
	}
}
