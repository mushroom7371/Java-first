package programmers;

//다음 큰 숫자
class NextLargestNumber {
	private int solution(int n) {
		int answer = 0;
		int count = 0;	//주어진 값을 2진수로 바꾼뒤 1의 갯수를 카운트 할 변수
		String num = Integer.toBinaryString(n);	//2진수로 변환 후 String 타입으로 저장
		
		for(int i = 0; i < num.length(); i++) {	//String 타입의 길이만큼 1씩 증가하면서 반복
			if(num.charAt(i) == '1') {	//해당 번지의 값이 1이라면
				count++;	//카운트를 증가
			}
		}
		
		for(int i = n + 1; i < 1000000; i++) {	//문제에서 주어진 범위까지 1씩 증가하면서 반복
			int largestCount = 0;	//그 다음 큰 수의 1의 갯수를 담는 변수
			String largestNum = Integer.toBinaryString(i);	//마찬가지로 String 타입으로 저장
			
			for(int j = 0; j < largestNum.length(); j++) {	//비교할 값의 크기만큼 반복
				if(largestNum.charAt(j) == '1') {	//해당 번지의 값이 1이라면
					largestCount++;	// 해당 숫자의 카운트를 증가
				}
			}
			
			if(count == largestCount) {	//2진수의 1의 갯수가 같다면,
				answer = Integer.valueOf(largestNum, 2);	//다시 String 값의 2진수를 10진수로 변환 후 int타입으로 변환 한다.
				break;	//일치하면 반복을 종료
			}
		}

		return answer;
	}
}
