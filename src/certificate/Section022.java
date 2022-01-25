package certificate;

import java.util.Scanner;

class Section022 {
	//진수 변환 10진수 -> 2진수
	public static void main(String[] args) {
		System.out.print("변환할 10진수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int b, bb, c, mok, nmg, i;
		//b = 입력받은 10진수, bb = 10진수 출력용 변수, c = 배열의 위치를 지정할 변수, mok = 몫, nmg = 나머지, i = 배열 출력시 위치
		int a[] = new int[10];
		//변환 될 2진수가 담길 배열을 선언
		
		b = sc.nextInt();
		bb = b;
		//입력받은 수를 bb에 저장한다.
		c = -1;
		//배열의 위치는 0번지부터 시작하기에 초기에 -1로 저장하고 하단의 do-while 문장 시작시 ++연산자로 0으로 설정
		do
		{
			c++;
			mok = b / 2;
			//2진법으로 변환하려 하기에 2로 나눴다. int타입이므로 소수점은 자동으로 버려진다.
			nmg = b - mok * 2;
			//나머지를 구하기 위해ㅣ 10진수에서 몫*2을 하여 뺀다.
			a[c] = nmg;
			//배열의 0번지에 나머지를 저장한다.
			b = mok;
			//이후 반복을위해 몫을 다시 변수b에 저장한다.
		} while (mok != 0);	
		//몫이 0이 아니라면 아직 변환이 덜되었기에 다시 do문장으로 올라가 반복 한다.
		System.out.printf("십진수 %d 는 2진수로 ", bb);
		for (i = c; i >= 0; i--)
			System.out.printf("%d", a[i]);
		System.out.println(" 입니다.");
		sc.close();
	}

}
