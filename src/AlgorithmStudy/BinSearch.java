package AlgorithmStudy;

import java.util.Scanner;

class BinSearch {
	//binary search(이진 검색)이란 마치 술게임의 업,다운 게임과 비슷하다
	static int binSearch(int [] a, int n, int key)	{	//static 메서드로 클래스가 메모리에 적재될때 최초1번 생성됨(객체 없이 사용가능), 인자값으로 3가지의 변수를 가진다.
		int pl = 0;			//검색 범위의 첫번째 인덱스
		int pr = n - 1;		//검색 범위의 마지막 인덱스
		
		do {	//조건에 만족하기 전까지 반복을 시행한다.
			int pc = (pl + pr) / 2;	//중간 인덱스
			if(a[pc] == key) {		//인자로 들어온 참조변수 a가 가리키는 배열의 중간 번지수의 값이 key와 같다면
				return pc;			//그 중간 인덱스를 반환함(한번에 맞춤)
			}else if(a[pc] < key) {	//key 값보다 중간값이 작다면
				pl = pc + 1;		//검색 범위를(첫번째 인덱스를) 중간 값보다 1 증가시켜 중간값 이후의 값을 검색함(검색범위를 뒤쪽 절반으로 좁힌다.)
			}else {					//key 값보다 중간값이 크다면
				pr = pc - 1;		//검색 범위를(마지막 인덱스를) 중간 값보다 1 감소시켜 중간값 이전의 값을 검색함(검색범위를 앞쪽 절반으로 좁힌다.)
			}
		}while(pl <= pr);			//첫번째 인덱스가 마지막 인덱스가 같거나 작다면 반복을 중단한다.
		
		return -1;					//검색 실패시 -1을 반환함
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");	//배열의 크기를 입력받은 수로 지정한다.
		int num = sc.nextInt();
		int [] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();	//배열의 첫번째 번지의 값을 입력
		
		for(int i = 1; i < num; i++) {	//배열의 2번째 번지부터 배열의 크기 전까지 반복
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();	//해당 번지수의 값을 지정함
			}while(x[i] < x[i-1]);		//이전 번지수의 값보다 입력한 값이 작으면 다시 반복
		}
		
		System.out.print("검색 할 값 : ");
		int ky = sc.nextInt();	//찾을 값
		
		int idx = binSearch(x, num, ky);	//위의 static 메서드를 호출하여 로직을 실행함
		
		if(idx == -1) {	//반환값이 -1이라면 해당하는 요소가 없다.
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky + "은/는 x[" + idx + "]에 있습니다.");	//아니라면 해당 요소값은 idx번지에 있다
		}
	}

}
