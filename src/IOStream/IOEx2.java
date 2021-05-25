package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		//byte Ÿ���� �迭�� ����Ű�� ���������� ���� �����ϰ� {}, null, ����10�� �迭���� ���� �ּҸ� ����Ű�� �Ѵ�.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//����Ʈ �迭�� ������� �ϴµ� ����ϴ� ��Ʈ�� Ÿ���� ���������� �����ϰ� null�� �ʱ�ȭ
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		//���� ��ü�� �����ϰ� �ϳ��� �Ű������� inSrc�� �Ѱ��ش�.
		
		input.read(temp, 0, inSrc.length);	//input�� read()�޼���� temp�� ����Ű�� �迭�� �������, �Ű������� ���� inSrc�� 0���� �����ͺ���, inSrc�迭�� ���̸�ŭ�� �����Ѵ�.
		output.write(temp, 5, 5);	//output�� write()�޼���� output�� ����Ű�� ��ü�� temp�迭��, 5��° �����ͺ���, 5�� ���̸�ŭ�� �����͸� �����Ѵ�.
		
		outSrc = output.toByteArray();
		//outSrc�� ����Ű�� byte �迭�� output ��Ʈ���� ������ �迭�� �����Ѵ�.
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		//���簡 �� ���� ����� ���
		
	}
}
