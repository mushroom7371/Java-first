package certificate;

class Section014_facto {
	//재귀함수가 아닌 팩토리얼 1! +...+ 10! 까지의 합
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		int sum = 1;	//1항은 건너뛰므로 1로 설정
		
		do {
			i++;
			j *= i;
			sum += j;
		}while(i < 10);
	
		System.out.println(sum);
	}

}
