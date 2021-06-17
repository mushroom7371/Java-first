package AlgorithmStudy;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {	//static 메서드로 클래스가 메모리에 올라갈때 생성된다.
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		//정수형 변수 t를 선언하여 매개변수로 받은 해당 배열의 번지수의 값을 바꾼다.
	}
	
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n; i++) 
			for(int j = n - 1; j > i ; j-- ) 
				if(a[j - 1] > a[j])
					swap(a, j-1,j);
		//반복문을 활용하여 a배열의 j-1 번지수가 j 번지수의 값보다 크다면 swap()메서드를 활용하여 값을 치환하는 작업을 실행한다.
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
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
