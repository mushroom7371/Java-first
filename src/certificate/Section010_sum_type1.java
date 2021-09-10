package certificate;

class Section010_sum_type1 {
	//스위치 변수를 이용한 1-2+3-4...+99-100합 구하기
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		boolean sw = true;	//+-를 구별하기 위해 참거짓만 저장되는 논리변수 선언
		
		do {
			i++;	//반복을 돌면서 1씩 증가된다.
			if(sw) {
				sum += i;
				
				sw = false;	//한번 양수면, 한번 음수가 되도록 변경
			}else {
				sum -= i;
				
				sw = true;
			}
		}while(i < 100);
		
		System.out.println(sum);
	}

}
