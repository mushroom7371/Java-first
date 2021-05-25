package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
	public static void main(String[] args) {
		byte [] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte [] outSrc = null;
		//byte �迭 Ÿ���� �����ϴ� ���������� �����ϰ� inSrc���� {}; ���� �������� �ʱ�ȭ, output�� null �� �ʱ�ȭ�Ѵ�.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//����Ʈ�迭�� �����͸� ��/��� �ϴµ� ���Ǵ� ��Ʈ�� Ÿ���� ���������� �����ϰ� null�� �ʱ�ȭ �Ѵ�.
		
		input = new ByteArrayInputStream(inSrc);	//�Ű������� inScr�� �޴� ��ü�� �����Ͽ� �ּҸ� ���������� �����Ѵ�.
		output = new ByteArrayOutputStream();	//Ŭ������ ���� �Ű������� ���� ��ü�� �����Ͽ� �ּҸ� ���������� �����Ѵ�.
		
		int data = 0;	//����Ÿ�� ������ ���� �� 0���� �ʱ�ȭ
		
		while((data = input.read()) != -1) {	//�ݺ��� �����Ͽ� ���� data�� input�� read()�޼���� �о�� ���� �ִٸ�( �о�� �����Ͱ� ������ -1�� ��ȯ�Ѵ�.)
			output.write(data);	//�� �����͸� output�� write()�޼��带 ���Ͽ� output�� ����Ű�� ��ü�� �����͸� �����Ѵ�.
		}
		
		outSrc = output.toByteArray();	//output�� ����� ��ü�� Byte �迭�� ��ȯ�Ͽ� outSrc�� ����Ű�� �迭�� ����
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("OutPut Source : " + Arrays.toString(outSrc));
		//���� �������� ����� ������ ����Ѵ�.
	}
}
