package programmers;

//소수 만들기
class PrimePlus {
	private int solution(int[] nums) {
		int answer = 0;
        
		//nums에 담긴 정수 3개를 더하기
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; i < nums.length; j++) {
				for(int k = j + 1; k < nums.length; k++) {
					int n = nums[i] + nums[j] + nums[k];
					if(PrimeNum(n)){	//더한 값을 소수 판정을 하여 참이라면
						answer++;		//갯수를 증가 시킨다.
					}
				}
			}
		}

		return answer;
	}
 
	 private boolean PrimeNum(int num) {	//소수 판별 메서드
		for(int i = 2; i < num; i++) {		//소수는 1과 자기자신을 제외 한 수로 나눌수 없다
			if(num % i == 0) {	//나뉘면 거짓을 반환
				return false;			
			}
		}
	 	return true;
	}
 
}
