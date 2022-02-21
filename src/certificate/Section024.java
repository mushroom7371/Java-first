package certificate;

import java.util.Scanner;

class Section024 {
	//소수점이 포함된 2진수를 10진수로 변환
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, munja;
		double d, e;
		//a = 입력받은 2진수가 저장될 변수, b = 2진수 각자릿수에 대한 10진수의 합계가 저장될 변수
		//c = 2진수 각 자리를 지정해 주는 변수, 2진수가 10자리이므로 c는 1부터 10까지 차례로 변경됨
		//d = 2진수 각 자리의 값이 저장 될 변수
		//e = 2진수 각 자리의 값에 대한 10진수 값이 저장될 변수
		
		a = sc.nextLine();
		double b = 0;
		int c = -1;
		while (true)
		{
			c++;
			if (c <= 9)
			{
				munja = Character.toString(a.charAt(c));
				d = Integer.parseInt(munja);
				e = d * Math.pow(2, 4 - c);
				b += e;
			}
			else
			{
				System.out.printf("%8.5f", b);
				break;
			}
		}
		sc.close();

	}

}
