package Practice;

import java.util.*;

class FlowEx4Divide {
	public static void main(String[] args) { 
		int score = 0;
		char grade = ' ';
		score = inputMethod(score);
		outputMethod(score,grade);
	}

	static int inputMethod(int score) {

		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환

		return score;
	}

	static void outputMethod(int score,char grade){

		if (score >= 90) {         // score가 90점 보다 같거나 크면 A학점
			grade = 'A';             
		} else if (score >=80) {   // score가 80점 보다 같거나 크면 B학점 
			grade = 'B'; 
		} else if (score >=70) {   // score가 70점 보다 같거나 크면 C학점 
			grade = 'C'; 
		} else {                   // 나머지는 D학점
			grade = 'D'; 
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}
	/*
		int score  = 0;   // 점수를 저장하기 위한 변수
		char grade =' ';  // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

		inputMethod()

		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환

		outputMethod()

		if (score >= 90) {         // score가 90점 보다 같거나 크면 A학점
			 grade = 'A';             
		} else if (score >=80) {   // score가 80점 보다 같거나 크면 B학점 
			 grade = 'B'; 
		} else if (score >=70) {   // score가 70점 보다 같거나 크면 C학점 
			 grade = 'C'; 
		} else {                   // 나머지는 D학점
			 grade = 'D'; 
		}

		System.out.println("당신의 학점은 "+ grade +"입니다."); 
	 */
}

