package certificate;

class Section015_fibo {
	//피보나치 합
	public static void main(String[] args) {
		int hap = 2, cnt = 2;	//1항과 2항을 1로 고정했기에 2로 초기화했다.
		int a = 1, b = 1;	//1,2항 선언 및 초기화
		int c;
		
		while(true) {	//break까지 무한 반복
			c = a + b;	//피보나치 수열의 기본
			hap += c;	//합을 저장
			cnt++;		//몇번째 항인지 구하는 변수
			
			if(cnt < 20) {
				a = b;
				b = c;
			}else {
				System.out.println(hap);
				break;
			}
		}
	}
}
