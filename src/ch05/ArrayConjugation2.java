package ch05;

import java.util.Arrays;

public class ArrayConjugation2 {
	public static void main(String[] args) {
		int [] shuffle1 = new int [10];
		int temp;
		
		for(int i = 0; i < shuffle1.length; i++) {
			shuffle1[i] = i;
		}// �迭�ʱ�ȭ 0~9
		
		for(int i = 0; i < shuffle1.length; i++) {
			int n = (int)(Math.random() * 10);
			//�������� ������ ������ ���Ƿ� �����Ѵ�.
			
			temp = shuffle1[i];
			shuffle1[i] = shuffle1[n];
			shuffle1[n] = temp;
			//�ߺ����� ����� ������ ����� �������� ������ ġȯ�� ���Ͽ� �ٲ۰��̱� ������ �ߺ��߻��� ����.
		}
		System.out.println(Arrays.toString(shuffle1));
		
		//���� ���ð����� ���� �ζǹ�ȣ ��÷
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
