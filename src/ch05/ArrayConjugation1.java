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
		//평균을 구하기 위해서는 int형의 연산으로 인한 값을 float형으로 바꿔야 됨(형변환 실시)
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		int [] num = {97, 88, 12, 6, 24, 77, 99, 204};
		
		int min = num[0];
		int max = num[0];
		//최대, 최소값을 비교하기 위한 초기값
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max) {	//max는 제일 큰 값을 의미하기에 각 배열 번지수의 데이터가 max보다 크면 이를 max값으로 설정함
				max = num[i];
			}else if(num[i] < min) {	//min은 제일 작은 값을 의미하기에 각 배열 번지수의 데이터가 min보다 작으면 이를 min 값으로 설정
				min = num[i];
			}			
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
