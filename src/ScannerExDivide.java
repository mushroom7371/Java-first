import java.util.*;    // Scanner�� ����ϱ� ���� �߰�

class ScannerExDivide { 
	public static void main(String[] args) {
		inputMethod();
	}
		
		static void inputMethod(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");

		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

		outMethod(input,num);
		//System.out.print("num="+(num+1));  �Է³��� ������ Ȯ��
		}
		
		static void outMethod(String input,int num) {
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
		}
	} 

