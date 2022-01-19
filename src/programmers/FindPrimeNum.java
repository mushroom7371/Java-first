package programmers;

import java.util.HashSet;
import java.util.Set;

//소수찾기(완전탐색)
class FindPrimeNum {
	boolean [] visit;	//이미 사용한 숫자를 다시 사용하지 못하도록 판단하기 위한 배열
	char [] arr;
	Set<Integer> set = new HashSet<Integer>();
	
	public boolean isPrime(int n) {	//소수인지 판단하기 위한 메서드
		if(n == 1 || n == 0) {	//매개변수로 들어온 숫자가 0 또는 1이면 소수가 아니다.
			return false;
		}
		
		for(int i = 2; i < n; i++) {	//주어진 숫자까지 2부터 1씩 증가면서 반복
			if(n % i == 0) {	//주어진 숫자를 i로 나눴을때 나머지가 0이라면 소수가 아니다.
				return false;
			}
		}
		
		return true;	//그 이외의 경우는 1과 자기 자신만으로 나눠떨어지는 수이므로 소수이다.
	}
	
	public int charsToInt(char [] arr, int length) {	//문자를 int 타입으로 변환하기 위한 메서드
		StringBuilder sb = new StringBuilder();	//숫자를 채워 넣을 것이므로 생성 및 선언
		
		for(int i = 0; i < length; i++) {	//arr이 가리키는 배열의 데이터를 sb에 순서대로 추가하여준다.
			sb.append(arr[i]);
		}
		
		return Integer.parseInt(sb.toString());	//문자열인 sb를 숫자로 변형하여 반환한다.
	}
	
	public void dfs(int level, int length, String numbers) {	//탐색을 위한 메서드
		if(level == length) {
			int num = charsToInt(arr, length);
			if(isPrime(num)) {	//소수라면
				set.add(num);	//set에 해당 숫자를 저장한다.
			}
		}else {
			for(int i = 0; i < numbers.length(); i++) {	//String 문자열의 길이만큼 1씩 증가면서 반복
				if(!visit[i]) {	//해당 번지수가 참이 아니라면, 즉 이미 사용하지 않은 숫자라면
					visit[i] = true;	//사용한 숫자로 바꿔준다.
					arr[level] = numbers.charAt(i);	//arr의 level 번지에 numbers의 i번지의 문자를 저장한다.
					dfs(level + 1, length, numbers);	//level을 1증가 시킨 후 다시 dfs를 호출한다.
					visit[i] = false;	//사용하지 않은 숫자로 바꿔준다.
				}
			}
		}
	}
	
	public int solution(String numbers) {
		visit = new boolean[numbers.length()];
		arr = new char[numbers.length()];
		
		for(int i = 1; i <= numbers.length(); i++) {
			dfs(0, i, numbers);
		}
		
		return set.size();
    }
}
