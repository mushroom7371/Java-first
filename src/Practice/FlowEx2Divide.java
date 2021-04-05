package Practice;

import java.util.*; // Scanner클래스를 사용하기 위해 추가

class FlowEx2Divide {
	public static void main(String[] args) {
		int num = 0;
		num = inputMethod(num);
		outputMethod(num);

	}

		static int inputMethod(int num) {
		System.out.print("숫자를 하나 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);		
		return num;
		}
		
		static void outputMethod(int num){
		if(num==0) {
			System.out.println("입력하신 숫자는 0입니다.");	
		}

		if(num!=0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");		
			System.out.println("입력하신 숫자는 "+ num +"입니다.");
		}
}
