package certificate;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Section050_money {
	//우리나라 화폐의 종류별 매수 계산
	
	//static 상수와 내부 클래스를 선언하여 객체 생성없이 클래스가 메모리에 올라가면 바로 사용가능하다.
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
			t = data.p;
			m = 50000;
			sw = 1;
			
			for (k = 0; k <= LENGTH - 1; k++) {
				data.pm[k] = t / m;
				t -= data.pm[k] * m;
				if (sw == 1) {
					m /= 5;
					sw = 0;
				}
				else {
					m /= 2;
					sw = 1;
				}
			}
			
			System.out.printf("%s %d", data.n, data.p);
			
			for (k = 0; k <= LENGTH - 1; k++) {
				System.out.printf("%5d", data.pm[k]);
				tm[k] += data.pm[k];
			}
			
			System.out.printf("\n");
			
			if(!sc.hasNext()) break;
			
			data.n = sc.next();
			data.p = sc.nextInt();
		}
		
		System.out.printf("전체 화폐 매수        ");
		for (k = 0; k <= LENGTH - 1; k++)
			System.out.printf("%5d", tm[k]);
		sc.close();
	}

}
