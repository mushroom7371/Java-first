package Practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternEx {
	public static void main(String [] k) {
		
		System.out.println("ÀÌ¸§À» ÀÔ·ÂÇÏ¿© ÁÖ¼¼¿ä.");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		PatternEx p = new PatternEx();
		
		p.hangulCheck(name);
		
	}
	
	public boolean hangulCheck(String name){
		String reg = "^[°¡-ÆR]*$";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(name);
		boolean b = m.matches();
			if(b) {
				System.out.println("ÀÔ·ÂÇÏ½Å ÀÌ¸§ : " + name + " Àº/´Â ÇÑ±Û ÀÔ´Ï´Ù.");
			}
			else {
				System.out.println("ÀÔ·ÂÇÏ½Å ÀÌ¸§ : " + name + " Àº/´Â ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.");
			}
		return b;
	}
	
}
