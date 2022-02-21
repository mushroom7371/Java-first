package AlgorithmStudy;

import java.util.Scanner;

public class DayOfYear {
	static int [][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	//평년과 윤년을 확인하기 위해 다차원 배열을 생성하여 초기화 하였음.
	//[0]~[1]번지의 [0]~[11]번지에 매 달의 일수를 입력하였음.
	//static으로 인하여 메모리가 클래스에 적재될때 배열이 생성된다.
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		//year을 4로 나눈 나머지가 0 이면서 동시에 year을 100으로 나눈 나머지가 0이 아닌경우 와
		//또는 year을 400 으로 나눈 나머지가 0인 경우면 1을 아니면 0을 반환한다.
	}
	
	static int dayOfYear(int y, int m , int d) {
		int days = d;	//일수를 저장하기 위한 변수 선언 및 매개변수로 받은 값으로 초기화
		
		for(int i = 1; i < m; i++)	//1에서 매개변수로 받은 m의 값 이전까지 1씩 증가하면서 반복, 그 달의 일수는 이미 d로 받았기 때문에 m을 -1만큼만 반복한다.
			days = days + mdays[isLeap(y)][i - 1];
		//days에 일수를 저장하는데 먼저 isLeap()메서드로 해당 년도가 윤년인지 평년인지 확인후 해당하는 년의 일자수를 기준으로 시작하고
		//for 문을 통하여 1월 부터 입력받은 달의 이전까지의 월별 일자를 더하는 작업을 실시한다.
		return days;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);	//키보드로부터 입력받은 값을 데이터로 처리하기 위해 Scanner 클래스로 부터 객체를 생성하였다.
		int retry;	//다시 시작하기 위한 정수형 변수를 선언 초기화를 하지 않아 값이 0인 상태이다.
		
		System.out.println("그 해의 경과 일수를 구합니다.");
		
		do {// do while 문장으로 최소 1번은 do{}안의 내용을 실행하게 된다.
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.print("월 : "); int month = sc.nextInt();
			System.out.print("일 : "); int day = sc.nextInt();
			//해당 날짜를 입력하여 변수에 저장한다.
			
			System.out.printf("그 해 %d 일째 입니다./n", dayOfYear(year, month, day));
			//dayOfYear() 메서드를 통하여 키보드로 입력 받은 데이터를 일로 반환하여 출력한다.
			
			System.out.print("한 번 더 할까요? (1. 예 / 2.아니오) : ");
			retry = sc.nextInt();
			
		}while(retry == 1);
		// retry가 1이면 반복을 다시 실행하고 아니면 실행을 마친다.
	}
}
