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
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n; i++) 			//0번지부터 인자값으로 받은 n까지 1씩 증가하면서 반복한다.
			for(int j = n - 1; j > i ; j-- ) 	//뒷 번지부터 i보다 클때 까지 1씩 감소하면서 반복한다.
				if(a[j - 1] > a[j])				//만약 배열a의 j-1번지의 데이터가 j번지의 데이터 보다 크다면 정렬이 되지 않았기에 swap() 메서드를 이용하여 위치를 변경한다.
					swap(a, j-1,j);
		//반복문을 활용하여 a배열의 j-1 번지수가 j 번지수의 값보다 크다면 swap()메서드를 활용하여 값을 치환하는 작업을 실행한다.
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
