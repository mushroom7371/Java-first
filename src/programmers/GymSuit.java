package programmers;

import java.util.HashMap;
import java.util.Map;

//Ã¼À°º¹
class GymSuit {
	 static int solution(int n, int [] lost, int [] reserve) {
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(n);
		
		for(int i = 1; i <= n; i++) {
			map.put(i, 1);
			
			for(int j = 0; j < lost.length; j++ ) {
				if(lost[j] == i) {
					map.replace(i , 0);
				}				
			}
			
			for(int k = 0; k < reserve.length; k++) {
				if(reserve[k] == i) {
					map.put(i, map.get(i) + 1);
				}
			}
			
			if(map.get(i) == 0) {
				if( i != n && map.get(i + 1) == 2) {
					map.put(i, map.get(i) + 1);
					map.put(i + 1, map.get(i + 1) -1);
				}else if(i != 1 && map.get(i - 1) == 2 ) {
					map.put(i, map.get(i) + 1);
					map.put(i + 1, map.get(i - 1) - 1);
					
				}
			}
		
		}
						
		System.out.println(map.toString());
		
		return answer;
	 }
	 
	 public static void main(String[] args) {
		 
		 int [] lost = new int[] {2, 5, 8};
		 int [] reserve = new int [] {3, 4, 6};
		 int n = 10;
		 
		solution(n, lost, reserve);
	}
}
