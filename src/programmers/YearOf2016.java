package programmers;

//2016년
public class YearOf2016 {
	private String solution(int a, int b) {
		String answer = "";
		int count = 0;	//한달 일수를 30일로 고정하였기에 31일, 윤년인 29일의 날을 더하거나 뺄 변수
		int days = 0;	//a 달까지의 b일까지 전부 더하여 저장할 변수
		
		for(int i = 1; i < a; i++) {	//1월부터 a월 전까지 반복
			if(a == 1) {	//a로 들어온 값이 1월이라면 count를 셀 필요없이 반복을 빠져나간다.
				break;
			}
			
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {	//조건으로 기재한 달은 한달 31일 이므로
				count++;	//count를 1 더한다.
			}else if( i == 2) {	//2월이라면 윤년기준 29일 이므로
				count--;	//count를 1 뺀다.
			}
		}

		if(a == 1) {	//1월이라면 총 일수는 b가 된다.
			days = b;
		}else {	//해당 일 까지의 모든 합을 구한다.
			days = (a - 1)*30 + b + count;	//한달의 평균일수인 30을 직전 달로 곱한 후 해당 일을 더한다. count 로 31일, 29일을 컨트롤 한다.
		}
		
		if(days % 7 == 3) {	//1월 1일은 금요일이므로 이를 참고하여 요일을 구한다.
			answer = "SUN";
		}else if(days % 7 == 4) {
			answer = "MON";
		}else if(days % 7 == 5) {
			answer = "TUE";
		}else if(days % 7 == 6) {
			answer = "WED";
		}else if(days % 7 == 0) {
			answer = "THU";
		}else if(days % 7 == 1) {
			answer = "FRI";
		}else if(days % 7 == 2) {
			answer = "SAT";
		}
		
		return answer;
    }
}
