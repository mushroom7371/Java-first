package programmers;

import java.util.Arrays;
import java.util.Collections;

//���� �������� ����
class IntSort {
	private long solution(long n) {
        long answer = 0;
        
        String num = String.valueOf(n);	//long Ÿ���� ���ڰ��� String Ÿ������ �ٲپ� �ش�.
        String [] arr = new String [num.length()];	//num�� ���� ������ ũ�⸦ ������ String Ÿ�� �迭�� �����ϰ� �������� arr�� �迭�� ����Ű���� �Ѵ�.
        
        for(int i = 0; i < arr.length; i++) {	//0���� ���� �迭�� ũ�⸸ŭ 1�� ���� �ϸ鼭 �ݺ�
        	arr[i] = String.valueOf(num.charAt(i));	//�迭�� �� ������ �´� num�� �����͸� �����Ѵ�.
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        //java.util.Arrays Ŭ�������� �����ϴ� sort() �޼��带 �̿��Ͽ� �����ϵ�, �ٽ� java.util.Collections Ŭ�������� �����ϴ� reverseOrder()�޼��带 ������ ������������ �Ѵ�.
        num = "";	//long Ÿ���� ������ ������ ������ �ǹǷ� String Ÿ���� �� ����Ѵ�.
        
        for(int i = 0; i < arr.length; i++) {
        	num += arr[i];	//���ڿ��� ��������.
        }
        
        answer = Long.parseLong(num);	//�ٽ� long Ÿ������ ��ȯ �Ͽ��ش�.
        
        return answer;
    }
}
