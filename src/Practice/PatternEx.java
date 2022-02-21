package Practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternEx {
	public static void main(String [] k) {
		
		System.out.println("이름을 입력하여 주세요.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		PatternEx p = new PatternEx();
		
		p.hangulCheck(name);
		
	}
	
	public boolean hangulCheck(String name){
		String reg = "^[가-?]*$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(name);
		boolean b = m.matches();
			if(b) {
				System.out.println("입력하신 이름 : " + name + " 은/는 한글 입니다.");
			}
			else {
				System.out.println("입력하신 이름 : " + name + " 은/는 한글이 아닙니다.");
			}
		return b;
	}
	
}
