package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DivisorNum {
	private int [] solution(int [] arr, int divisor) {
		int [] answer = {};
		List<Integer> list = new ArrayList<Integer>();	//?????⑥댁?? ?瑜??댁 ArrayList 媛泥?
		
		for(int i = 0; i < arr.length; i++) {	//二쇱댁? 諛곗댁 ?ш린留??1??利媛?硫댁 諛蹂?
			if(arr[i] % divisor == 0) {	//?대?踰吏? ?? ?곗댄곌? divisor濡 ?? ?⑥댁??ㅻ㈃
				list.add(arr[i]);	//?대??곗댄곕? ArrayList? ?대??
			}
		}
		
		Collections.sort(list);	//???
		
		if(list.size() == 0) {	//list? ?곗댄곌? ?닿꺼?吏 ??ㅻ㈃,
			answer = new int []	{-1};	//int 諛곗댁 -1? ?댁 諛?
		}else {	//?곗댄곌? ?닿꺼??ㅻ㈃,
			answer = new int [list.size()];	//李몄“蹂? answer? ?濡 ??깊 list? ?ш린? 媛? 諛곗댁 媛由ыㅻ濡 ?怨,
			for(int i = 0; i < list.size(); i++) {	//洹?諛곗댁 list? ?닿릿 ?곗댄곕? ?李⑥?쇰? ??ν??
				answer[i] = list.get(i);
			}
		}
		
		return answer;
	}
}
