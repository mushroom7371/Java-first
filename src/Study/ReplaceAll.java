package Study;

import java.util.Scanner;

public class ReplaceAll {
	public static void main(String[] args) {
		//�Է¹��� ���ڿ��� ���ڸ� ����ϴ� ���
		String str;
		
		System.out.print("���ڸ� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		str = str.replaceAll("[^0-9]", "");
		//String Ŭ�������� �����ϴ� replaceAll() �޼���� ���Խ��� �̿��Ͽ� �����̿��� ���ڸ� �����Ѵ�.
		
		System.out.println(str);
		
	}
}
