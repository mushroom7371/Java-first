package certificate;

class Section059_99 {
	//구구단 do while문	(반복 횟수를 알고있는데 while문을 쓸 이유가 있나 싶다.)
	public static void main(String[] args) {
		int b, c, i;	//b = 기준이 되는 숫자, c = 곱해질 숫자, i = 배열의 위치
		int [] a = new int[9];	//곱셈 결과가 저장될 배열
		System.out.printf("****구구단****\n");
		b = 0;
		do {	//무조건 한번 실행되도록 함.
			b++;	//기준 단을 0으로 초기화 하였기에 ++연산자로 1부터 시작하도록 설정
			c = 0;	//곱해질 숫자는 하단의 반복으로 1부터 시작될 예정
			do {
				c++;
				a[c - 1] = b*c;	//배열에 저장될 위치는 0번지부터 시작이므로 c에서 1이전의 숫자가 된다
			} while (c < 9);	//곱할 숫자는 9까지이므로 조건이 만족할때 까지 반복
			for (i = 1; i <= 9; i++)	//출력을 위한 반복문
				System.out.printf("%dX%d=%d\n", b, i, a[i - 1]);
		} while (b < 9);	//기준 단 또한 9까지

	}

}
