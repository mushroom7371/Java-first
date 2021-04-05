package ch03;

public class Exercise3_2 {

	/*
	출제일 : 20210204
	내용 : 연습문제 사과를 담을 필요한 바구니 구하기
	제출자 : 박준화
	*/
	
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = ( numOfApples/sizeOfBucket + 1  );
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		

	}

}
