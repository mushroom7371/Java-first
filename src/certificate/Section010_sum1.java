package certificate;

class Section010_sum1 {
	//do-while문을 이용한 1~99 홀수 합 구하기
	public static void main(String[] args) {
		int i = -1;	//do 문장에서 첫항이 1이 되게 하기 위함
		int sum = 0;
		
		do {
			i += 2;
			sum += i;
		}while(i < 99);
		
		System.out.println(sum);
	}

}
