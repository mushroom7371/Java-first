package AlgorithmStudy;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = 0;
		int com = (int)(Math.random()*3) + 1;
		String suser;
		String scom = null;
		
		if(com == 1 ) {
			scom = "가위";
		}else if(com == 2) {
			scom = "바위";
		}else if(com == 3) {
			scom = "보";
		}
				
		do {
			System.out.print("가위, 바위, 보 중 하나를 입력해 주세요. ");
			suser = sc.next();
			
			if(suser.equals("가위")) {
				user = 1;
			}else if(suser.equals("바위")) {
				user = 2;
			}else if(suser.equals("보")) {
				user = 3;
			}
			
		}while(!(suser.equals("가위") || suser.equals("바위") || suser.equals("보")));
			System.out.println("컴퓨터는 " + scom + " 입니다.");
		
		if(user == com) {
			System.out.println("비겼습니다.");
		}else if((user - com) == 1 || (user - com) == -2 ) {
			System.out.println("당신이 이겼습니다.");
		}else if((user - com) == -1 || (user - com) == 2) {
			System.out.println("당신이 졌습니다.");
		}
		
	}

}
