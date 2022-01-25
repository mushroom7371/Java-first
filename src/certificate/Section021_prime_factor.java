package certificate;

import java.util.Scanner;

class Section021_prime_factor {
	//소인수 분해하기
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int b, c, d, e, mok = 0, nmg;
		//b = 입력받을 수, c = 소인수를 저장할 배열의 위치, d = 제수가 저장될 변수 2부터 시작, e = 입력받은 수의 제곱근이 저장될 변수, mok = 몫, nmg = 나머지
		
		int a[] = new int[100];
		b = sc.nextInt();
		
		c = -1;	//배열의 번지수는 0번지 부터 시작이므로 -1로 초기화, while문에서 증가연산자로 인하여 0번지로 시작됨.
		d = 2;	//나누는 수는 2부터 시작
		while (true)
		{
			e = (int)Math.sqrt(b);	//Math클래스의 sqrt()메서드로 제곱근을 구하고, 형변환 하여 변수에 저장
			while (true)
			{
				if (d > e)
				{
					d = b;
					break;
				}
				
				mok = b / d;	//몫과 나머지를 구하는 설명은 생략
				nmg = b - mok*d;
				
				if (nmg == 0)
					break;
				else
					d++;
			}
			
			c++;
			a[c] = d;
			if (b == d)
				break;
			b = mok;
		}
		for (int i = 0; i <= c; i++)
			System.out.printf("%d ", a[i]);
		sc.close();
	}
}
