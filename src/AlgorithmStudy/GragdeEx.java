package AlgorithmStudy;

import java.util.Scanner;

public class GragdeEx {
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		
		do {
			
			System.out.print("0������ 100�� ������ ������ �Է��� �ּ���. : ");
			grade = sc.nextInt();
			
		}while(!(grade > 0 && grade <= 100));
			if(grade >= 90 && grade <= 100) {
				System.out.println(grade + "���� A ���� �Դϴ�.");
			}else if(grade >= 80 && grade <90) {
				System.out.println(grade + "���� B ���� �Դϴ�.");
			}else if(grade >= 70 && grade <80) {
				System.out.println(grade + "���� C ���� �Դϴ�.");
			}else if(grade >= 60 && grade < 70) {
				System.out.println(grade + "���� D ���� �Դϴ�.");
			}else {
				System.out.println(grade + "���� F ���� �Դϴ�.");
			}
	}
}
