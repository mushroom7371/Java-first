package Practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternEx {
	public static void main(String [] k) {
		
		System.out.println("�̸��� �Է��Ͽ� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		PatternEx p = new PatternEx();
		
		p.hangulCheck(name);
		
	}
	
	public boolean hangulCheck(String name){
		String reg = "^[��-�R]*$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(name);
		boolean b = m.matches();
			if(b) {
				System.out.println("�Է��Ͻ� �̸� : " + name + " ��/�� �ѱ� �Դϴ�.");
			}
			else {
				System.out.println("�Է��Ͻ� �̸� : " + name + " ��/�� �ѱ��� �ƴմϴ�.");
			}
		return b;
	}
	
}
