package programmers;

import java.util.Arrays;

//전화번호 목록
class PhoneNumList {
	private boolean solution(String [] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);	//배열에 담긴 데이터 정렬
		
		for(int i = 0; i < phone_book.length -1; i++) {	//비교 대상이 앞, 뒤 데이터 이므로 전체 길이 -1 까지 반복
			if(phone_book[i+1].startsWith(phone_book[i])) {	//startsWith() 메서드를 통하여 뒤의 데이터가 이전 데이터로 부터 시작 한다면
				answer = false;	//정답은 false 가 된다.
			}
		}

		return answer;
	}
}
