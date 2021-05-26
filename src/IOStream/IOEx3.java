package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx3 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		//byte[] Ÿ���� ���������� �����ϰ� ���� {}, null, ũ��4 �� �迭�� �����Ͽ� �ּҰ��� ������.
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		//yteArrayIn(Out)putStream Ÿ���� ���������� �����ϰ� null ������ �ʱ�ȭ
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		//������ ���������� Ÿ�Կ� �´� ��ü�� �����Ͽ� �ּҰ��� �����Ͽ���.(input�� �Ű������� inSrc�� �޾Ƽ� ��ü�� ����)
		
		
		System.out.println("input : " + Arrays.toString(inSrc));
		//input�� ������ ����ϵ� inSrc�� ����Ű�� �迭�� ���ڿ��� �ٲ� ���
		
		try {	//while������ ���ܰ� �߻��� �� �ֱ⿡ try/catch �������� ���εξ���.
			while(input.available() > 0) {	//available()�޼���� ���� ���� �� �ִ� ����Ʈ�� ��ȯ�ϴµ� ���ǽ� ���� �ǹ̴� ������ �ִ� ����Ʈ�� �ִٸ�� ������ ����� ��´�.
				input.read(temp);	//input�� ����� �迭�� ������ temp�� ���������� �����Ѵ�.
				output.write(temp);	//temp�� ����� �迭�� ������ output�� �����Ѵ�.
				//System.out.println("temp : " + Arrays.toString(temp));
				
				outSrc = output.toByteArray();	//null ������ ������ outSrc�� output�� �����͸� �迭�� �ٲپ� �ּҰ��� �����Ͽ���.
				printArrays(temp, outSrc);	//�ϴܿ� ������ �޼��带 ���Ͽ� �迭�� ���ڿ��� ����Ѵ�.
				//temp�� ���̰� 4�̹Ƿ� �ݺ� ����� 0~9 ������ 10���� ���ڰ� 4�� �������� temp�� ����ǰ�, 4�� output�� �߰��� �ȴ�.
				//������ ������ temp�� ��� ������ ���� 8,9���� ������ ���� �ƴ϶� 8,9,6,7, �� ����� �Ǵµ�
				//�̴� temp�� ������ �ݺ����� ���� ���°��� �ƴ϶� ������ ���̱⿡ ������ 4,5,6,7�� ���ڸ��� ���� �Ǵ� ���̴�.
				
				//�̸� �ذ��ϱ� ���ؼ��� input.read(temp); output.write(temp);�� ������ 
				//int len = input.read(temp); output.write(temp, 0, len); ���� �ٲپ� �����Ͱ� ������������ ���̸� ������ �־� write()�� �Ű������� �־��ָ� �ȴ�.
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	static void printArrays(byte [] temp, byte [] outSrc) {	//static �޼���� �޸𸮿� Ŭ������ �ö󰥶� ����Ǿ� ��ü�� ���� ���� ����� �����ϴ�.
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}
