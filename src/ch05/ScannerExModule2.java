package ch05;

import java.util.*;    // Scanner�� ����ϱ� ���� �߰�
//String �Ķ���� ������
class ScannerExModule2 { 
	public static void main(String[] args) { 
		String[] input= new String[1];//��ü�迭
		input[0]= new String();//��ü�迭�� �ν��Ͻ� �ּ� ����
		int num=0;	
		num = inputMethod(input,num);
		System.out.println("input="+input[0]+" num="+(num+1));
		outputMethod(input[0], num);
	
	} 
	
	static int inputMethod(String[] input, int num) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		input[0] = scanner.nextLine();
		num = Integer.parseInt(input[0]);
		return num;
		//outputMethod();
	}
	
	static void outputMethod(String input, int num) {
		
		System.out.println("�Է³��� :"+ input);
		System.out.printf("num=%d%n", num);
		
	}
}
