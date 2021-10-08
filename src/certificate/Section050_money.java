package certificate;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Section050_money {
	//우리나라 화폐의 종류별 매수 계산... 커밋로그 꼬임 롤백 어케하징... 복구 완료 git 너무 어려움
	
	//static 상수와 내부 클래스를 선언하여 객체 생성없이 클래스가 메모리에 적재되면 사용가능(단, 내부 클래스는 클래스이기 때문에 객체를 만들고 참조변수로 가리켜야됨)
	static final int LENGTH = 10;	//상수로 선언하여 변하지 않도록 설정했다.
	static class member {	//내부 클래스
		String n;	//이름이 저장될 변수
		int p;		//출장비가 저장될 변수
		int [] pm = new int[10];	//개인별 출장비 지급액에 대한 화폐단위별 매수를 기억하는 배열
	}
	
	public static void main(String[] args) throws IOException {	//입출력 처리시 예외 처리를 넘기지 않으면 오류가 발생한다.
		File file = new File("money_data.txt");	//참조변수 file에 해당 파일의 경로를 담는다.
//		File file = new File("C:\\eclipse\\workspace\\JavaStudy\\Java-first\\money_data.txt");
		
		Scanner sc = new Scanner(new FileReader(file));
		//Scanner 타입의 참노변수 sc를 선언하고 여기에 FileReader를 사용하여 참조변수 file이 가리키는 객체, 즉 money_data.txt 파일로부터 읽어오도록 한다.

		member data = new member();	//static 클래스로 부터 객체를 생성하여 참조변수가 가리키도록 함
		int [] tm = new int[10];	//각 화폐 단위별 전체 화폐 매수를 기억하는 배열
		
		int k, t, m, sw;
		//k = 화폐 매수를 계산하거나 출력할 때 사용, t = 화폐 단위별 매수를 계산할 금액, m = 화폐 단위, sw = 화폐 단위 구분 스위치변수
		System.out.printf("\t\t\t\t출장비 지급표\n");
		System.out.printf("성명 출장비지급액      오만      일만      오천     일천      오백     일백      오십      일십       오         일\n");
		
		for (k = 0; k <= LENGTH - 1; k++)
			tm[k] = data.pm[k] = 0;
		data.n = sc.next();
		data.p = sc.nextInt();
		
		while (true) {
			t = data.p;	//남은 화폐의 단위를 구하기위해 최초로 출장비를 저장
			m = 50000;	//화폐의 단위, 우리나라 최고 화폐는 5만원으로 이를 이용하여 2과 5로 나눠 모든 지폐의 단위를 확인할수있다
			sw = 1;	//2 또는 5로 나눌지에 대한 스위치 변수
			
			//첫시행을 기준으로 주석처리 이후의 반복은 실제로 작성하면 로직 이해 가능
			for (k = 0; k <= LENGTH - 1; k++) {	//배열의 길이를 10으로 설정하였기에 0번지 부터 9번지까지 반복
				data.pm[k] = t / m;	//출장비를 5만원으로 나눠 몫으로 5만원 지폐의 갯수를 저장 int 타입의 특성상 나머지는 버려진다.
				t -= data.pm[k] * m;	//출장비를 5만원권 * 몫으로 하여 재설정
				if (sw == 1) {	//스위치 변수가 1이라면
					m /= 5;	//5만원권을 5만원으로 나눠 1만원권이 되는데 이는 두번째로 높은 화폐단위이다.
					sw = 0;	//이후 스위치 변수를 0으로 설정
				}
				else {	//스위치 변수가 0이 아니면
					m /= 2;	//화폐의 단위를 2로 나누게 되는데 이는 5천원권이 되며 이는 3번째로 높은 화폐단위가 된다.
					sw = 1;	//화폐의 단위를 바꿨기에 다시 스위치 변수를 1로 설정한다.
				}
			}
			
			System.out.printf("%s %d", data.n, data.p);
			
			for (k = 0; k <= LENGTH - 1; k++) {
				System.out.printf("%5d", data.pm[k]);
				tm[k] += data.pm[k];
			}
			
			System.out.printf("\n");
			
			if(!sc.hasNext()) break;	//해당 로직은 while문의 종료 지점을 표현하며 txt파일로 부터 이후의 데이터가 없다면 종료하겠다는 의미
			
			data.n = sc.next();	//데이터가 남아있다면 해당 데이터는 txt파일의 이름, 즉 next()메서드로 받은 string값을 받는다
			data.p = sc.nextInt();	//마찬가지로 int값을 받으므로 이는 출장비가 된다.
		}
		
		System.out.printf("전체 화폐 매수        ");	//최종 합산 지폐수
		for (k = 0; k <= LENGTH - 1; k++)
			System.out.printf("%5d", tm[k]);
		sc.close();
	}

}
