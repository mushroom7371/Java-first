package certificate;

class Section036_merge {
	//데이터 병합	두 배열의 데이터 합치기 0은 제외 중복은 하나로
	static int i, j, k;	//클래스 변수 선언 메모리에 클래스가 적재될때 생성, 인스턴스 없이 사용가능
	//i = 배열 a의 번지수를 저장할 변수, j = 배열 b의 번지수를 저장할 변수, k = 배열 c의 번지수를 저장할 변수
	
	public static void main(String[] args) {
		int a[] = { 2,3,5,8,9,10,12,13,0,0 };
		int b[] = { 1,3,5,6,0,0,0,0,0,0 };
		int c[] = new int[20];
		//병합할 배열 선언 및 데이터 초기화
		
		i = 0;
		j = 0;
		k = -1;
		while (true) {
			k++;
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
				if (a[i] == 0)
					BB(b, c);
			}
			else if (a[i] == b[j]) {
				c[k] = a[i];
				i++;
				j++;
				if (a[i] == 0)
					BB(b, c);
				else if (b[j] == 0)
					CC(a, c);
			}
			else {
				c[k] = b[j];
				j++;
				if (b[j] == 0)
					CC(a, c);
			}
		}
	}
	
	//클래스 메서드 선언 메모리에 클래스가 적재될때 생성, 인스턴스 없이 사용가능
	static void BB(int b[], int c[]) {	//매개변수로 배열의 주소값을 가지고 반환값은 없다.
		if(b[j] == 0)	//참조변수 b가 가리키는 배열 j번지의 데이터가 0이라면
			DD(c);	//클래스 메서드 DD를 호출하고 참조변수 c를 인자값으로 넘긴다.
		do {	//위의 조건이 참이 아니라면 번지를 저장한 변수(k, j)의 값을 증가시켜 하단의 작업을 실시함
			k++;	//k의 값을 1 증가시킨다.
			c[k] = b[j];	//c배열의 k번지에 b배열의 j번지의 데이터를 저장한다.
			j++;	//j의 값을 1 증가시킨다.
		} while (b[j] != 0);	//b가 가리키는 배열의 j번지 데이터가 0이 아닐때 까지 반복
		DD(c);	//클래스 메서드 DD를 호출하고 참조변수 c를 인자값으로 넘긴다.
	}
	
	//위의 BB() 메서드와 동일한 로직
	static void CC(int a[], int c[]) {
		do {
			k++;
			c[k] = a[i];
			i++;
		} while (a[i] != 0);
		DD(c);
	}
	
	//k의 값을 1증가 시킨 후, 참조변수 c가 가리키는 배열의 k번지의 데이터를 0으로 저장하고 종료한다.
	static void DD(int c[]) {
		k++;
		c[k] = 0;
		System.exit(0);
	}

}
