package ch05;

public class ArrayConjugation1 {
	public static void main(String [] args) {
		int sum = 0;
		float avg;
		
		int [] score = {100, 82, 49, 59, 52, 75};
		
		for(int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		
		avg = sum / (float)score.length;
		//����� ���ϱ� ���ؼ��� int���� �������� ���� ���� float������ �ٲ�� ��(����ȯ �ǽ�)
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		int [] num = {97, 88, 12, 6, 24, 77, 99, 204};
		
		int min = num[0];
		int max = num[0];
		//�ִ�, �ּҰ��� ���ϱ� ���� �ʱⰪ
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max) {	//max�� ���� ū ���� �ǹ��ϱ⿡ �� �迭 �������� �����Ͱ� max���� ũ�� �̸� max������ ������
				max = num[i];
			}else if(num[i] < min) {	//min�� ���� ���� ���� �ǹ��ϱ⿡ �� �迭 �������� �����Ͱ� min���� ������ �̸� min ������ ����
				min = num[i];
			}			
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
