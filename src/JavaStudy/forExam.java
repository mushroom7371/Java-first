package JavaStudy;

public class forExam {
	public static void main(String args []) {
		int total = 0;	//정수 타입의 변수 total을 선언하고 0으로 값을 초기화
		
		for(int i = 0; i <= 100; i++) {
			//초기화, 조건식, 증감식을 기준으로 반복문이 실행된다
			if(i % 2 == 0) {
				//if조건문으로 i를 2로 나눠서 생긴 나머지가 0일 경우를 의미 즉 짝수이다.
				continue;
				//조건문으로 짝수값이 나올경우 continue를 통해 반복문으로 다시 올라간다
				//즉 짝수일때는 밑으로 내려가지 않게 되어 밑으로 내려가는 수는 홀수가 된다.
			}
			total = total + i;	//위의 continue로 인하여 홀수값이 더해진다
//			if(i == 50) {
//				break;	//continue와는 다르게 break는 if조건이 만족하게 되면 밑으로 내려간다.
//			}
		}
		System.out.println(total);
	}
}
