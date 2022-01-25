package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.Math.*;

public class Import_StaticImport {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		//java.text.SimpleDateFormat date = new java.text.SimpleDateFormat()와 같이 쓰지 않는 이유는 상단에 import를 통하여 명시해줬기 때문
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		System.out.println("random = " + random());
		//Math.random()과 같이 써야 하나 클래스를 import 할 때 static으로 하였기에 간략화 할 수 있다.
		//마찬가지로 import static java.lang.System.out;을 import 할 시엔 out.println()으로 사용할 수 있다.
	}
}
