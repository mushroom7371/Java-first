package certificate;

import java.util.Scanner;

public class Section023 {
	//임의의 10진수 -> n진수로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b, c, d, e, f;
		//b = 변환할 진수, c = 입력할 10진수, e = 해당 진수의 각 자리값을 출력할 배열의 번지수
		char a[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F' };
		//16진수를 표현 하기 위해 A~F까지의 문자를 추가함
		
		System.out.print("변환할 진수를 입력해 주세요 : ");
		b = sc.nextInt();
		System.out.print("변한하기 위한 10진수 숫자를 입력하세요 : ");
		c = sc.nextInt();
		
		d = 1;
		while (d <= c)
			d *= b;
		while (true)
		{
			if (d > 1)
				d /= b;
			e = c / d;
			f = c - e * d;
			System.out.printf("%c", a[e]);
			if (d != 1)
				c = f;
			else
				break;
		}
		sc.close();
	}
}
