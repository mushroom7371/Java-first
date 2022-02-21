package certificate;

class Section010_sum {
	//while문을 이용한 1~100 합구하기
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {
			i++;
			sum += i;
		}while(i < 100);	//while문이 거짓이 되면 반복을 종료한다. 100미만인 이유는 99일때 do문장에서 증가연산자로 100이 되기 때문
		
		System.out.println(sum);
	}

}
