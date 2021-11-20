package AlgorithmStudy;

import java.util.Scanner;

//재귀 호출을 이용한 하노이의 탑 공부
class TowersOfHanoi {
	//static 메서드로 클래스가 메모리에 올라갈때 생성되므로 객체 생성없이 사용가능
	static void move(int no, int x, int y) {
		//no = 원반 개수, x = 시작 기둥의 번호, y = 목표 기둥의 번호
		//메인 메서드에서 호출하는 move() 메서드의 기둥은 시작 1번기둥, 중간 2번기둥, 마지막 3번기둥 총 3개로 고정한다.
		//원반의 크기는 정수로 나타내며 정수의 크기가 커질수록 원반의 크기도 큰것으로 간주한다.
		//맨 밑의 가장 큰 원반 하나와 그 위의 나머지 원반'들'을 그룹으로 묶어서 옮길 수 있다.
		
		if(no > 1) {
			move(no -1, x, 6 - x - y);
			//기둥은 총 1기둥, 2기둥, 3기둥이 있으며 어느 때라도 중간의 기둥은 6 - 시작기둥 - 목표기둥으로 표현이 가능하다.
		}
		
		System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y +"기둥으로 옮김");
		
		if(no > 1) {
			move(no -1, 6 - x - y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 :");
		int n = sc.nextInt();
		
		move(n, 1, 3);
	}
}
