package programmers;

//이상한 문자 만들기
class WeirdMessage {
	private String solution(String s) {
		String answer = "";
		String [] str = s.split("");	//주어진 문자열을 한글자씩 나누어 배열에 저장한다.
		int idx = 0;	//대,소문자 기준이 될 인덱스
		
		for(int i = 0; i < str.length; i++) {	//한글자 씩 나뉘어 담김 배열의 길이만큼 반복
			if((" ").equals(str[i])) {	//i번지의 데이터가 띄어쓰기 라면
				idx = 0;	//인덱스를 0으로 초기화 한다.
			}else {
				if(idx % 2 == 0) {	//인덱스가 짝수라면
					idx++;	//인덱스를 1증가 시킴
					str[i] = str[i].toUpperCase();	//해당 글자를 대문자로 변경
				}else {	//인덱스가 홀수라면
					idx++;	//인덱스를 1증가 시킴
					str[i] = str[i].toLowerCase();	//해당 글자를 소문자로 변경
				}
			}
			answer += str[i];	//반복마다 answer에 해당 글자를 담아둔다
		}
		
		return answer;
	}
}
