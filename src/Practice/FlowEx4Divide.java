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

		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		return score;
	}

	static void outputMethod(int score,char grade){

		if (score >= 90) {         // score�� 90�� ���� ���ų� ũ�� A����
			grade = 'A';             
		} else if (score >=80) {   // score�� 80�� ���� ���ų� ũ�� B���� 
			grade = 'B'; 
		} else if (score >=70) {   // score�� 70�� ���� ���ų� ũ�� C���� 
			grade = 'C'; 
		} else {                   // �������� D����
			grade = 'D'; 
		}
		System.out.println("����� ������ " + grade + " �Դϴ�.");
	}
	/*
		int score  = 0;   // ������ �����ϱ� ���� ����
		char grade =' ';  // ������ �����ϱ� ���� ����. �������� �ʱ�ȭ�Ѵ�.

		inputMethod()

		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);   // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		outputMethod()

		if (score >= 90) {         // score�� 90�� ���� ���ų� ũ�� A����
			 grade = 'A';             
		} else if (score >=80) {   // score�� 80�� ���� ���ų� ũ�� B���� 
			 grade = 'B'; 
		} else if (score >=70) {   // score�� 70�� ���� ���ų� ũ�� C���� 
			 grade = 'C'; 
		} else {                   // �������� D����
			 grade = 'D'; 
		}

		System.out.println("����� ������ "+ grade +"�Դϴ�."); 
	 */
}

