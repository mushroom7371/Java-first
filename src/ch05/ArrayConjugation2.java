package ch05;

import java.util.Arrays;

public class ArrayConjugation2 {
	public static void main(String[] args) {
		int [] shuffle1 = new int [10];
		int temp;
		
		for(int i = 0; i < shuffle1.length; i++) {
			shuffle1[i] = i;
		}// 배열초기화 0~9
		
		for(int i = 0; i < shuffle1.length; i++) {
			int n = (int)(Math.random() * 10);
			//번지수를 저장할 변수를 임의로 선언한다.
			
			temp = shuffle1[i];
			shuffle1[i] = shuffle1[n];
			shuffle1[n] = temp;
			//중복값이 생길것 같지만 사실은 번지수의 값들을 치환을 통하여 바꾼것이기 때문에 중복발생은 없다.
		}
		System.out.println(Arrays.toString(shuffle1));
		
		//위의 셔플과정을 통한 로또번호 추첨
		int []	lotto = new int[45];
		int ran;
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		
		for(int i = 0; i < 6; i++) {
			int n = (int)(Math.random() * 45);
			
			ran = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = ran;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + ",");
		}
	}
}
