package Practice;

import java.util.*; // ScannerŬ������ ����ϱ� ���� �߰�

class FlowEx2Divide {
	public static void main(String[] args) {
		int num = 0;
		num = inputMethod(num);
		outputMethod(num);

	}

		static int inputMethod(int num) {
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		num = Integer.parseInt(input);		
		return num;
		}
		
		static void outputMethod(int num){
		if(num==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");	
		}

		if(num!=0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");		
			System.out.println("�Է��Ͻ� ���ڴ� "+ num +"�Դϴ�.");
		}
}
