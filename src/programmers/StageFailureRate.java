package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class StageFailureRate {
	private int [] solution(int N, int [] stages) {
		int [] answer = {};
		StringBuffer sb = new StringBuffer();
		HashMap hm = new HashMap();
		
		int cnt = 0;
		int player = stages.length;
		
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < stages.length; j++) {
				if(stages[j] == i) {
					cnt++;
				}
				
				if(cnt == 0) {
					hm.put(i, 0);
				}else {
					hm.put(i, failureRate(cnt, player));					
				}
				
				player -= cnt;
				cnt = 0;
			}
		}
		
		List<Entry<Integer, Integer>> entryList = new ArrayList<Entry<Integer, Integer>>(hm.entrySet());
		entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
		
		for(int i = 0; i < entryList.size(); i++) {
			
		}
		
		return answer;
	}
	
	public double failureRate(int notClear, int stagePlayer) {
		return (double)notClear/stagePlayer;
	}
}
