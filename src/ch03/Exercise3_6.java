package ch03;

public class Exercise3_6 {

	/*
	출제일 : 20210204
	내용 : 연습문제 num 값보다 크면서 가까운 10의 배수에서 num값을 뺀 나머지 구하기
	제출자 : 박준화
	*/
	
	public static void main(String[] args) {
		int num = 24;
		System.out.println((num/10+1)*10-num);

	}

}
