package ch07;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.Math.*;

public class Import_StaticImport {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		//java.text.SimpleDateFormat date = new java.text.SimpleDateFormat()�� ���� ���� �ʴ� ������ ��ܿ� import�� ���Ͽ� �������� ����
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		System.out.println("random = " + random());
		//Math.random()�� ���� ��� �ϳ� Ŭ������ import �� �� static���� �Ͽ��⿡ ����ȭ �� �� �ִ�.
		//���������� import static java.lang.System.out;�� import �� �ÿ� out.println()���� ����� �� �ִ�.
	}
}
