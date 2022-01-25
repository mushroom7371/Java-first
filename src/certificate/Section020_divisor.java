package certificate;

import java.util.Scanner;

class Section020_divisor {
	//약수 구하기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b, mok, nmg, i;
		//b = 입력한 수, mok = 몫, nmg = 나머지, i = 저장한 배열의 번지
		
		int a[] = new int[100];
		//약수를 저장할 배열
		System.out.print("숫자를 입력하세요. : ");
		b = sc.nextInt();
		
		int c = 0, d = -1;
		//1부터 나눠야 하기 때문에 c의 초기값을 0으로 줌 while문에서 ++을 통해 첫 반복이 1이 된다.
		//마찬가지 해당 데이터를 저장할 배열의 번지, 배열의 0번지 부터 시작하므로 -1로 초기화
		while (true)
		{
			c++;
			if (c <= b)	//약수로 나눌값은 입력한 수보다 클 수 없다.
			{
				mok = b / c;	//int의 특성, 몫을 구할때 나머지를 버리기 때문에 다른 조취가 필요 없음
				nmg = b - mok * c;	//나머지는 입력한 수 - 몫*나눌때의 수
				if (nmg == 0)	//나머지가 0이면 약수이다.
				{
					d++;
					a[d] = c;
				}
			}
			else
			{
				System.out.println("입력한 숫자의 약수는");
				for (i = 0; i <= d; i++)
					System.out.printf("%d ", a[i]);
				break;
			}
		}
		sc.close();
	}
}
