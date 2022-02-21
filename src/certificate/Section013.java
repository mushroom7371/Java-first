package certificate;

class Section013 {
	//수열 1+2+4+7+11+16+...의 20번째 합구하기
	public static void main(String[] args) {
		int i = 0;	//이 변수는 항에 더할 값을 저장함
		int j = 1;	//첫 시작은 1로 함(실제 항이 될것)
		int sum = 1;	//각항을 저장할 변수
		
		do {
			i++;
			j += i;
			sum += j;
		}while(i < 19);
		
		System.out.println(sum);
	}

}
