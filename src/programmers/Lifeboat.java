package programmers;

import java.util.Arrays;

//구명보트
class Lifeboat {
	private int solution(int[] people, int limit) {
		int answer = 0;
		int min = 0;	//몸무게가 제일 적은사람
		
		Arrays.sort(people);	//정렬
		
		for(int i = people.length -1; i >= min; i--) {	//가장 무거운 사람부터 가장 가벼운 사람까지 반복 실시
			if(people[i] + people[min] > limit) {	//무거운 사람과 가벼운 사람의 몸무게 합이 구명보트의 제한보다 크다면
				answer++;	//가장 무거운 사람만 나간다.
			}else {	//아니라면 두명이 나간다.
				min++;	//반복문의 조건이 다음 마른사람으로 변경된다.
				answer++;
			}
		}
		
		return answer;
	}
}
