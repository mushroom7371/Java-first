package Practice;

import java.util.*;

class SortDivide{

	public static void main(String[] args) {
		int [] arr1 = new int [10];
		int [] arr2 = new int [10];
		int [] arr3 = new int [10];
		
		randomMethod(arr1,arr2);
		sortMethod(arr1,arr2);
		//conterMethod();
	}
		
		static void randomMethod(int [] arr1, int [] arr2) {
			for(int i = 0; i < arr1.length; i++) {
				arr1[i] = (int)(Math.random() * 10);
				//System.out.printf("%d ", arr1[i]); // arr1 랜덤 출력 확인용
			}
			for(int i = 0; i < arr2.length; i++) {
				arr2[i] = (int)(Math.random() * 10);
				//System.out.printf("%d ", arr2[i]); // arr2 랜덤 출력 확인용
			}
		} //randomMethod 끝
		
		static void sortMethod(int [] arr1, int [] arr2) {
			for(int i = 0; i < arr1.length-1; i++) {
				boolean changed = false;
				
				for(int j = 0; j < arr1.length-1-i; j++) {
					if(arr1[j] > arr1[j+1]) {
						int tmp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = tmp;
						changed = true;
					}
				}
				if(!changed) break;
				
				for(int k = 0; k < arr1.length; k++)
					System.out.print(arr1[k]);
				System.out.println();
			}
		} //sortMethod 끝
	}

