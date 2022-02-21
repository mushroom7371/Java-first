package certificate;

import java.util.Scanner;

class Section027_nearby7 {
	//7과 가장 가까운 수 찾기
	
	static final int FIND = 7;	//7과 가까운 수를 찾기위해 선언한 변수 고정값이므로 상수로 선언함. 또한 static을 통하여 클래스가 메모리에 올라갈때 최초 1번 선언됨
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, L, m = 0;
		//i = 입력받은 자료의 번지, j = 7과 비교 대상의 차이 값 중 최소값, k = a배열의 위치를 지정, L = 7과 비교 대상의 차이값을 저장, m = 7과 가장 가까운 값
		int a[] = new int[10];
		//입력받은 숫자 10개가 저장될 배열
		
		i = -1;	//배열은 0부터 시작하므로 초기값이 -1이다.
		
		System.out.println("1의자리 숫자 10개를 임의로 입력하세요.");
		
		do
		{
			i++;
			a[i] = sc.nextInt();	//키보드로 부터 입력받은 숫자가 a배열의 각가의 번지에 저장됨
		} while (i < 9);	//0~9까지 반복이됨	i++이 후위 연산자이므로 -1일때 0번지, 8일때 9번지가 된다.
		
		j = 9;	//최솟값을 저장할 변수를 9로 초기화 하였다. 1의 자리중 제일 큰수는 9이므로 어떠한 변수가 와도 9보다 작거나 같기 때문에 초기 설정을 함
		
		for (k = 0; k <= 9; k++) {
			
			if (a[k] >= FIND)	//제일 가까운수를 구하기 위해서는 뺀 절대값이 작아야 한다. 절대값을 구하는 알고리즘으로 if문을 이용해 기준수보다 클때 작을때로 나눴다.
				L = a[k] - FIND;
			else
				L = FIND - a[k];
			
			if (L <= j)	//뺀 값이 최솟값보다 작거나 같다면
			{
				j = L;	//최솟값은 뺀 차이 값으로 설정하고
				m = a[k];	//그 배열의 데이터를 7과 가장 가까운 수로 설정한다.
			}
			
		}
		System.out.printf("%d", m);
		
		sc.close();
	}

}
