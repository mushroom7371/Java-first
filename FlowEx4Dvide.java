import java.util.*;
public class FlowEx4Dvide {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		score = inputMethod(score);
		grade = hakjumMethod(score);
		
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	}
		static int inputMethod(int score) {
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
		return score;
		}
		
		static char hakjumMethod(int score) {
		char grade = ' ';
		if(score >= 90) {
			grade = 'A';
		}	else if(score >=80) {
			grade = 'B';
		}	else if(score >=70) {
			grade = 'C';
		}	else {
			grade = 'D';
		}
		return grade;
	}
}


