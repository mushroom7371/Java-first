package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//실패율
class StageFailureRate {
	private int [] solution(int N, int [] stages) {
		Map<Integer, Double> mp = new HashMap<Integer, Double>();	//해당 스테이지를 키값으로, 실패율을 밸류값으로 저장하기 위해 선언
		int cnt = 0;	//클리어 하지 못한 인원수
		int player = stages.length;	//총 인원수
		
		for(int i = 1; i <= N; i++) {	//스테이지는 1부터 N까지 1씩 증가하면서 담긴다.
			for(int j = 0; j < stages.length; j++) {	//총 인원중에 해당 스테이지를 클리어 한 인원을 구하기 위한 반복
				if(stages[j] == i) {	//해당 인원이 도달한 스테이지와 상위 반복중인 스테이지가 같다면
					cnt++;	//클리어 하지 못한 인원수가 증가한다.
				}
			}
			
			if(cnt == 0) {	//스테이지를 모두 통과했다면
				mp.put(i, 0.0);	//해당 스테이지의 실패율은 0이다.
			}else {
				mp.put(i, cnt/(double)player);	//실패율을 구한다.
				player -= cnt;	//총 인원수에서 클리어 하지 못한 인원을 제외한다.
			}
			cnt = 0;
		}

		List<Entry<Integer, Double>> entryList = new ArrayList<Entry<Integer, Double>>(mp.entrySet());	//Entry타입이 담기는 ArrayList를 생성하고, 각각의 번지에 key, value를 쌍으로 저장한다.
		entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));	//정렬(sort)하되, 밸류값을 기준으로(comparingByValue) 내림차순(reverseOrder)으로 한다.
		
		int [] answer = new int [N];	//실패율이 높은 스테이지 부터 담길 배열
		
		for(int i = 0; i < entryList.size(); i++) {	//entryList의 크기만큼 1씩 증가하면서 반복
			answer[i] = entryList.get(i).getKey();	//해당 번지의 데이터를 entryList의 Key값으로 설정한다.
		}
		
		return answer;
	}
	
}
