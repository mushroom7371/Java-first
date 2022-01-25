package AlgorithmStudy;

import java.util.Scanner;

public class GragdeEx {
	
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		
		do {
			
			System.out.print("0점에서 100점 사이의 점수를 입력해 주세요. : ");
			grade = sc.nextInt();
			
		}while(!(grade > 0 && grade <= 100));
			if(grade >= 90 && grade <= 100) {
				System.out.println(grade + "점은 A 학점 입니다.");
			}else if(grade >= 80 && grade <90) {
				System.out.println(grade + "점은 B 학점 입니다.");
			}else if(grade >= 70 && grade <80) {
				System.out.println(grade + "점은 C 학점 입니다.");
			}else if(grade >= 60 && grade < 70) {
				System.out.println(grade + "점은 D 학점 입니다.");
			}else {
				System.out.println(grade + "점은 F 학점 입니다.");
			}
	}
}
