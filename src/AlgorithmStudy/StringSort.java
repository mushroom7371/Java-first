package AlgorithmStudy;

import java.util.Arrays;

public class StringSort {
	public static void main(String[] args) {
		String str = "sdfh398hsdg0";
		
		char [] array = str.toCharArray();
		//������ ���� char �迭�� String Ÿ���� ���ڿ��� �ѱ��ھ� �ɰ��� �Է��Ͽ��ش�.
		Arrays.sort(array);
		//Arrays Ŭ�������� �����ϴ� sort()�޼��忡 ���� char �迭�� ���������� �Ű������� �Է��ϸ�
		//���� ������ ����(� ������ ��ȯ�Ǵ����� �߸�... �����ؾߵ�) ������� ��ȯ�Ͽ� ������ char Ÿ���� ���������� ����ش�.
		String result = new String(array);
		//�ش� ������ Ȯ���ϱ� ���� Stirng ��ü�� ��Ƶд�.
		
		System.out.println(result);

	}
}
