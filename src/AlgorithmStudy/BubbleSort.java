package AlgorithmStudy;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {	//static 메서드로 클래스가 메모리에 올라갈때 생성된다.
		//버블 소트는 치환을 기본으로 이루어 진다.
		int t = a[idx1];		//int 타입 변수 t에 배열 a의 idx1번지의 데이터를 저장한다.
		a[idx1] = a[idx2];		//배열 a의 idx1 번지의 데이터를 a[idx2]의 데이터로 바꾸고
		a[idx2] = t;			//a[idx2]의 데이터를 t의 데이터로 치환한다.
		//결국 2개의 데이터 값을 바꾸기 위해 임시 변수를 이용하는 셈이다.
	}
	
	//버블정렬 개선1
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {		//0번지부터 인자값으로 받은 n-1 전 까지 1씩 증가하면서 반복한다.
			int exchg = 0;						//교환 횟수를 확인할 변수 반복마다 초기화 된다.
			for(int j = n - 1; j > i ; j-- ) 	//뒷 번지부터 i보다 클때 까지 1씩 감소하면서 반복한다.
				if(a[j - 1] > a[j]) {			//만약 배열a의 j-1번지의 데이터가 j번지의 데이터 보다 크다면 정렬이 되지 않았기에 swap() 메서드를 이용하여 위치를 변경한다.
					swap(a, j-1,j);
					exchg++;					//교환이 발생할 때마다 카운트가 올라간다.
				}
			if(exchg == 0) break;				//교환이 발생하지 않았다면 이미 정렬이 완성된것 이므로 반복을 할 필요가 없다.
		}
		//반복문을 활용하여 a배열의 j-1 번지수가 j 번지수의 값보다 크다면 swap()메서드를 활용하여 값을 치환하는 작업을 실행한다.
	}
	
	//버블정렬 개선2
	static void bubbleSortVer2(int[] a, int n) {
		int k = 0;								//a[k] 보다 앞쪽은 정렬이 끝난 상태, 0으로 초기화 한 이유는 최초 반복시 모든 요소를 확인해야 되기 때문
		while(k < n-1) {						//k는 비교 대상 바로 이전의 번지 이므로 n-1 까지 반복을 조건으로 준다.
			int last = n-1;						//last는 각 패스에서 마지막으로 교환한 두 요소중 오른쪽 요소의 인덱스를 저장할 변수
			for(int j = n-1; j > k; j--)
				if(a[j - 1] > a[j]) {
					swap(a, j-1,j);				//교환할 수가 있다면 교환하고
					last = j;					//비교 요소중 오른쪽의 값을 last에 담는다.
				}
			k = last;							//k에 last를 저장하므로 k이전의 값은 비교하지 않는다.
		}
	}
	
	//단순 선택 정렬(배열의 가장 작은 요소와 정렬하지 않은 부분의 첫 요소를 비교)
	static void selectionSort(int [] a, int n) {
		for(int i = 0; i < n-1; i++) {
			int min = i;						//반복을 통하여 가장 작은 요소의 인덱스를 기록함.
			for(int j = i + 1; j < n; j++)
				if(a[j] < a[min])	//j번지의 데이터가 가장 작은 요소인 a[min]보다 작다면
					min = j;		//작은 요소의 인덱스는 j로 설정한다.
			swap(a, i, min);		//치환을 통하여 값을 바꾼다.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];		//키보드로 입력받은 숫자를 배열의 크기로 설정한다.
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		//요솟수의 크기만큼 반복하여 키보드로 입력받은 값을 배열에 저장한다.
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) 
			System.out.println("x[" + i + "] : " + x[i]);
		//정렬을 마치고 난 후 값을 출력한다.
	}
	
}
