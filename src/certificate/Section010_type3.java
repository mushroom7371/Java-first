package certificate;

class Section010_type3 {
	//부호가 바뀌는 항의 곱구하기 (-1)*2*(-3)*...*100
	public static void main(String[] args) {
		int i = 0;
		double j = 1;	//결과의 크기가 크기에 double타입으로 선언
		
		do {
			i++;	//처음엔 항이 1로 설정됨
			
			if(i % 2 == 0) {	//짝수라면
				j *= i;	//부호 변경없이 곱한다.
			}else {	//홀수라면	
				j *= i*(-1);	//-1을 곱해 음수로 만들어 곱한다.
				
			}
		}	while(i < 100);
		
		System.out.printf("%11.4e", j);
	}
}
