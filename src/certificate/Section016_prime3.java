package certificate;

import java.util.Scanner;

class Section016_prime3 {
	//제곱근을 이용한 소수 구하기
	public static void main(String[] args) {
		System.out.println("판별할 숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = 2;	//나누는 수는 2부터 시작
		
		while(true) {
			if( j <= Math.sqrt(i)) {	//Math클래스의 sqrt()메서드를 통해 제곱근의 값을 구한다.
				if( i % j == 0) {	//그 제곱근의 값을 나눠 0이 된다면 나누는 수가 존재한다는 것이므로 소수가 아니다.
					System.out.println("소수 아님");
					break;
				}else {	//나눠 떨어지지 않는다면 소수일 가능성이 있으므로 j를 1증가 시킨다.
					j++;
				}
			}else {	//나눠떨어지지 않고 증가 시킨 j의 값이 입력받은 수와 같아진다면 1과 자기자신만으로 나눠지는 것이므로 소수이다.
				System.out.println("소수임");
				break;
			}
		}
	}
}
