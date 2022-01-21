package programmers;

//하샤드 수
class HarshadNumber {
	private boolean solution(int x) {
		boolean answer = true;
		String numToString = String.valueOf(x);	//자리수의 합을 구하기위해 String 타입으로 변환
		int num = 0;
		
		for(int i = 0; i < numToString.length(); i++) {	//String은 사실 char 배열의 묶음 이므로 각 번지가 자리수가 된다.
			num += Character.getNumericValue(numToString.charAt(i));	//해당 자리의 숫자를 더하여 int 타입으로 변환 후 변수에 대입
		}
		
		if(x % num != 0) {	//주어진 값을 자리수의 합으로 나눴을때 나머지가 0이 아니면 하샤드 수가 아니다.
			answer = false;
		}
		
		return answer;
	}
}