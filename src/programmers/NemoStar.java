package programmers;

import java.util.Scanner;

//직사각형 별찍기
class NemoStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {	//세로만큼 반복
			for(int j = 0; j < a; j++) {	//가로만큼 반복
				System.out.print("*");	//별을 찍는다
			}
			System.out.println();	//줄바꿈
		}
	}
}
