package certificate;

class Section012 {
	//수열 -(1/2) + (2/3) - (3/4) +... -(99/100) 구하기
	public static void main(String[] args) {
		double i = 0;
		double j = 0;
		
		do {
			i++;
			
			if(i % 2 == 1) {	//i가 홀수라면
				j -= (i/(i+1));	//해당 항을 뺀다.
			}else {				//i가 짝수라면
				j += (i/(i+1));	//해당 항을 더한다.
			}
		}while(i < 99);
		
		System.out.printf("%f", j);
	}

}
