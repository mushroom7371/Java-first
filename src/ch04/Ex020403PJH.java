package ch04;

class Ex020403PJH	{
	//10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x)	{
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
		
	}
	
	public static void main(String[] args)	{
		
		/*
		dec 8 -> 7로 변화
		실행결과 이유 : 변경전에는 10진수 숫자 8을 대상으로 쉬프트 연산한 결과를 각각 2진수와 10진수로 나타내었고
					 2진수는 공백을 0으로 채워 32개 자리수로 표시함. 7로 변경한 결과와의 차이는 자리수
					 차이. 기존 8의 경우 2진수로 표현시 4자리 인 1000에서 7로 변경후 2진수는 111로
					 한칸씩 줄어든것을 확인할 수 있음
				     			
		*/
		
		int dec = 7;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();
		
		dec = -7;
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d >> %d = %4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d << %d = %4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.println();
		
		dec = 7;
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d >> %2d = %4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));
		
	}
}

