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
			scom = "����";
		}else if(com == 2) {
			scom = "����";
		}else if(com == 3) {
			scom = "��";
		}
				
		do {
			System.out.print("����, ����, �� �� �ϳ��� �Է��� �ּ���. ");
			suser = sc.next();
			
			if(suser.equals("����")) {
				user = 1;
			}else if(suser.equals("����")) {
				user = 2;
			}else if(suser.equals("��")) {
				user = 3;
			}
			
		}while(!(suser.equals("����") || suser.equals("����") || suser.equals("��")));
			System.out.println("��ǻ�ʹ� " + scom + " �Դϴ�.");
		
		if(user == com) {
			System.out.println("�����ϴ�.");
		}else if((user - com) == 1 || (user - com) == -2 ) {
			System.out.println("����� �̰���ϴ�.");
		}else if((user - com) == -1 || (user - com) == 2) {
			System.out.println("����� �����ϴ�.");
		}
		
	}

}
